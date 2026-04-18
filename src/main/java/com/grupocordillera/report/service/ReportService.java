package com.grupocordillera.report.service;

import com.grupocordillera.report.dto.ReportRequest;
import com.grupocordillera.report.dto.ReportResponse;
import com.grupocordillera.report.model.Report;
import com.grupocordillera.report.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public ReportResponse createReport(ReportRequest request) {

        Report report = new Report();
        report.setTitle(request.getTitle());
        report.setDescription(request.getDescription());
        report.setType(request.getType());
        report.setCreatedAt(LocalDateTime.now());

        Report saved = reportRepository.save(report);

        return mapToResponse(saved);
    }

    public List<ReportResponse> getAll() {
        return reportRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public ReportResponse getById(Long id) {
        Report report = reportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Report no encontrado"));

        return mapToResponse(report);
    }

    private ReportResponse mapToResponse(Report r) {
        return new ReportResponse(
                r.getId(),
                r.getTitle(),
                r.getDescription(),
                r.getType(),
                r.getCreatedAt()
        );
    }
}
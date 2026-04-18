package com.grupocordillera.report.controller;

import com.grupocordillera.report.dto.ReportRequest;
import com.grupocordillera.report.dto.ReportResponse;
import com.grupocordillera.report.service.ReportService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public ReportResponse create(@Valid @RequestBody ReportRequest request) {
        return reportService.createReport(request);
    }

    @GetMapping
    public List<ReportResponse> getAll() {
        return reportService.getAll();
    }

    @GetMapping("/{id}")
    public ReportResponse getById(@PathVariable Long id) {
        return reportService.getById(id);
    }
}
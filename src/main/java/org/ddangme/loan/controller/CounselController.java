package org.ddangme.loan.controller;

import lombok.RequiredArgsConstructor;
import org.ddangme.loan.dto.ResponseDTO;
import org.ddangme.loan.service.CounselService;
import org.springframework.web.bind.annotation.*;

import static org.ddangme.loan.dto.CounselDTO.Request;
import static org.ddangme.loan.dto.CounselDTO.Response;

@RequiredArgsConstructor
@RestController
@RequestMapping("/counsels")
public class CounselController extends AbstractController {

    private final CounselService counselService;

    @PostMapping
    public ResponseDTO<Response> create(@RequestBody Request request) {
        return ok(counselService.create(request));
    }

    @GetMapping("/{counselId}")
    public ResponseDTO<Response> get(@PathVariable Long counselId) {
        return ok(counselService.get(counselId));
    }
}

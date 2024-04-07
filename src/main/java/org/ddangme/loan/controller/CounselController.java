package org.ddangme.loan.controller;

import lombok.RequiredArgsConstructor;
import org.ddangme.loan.dto.CounselDTO;
import org.ddangme.loan.dto.ResponseDTO;
import org.ddangme.loan.service.CounselService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/counsels")
public class CounselController extends AbstractController {

    private final CounselService counselService;

    @PostMapping
    public ResponseDTO<CounselDTO.Response> create(@RequestBody CounselDTO.Request request) {
        return ok(counselService.create(request));
    }
}

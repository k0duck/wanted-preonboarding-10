package wanted.preonboarding.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import wanted.preonboarding.dto.RecruitmentCreateRequest;
import wanted.preonboarding.dto.RecruitmentCreateResponse;
import wanted.preonboarding.service.RecruitmentService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recruitments")
public class RecruitmentController {

    private final RecruitmentService recruitmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecruitmentCreateResponse create(@RequestBody RecruitmentCreateRequest request) {
        return new RecruitmentCreateResponse(recruitmentService.create(request));
    }

}
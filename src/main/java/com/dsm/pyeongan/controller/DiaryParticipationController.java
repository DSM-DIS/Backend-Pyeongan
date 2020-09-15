package com.dsm.pyeongan.controller;

import com.dsm.pyeongan.domains.service.DiaryParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/diary")
public class DiaryParticipationController {

    @Autowired
    private DiaryParticipationService diaryParticipationService;

    @PostMapping("/participation-record")
    public void participate(HttpServletRequest request, String code) {
        String accessToken = request.getHeader("accessToken");
        // accessToken 인증 해야함 :: MSA

        diaryParticipationService.participate(code);
    }
}

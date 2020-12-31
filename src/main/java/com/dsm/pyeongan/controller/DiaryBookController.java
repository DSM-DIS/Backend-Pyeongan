package com.dsm.pyeongan.controller;

import com.dsm.pyeongan.domains.service.DiaryBookService;
import com.dsm.pyeongan.utils.form.CodeRequestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DiaryBookController {

    private DiaryBookService diaryBookService;

    @Autowired
    public DiaryBookController(DiaryBookService diaryBookService) {
        this.diaryBookService = diaryBookService;
    }

    @PostMapping("/diary-book/participant")
    public void diaryParticipation(HttpServletRequest request, @RequestBody String code) {
        final String userId = request.getHeader("userId");
        diaryBookService.connectingRoom(userId, code);
    }
}

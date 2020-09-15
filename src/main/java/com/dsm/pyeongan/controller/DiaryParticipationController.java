package com.dsm.pyeongan.controller;

import com.dsm.pyeongan.domains.service.DiaryParticipationService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/diary")
@Api(value = "Attendance Controller")
public class DiaryParticipationController {

    private DiaryParticipationService diaryParticipationService;

    @Autowired
    public DiaryParticipationController(DiaryParticipationService diaryParticipationService) {
        this.diaryParticipationService = diaryParticipationService;
    }

    @ApiOperation(value = "일기장 참여", notes = "participation_personnel_list 테이블에 code, User 매칭")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상적인 응답"),
            @ApiResponse(code = 404, message = "인증 실패 또는 code 중복"),
            @ApiResponse(code = 500, message = "500")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", dataType = "string", required = true, value = "Access Token")
    })
    @PostMapping("/participation-record")
    public void participate(@ApiParam(value = "030816", required = true) @RequestParam("code") String code,
                            HttpServletRequest request) {
        String accessToken = request.getHeader("accessToken");
        // accessToken 인증 해야함 :: MSA

        diaryParticipationService.participate(code);
    }
}

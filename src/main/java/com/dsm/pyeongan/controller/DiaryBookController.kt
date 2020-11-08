package com.dsm.pyeongan.controller

import com.dsm.pyeongan.domains.service.DiaryBookService
import com.dsm.pyeongan.utils.form.CodeWrapperRequestForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class DiaryBookController(@Autowired val diaryBookService: DiaryBookService) {

    @GetMapping("/diary-book/participaint")
    fun diaryParticipation(request: HttpServletRequest, @RequestBody code: CodeWrapperRequestForm) {
        val userId: String = request.getHeader("userId")
        return diaryBookService.connectingRoom(id = userId, code = code.code)
    }
}
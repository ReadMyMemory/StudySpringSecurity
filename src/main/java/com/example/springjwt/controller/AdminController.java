package com.example.springjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Web 서버로 동작하는 게 아닌 API 서버로 동작. 따라서 Web 페이지를 리턴하는 게 아닌 객체 데이터나 스트링 데이터를 리턴할 것.
@Controller
@ResponseBody
public class AdminController {

    @GetMapping("/admin")
    public String adminP() {

        return "admin Controller";
    }
}

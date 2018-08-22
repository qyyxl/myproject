package com.yinxunling.one.controller;

import com.yinxunling.one.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class CommonController {
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
    @Autowired
    CommonService commonservice;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String login() {
        return "/login/login";
    }

    @RequestMapping(value = "loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
        String tno = request.getParameter("tno");
        String password = request.getParameter("password");
        logger.info("你输入的用户名为：" + tno);
        logger.info("你输入的密码为：" + password);
        String tname = commonservice.login(tno, password);
        session.setAttribute("tname", tname);
        if (tname == null) {
            return "redirect:/";
        } else {
            return "redirect:/index";
        }
    }

    @RequestMapping("/index")
    public String loginindex() {
        return "/login/test";
    }


}

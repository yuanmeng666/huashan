package com.study.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


/**
 * @author yuanmeng
 * @create 2019-05-23 21:27
 */
@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session){
    if(username!=null && "123456".equals(password)){
        session.setAttribute("loginUser",username);
        return "redirect:/main.html";
     }else{
        model.addAttribute("msg","用户名密码错误");
        return "login";
    }
    }

}

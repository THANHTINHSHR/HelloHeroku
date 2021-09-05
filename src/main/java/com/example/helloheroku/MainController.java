package com.example.helloheroku;

import com.example.helloheroku.model.Demo;
import com.example.helloheroku.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public String showHello(Model model){
        List<Demo> demoList = demoService.getAll();
        model.addAttribute("demoList" , demoList);
        return "hello_heroku";
    }
    @GetMapping("other-page")
    public String showOtherPage(){
        return "other-page";
    }
}

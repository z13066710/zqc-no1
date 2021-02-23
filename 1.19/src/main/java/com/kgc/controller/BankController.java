package com.kgc.controller;
import org.springframework.ui.Model;
import com.kgc.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
    @Autowired
    BankService bankService;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("li", bankService.show());
        return "intdex";
    }
}

package com.mailchimp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControler {

    @GetMapping("/test")

    public String getTestPage(@RequestParam(defaultValue = "some name") String name,
                              @RequestParam(defaultValue = "some descr") String descr, Model model){

        model.addAttribute("name" ,name);
        model.addAttribute("descr" ,descr);
        return "test";
    }
}

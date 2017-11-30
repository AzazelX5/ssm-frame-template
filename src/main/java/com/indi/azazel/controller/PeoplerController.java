package com.indi.azazel.controller;

import com.indi.azazel.bean.Peopler;
import com.indi.azazel.service.PeoplerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeoplerController {
    @Autowired
    private PeoplerService peoplerService;

    @RequestMapping("peopler")
    @ResponseBody
    public Peopler getPeopler(){
        return peoplerService.pep();
    }
}

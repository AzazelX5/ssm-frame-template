package com.indi.azazel.test.service;

import com.indi.azazel.bean.Peopler;
import com.indi.azazel.service.PeoplerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring-mybatis.xml")
public class TestPeoplerService {
    @Autowired
    private PeoplerService peoplerService;
    @Test
    public void testPep(){
        Peopler pep = peoplerService.pep();
        System.out.println(pep);
    }
}

package com.indi.azazel.test.dao;

import com.indi.azazel.bean.Peopler;
import com.indi.azazel.dao.PeoplerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring-mybatis.xml")
public class TestPeoplerDao {
    @Autowired
    private PeoplerDao peoplerDao;
    @Test
    public void testGetPeople(){
        Peopler peopler = peoplerDao.getPeopler();
        System.out.println(peopler);
    }
}

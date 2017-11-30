package com.indi.azazel.service.impl;

import com.indi.azazel.bean.Peopler;
import com.indi.azazel.dao.PeoplerDao;
import com.indi.azazel.service.PeoplerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeoplerImpl implements PeoplerService {
    @Autowired
    private PeoplerDao peoplerDao;
    @Override
    public Peopler pep() {
        return peoplerDao.getPeopler();
    }
}

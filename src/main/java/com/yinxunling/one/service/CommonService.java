package com.yinxunling.one.service;

import com.yinxunling.one.mapper.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommonService {
    private static final Logger logger = LoggerFactory.getLogger(CommonService.class);

    @Autowired
    public Common common;

    public String login(String sno, String password) {
        logger.error("从这里开始登录");
        return common.login(sno, password);
    }
}

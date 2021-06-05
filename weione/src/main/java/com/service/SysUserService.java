package com.service;

import com.dao.SysUserDao;
import com.po.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SysUserService {

   @Autowired
    SysUserDao  sysUserDao;



    public SysUser selectById(Long id){
        return sysUserDao.selectById(id);


    }
    public int UpById(String se){
        return sysUserDao.UpById(se);
    }
}

package com.dao;

import com.po.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserDao {
    /*
  根据id查询用户表
   */
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
     SysUser selectById(Long id);


    @Insert("INSERT INTO sys_user (se) VALUES(#{se})")
    int UpById(@Param("se") String se);
}

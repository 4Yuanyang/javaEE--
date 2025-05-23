package com.xyy.mapper;

import com.xyy.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into tb_user(id, username, password) values(#{id}, #{userName}, #{password})")
    void add(User user);

    @Select("select id, username, password from tb_user where username=#{userName}")
    @ResultMap("userMap")
    User getByName(String userName);
    @Select("select id, username, password from tb_user where id = #{id}")
    User getById(int id);
    @Select("select id, username, password from tb_user where username=#{userName} and password = #{password}")
    @ResultMap("userMap")
    User getByUser(User user);
}

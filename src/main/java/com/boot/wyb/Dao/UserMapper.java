package com.boot.wyb.Dao;

import com.boot.wyb.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> hello()throws Exception;
}

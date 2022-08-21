package com.footohigh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.footohigh.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}

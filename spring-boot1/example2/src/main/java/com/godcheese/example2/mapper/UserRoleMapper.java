package com.godcheese.example2.mapper;

import com.godcheese.example2.mapper.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018/4/5 18:37
 */
@Mapper
@Component
public interface UserRoleMapper {

    List<UserRoleEntity> listByUserId(Long userId);
}

package com.penn.mybatis.mapper;/**
 * @author penn
 * @since 2019/12/11
 */

import com.penn.mybatis.dto.User;

/**
 * @Description
 * @Author penn
 * @Date 2019-12-11
 */
public interface UserMapper {
    /**
     * 通過id查詢用戶
     * @param id 用戶id
     * @return 用戶
     */
    User selectById(int id);

    /**
     * 保存
     * @param user 用戶
     * @return 數量
     */
    int save(User user);
}

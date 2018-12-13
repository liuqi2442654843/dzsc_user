package top.liuqi321.mapper;

import top.liuqi321.bean.T_MALL_USER_ACCOUNT;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.mapper
 * @date : 2018/12/13
 */

public interface LoginMapper {

    public T_MALL_USER_ACCOUNT select_user(T_MALL_USER_ACCOUNT user);

}

package top.liuqi321.server;

import top.liuqi321.bean.T_MALL_USER_ACCOUNT;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.server
 * @date : 2018/12/13
 */
public interface LoginServerInf {
    public String select_user(T_MALL_USER_ACCOUNT user);
}

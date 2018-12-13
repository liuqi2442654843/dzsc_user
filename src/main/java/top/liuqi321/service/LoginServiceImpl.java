package top.liuqi321.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.liuqi321.bean.T_MALL_USER_ACCOUNT;
import top.liuqi321.mapper.LoginMapper;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.service
 * @date : 2018/12/13
 */

@Service
public class LoginServiceImpl implements LoginServiceInf {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public T_MALL_USER_ACCOUNT login(T_MALL_USER_ACCOUNT user) {
        return loginMapper.select_user(user);
    }
}

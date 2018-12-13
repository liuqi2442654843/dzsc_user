package top.liuqi321.server;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import top.liuqi321.bean.T_MALL_USER_ACCOUNT;
import top.liuqi321.mapper.LoginMapper;
import top.liuqi321.service.LoginServiceInf;

import javax.jws.WebService;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.server
 * @date : 2018/12/13
 */

@WebService
public class LoginServerImpl implements LoginServerInf {

    @Autowired
    LoginServiceInf loginServiceInf;
    @Override
    public String select_user(T_MALL_USER_ACCOUNT user) {
        T_MALL_USER_ACCOUNT login = loginServiceInf.login(user);
        Gson gson = new Gson();
        return gson.toJson(login);
    }
}

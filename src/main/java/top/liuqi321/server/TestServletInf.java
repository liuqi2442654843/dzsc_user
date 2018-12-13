package top.liuqi321.server;

import javax.jws.WebService;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.servlet
 * @date : 2018/12/13
 */

@WebService
public interface TestServletInf {
    public String ping(String hello);
}

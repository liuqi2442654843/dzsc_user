package top.liuqi321.server;

/**
 * @author : 刘琦 http://www.liuqi321.top
 * @version : 1.0
 * @description : top.liuqi321.servlet
 * @date : 2018/12/13
 */
public class TestServletImpl implements TestServletInf {

    public String ping(String hello) {
        System.out.println( "接口调用："+hello);
        return "ping";
    }
}

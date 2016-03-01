package cn.starlin.springcxf;

import javax.jws.WebService;

/**
 * 服务接口实现类
 * Created by starlin
 * on 2016/03/01 9:36.
 */
@WebService(endpointInterface = "cn.starlin.springcxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    public String sayHello(String str) {
        System.out.println("syaHello called");
        return "Hello " + str;
    }
}

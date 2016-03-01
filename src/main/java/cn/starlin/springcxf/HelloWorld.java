package cn.starlin.springcxf;

import javax.jws.WebService;

/**
 * 定义服务接口
 * Created by starlin
 * on 2016/03/01 9:34.
 */

@WebService
public interface HelloWorld {
    public String sayHello(String str);
}

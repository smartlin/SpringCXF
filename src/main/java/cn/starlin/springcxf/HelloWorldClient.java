package cn.starlin.springcxf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 客户端
 * Created by starlin
 * on 2016/03/01 10:53.
 */
public class HelloWorldClient {
    public static void main(String args[]) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
        HelloWorld client = (HelloWorld)context.getBean("client");//client需与client-beans.xml中的id一致
        String response = client.sayHello("starlin");
        System.out.println("Response: " + response);
        System.exit(0);

    }
}

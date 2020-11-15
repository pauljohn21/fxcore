package com.moola.fx;


import com.moola.fx.service.mt4.api.MT4;
import com.moola.fx.service.mt4.api.ManagerAPI;
import com.moola.fx.service.mt4.api.config.ConfigDLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class FxApplication implements CommandLineRunner {
    @Autowired
    private ConfigDLL configDLL;


    public static void main(String[] args) {


        SpringApplication.run(FxApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("启动中....");
        ManagerAPI mt4 = new MT4(configDLL.getDll(),configDLL.getApi());
        System.out.println("初始化Manager Api完成");
        int connect = mt4.connect(configDLL.getIp());
        System.out.println("连接服务器Manager Api：" + connect + "\t 描述：" + mt4.getErrorDescription(connect));

        mt4.PingMT4();


    }
}

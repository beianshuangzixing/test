package cy.cc.ccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cc
 * @ate 2019/5/27 16:43
 * @Version 1.0.0
 */
@SpringBootApplication
@RestController
public class ApplicationWeb {
    /**
     * 相关的请求映射路径
     * @return
     */
    @RequestMapping("/aaa")
    public String index(){
        return "sss";
    }

    /**
     * 启动入口sad
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWeb.class,args);
    }
}

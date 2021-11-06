package spiderdocschina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SpiderDocsChinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderDocsChinaApplication.class, args);
    }

}

package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    // private final Logger log = LoggerFactory.getLogger(getClass()); 롬복이 자동으로 넣어줌

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace my log=" + name);

        log.trace("trace log={}", name);


        log.debug("debug log={}", name);
        log.info("info log={}", name); //운영 서버에서는 여기부터 찍음
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }

}

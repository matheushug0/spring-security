package br.com.mh.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

}

@RestController
class HttpController {
    @GetMapping("/public")
    String publicRoute(){
        return """
                <h1>Public Route - you are allowed to access here.</h1>
                """;
    }
}
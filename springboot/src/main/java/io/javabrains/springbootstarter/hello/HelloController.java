package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // tells spring to send to localhost:8080/hello
    // @RequestMapping maps ONLY to the GET method by default.
    // To map to other HTTP Methods, you'll have to specify it in the annotation
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}

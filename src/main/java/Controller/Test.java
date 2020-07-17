package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
@RequestMapping("/hello")
public class Test {

    @GetMapping("/1")
    public void hello(){
        System.out.println("hello word!");
    }

}

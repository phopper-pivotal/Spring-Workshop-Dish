package bootworkshop.pivotal.io;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rhardt on 9/21/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello DISH!";
    }

    @RequestMapping("/greeting")
    public Greeting greet() {
        return new Greeting("Hello", "DISH", true);
    }


}


class Greeting {
    private String message;
    private String greeting;
    private boolean happyToSeeYou;

    public Greeting(String message, String greeting, boolean happyToSeeYou) {
        this.message = message;
        this.greeting = greeting;
        this.happyToSeeYou = happyToSeeYou;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public boolean isHappyToSeeYou() {
        return happyToSeeYou;
    }

    public void setHappyToSeeYou(boolean happyToSeeYou) {
        this.happyToSeeYou = happyToSeeYou;
    }
}
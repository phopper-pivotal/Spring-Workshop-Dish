package bootworkshop.pivotal.io;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by rhardt on 9/21/16.
 */
@ConfigurationProperties(prefix = "greeter.details")
public class GreeterSettings {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package dk.mbang;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ColorService {

    @ConfigProperty(name = "env.color", defaultValue="default")
    String env_color;

    @ConfigProperty(name = "HOSTNAME", defaultValue="default2")
    String env_hostname;


    public String hostName() {
        return System.getenv("HOSTNAME");
    }

    public String defaultColor() {
        return env_color;
    }

    public String greeting(String name) {
        return "hello " + name;
    }

}
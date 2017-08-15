package be.mabi.ohana.jersey;


import be.mabi.ohana.smurf.SmurfResourceBase;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(SmurfResourceBase.class);
    }
}
package com.microservices.limitsservice.configuration;
//This class picks up values from application.properties
//The name has to same as in application.properties

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@ConfigurationProperties("limits-service") // Picks values from application.properties with prefix "limits-service"
@Service
public class Configuration {
    private int minimum, maximum;

    public Configuration(){}

    public Configuration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}

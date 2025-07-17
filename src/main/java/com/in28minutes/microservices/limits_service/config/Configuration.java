package com.in28minutes.microservices.limits_service.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Configuration {

    private int minimum;

    private int maximum;
}

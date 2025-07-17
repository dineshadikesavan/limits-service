package com.in28minutes.microservices.limits_service.beans;

import jdk.jfr.DataAmount;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Limits {

    private int minimum;

    private int maximum;

}

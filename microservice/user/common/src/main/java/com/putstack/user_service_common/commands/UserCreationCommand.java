package com.putstack.user_service_common.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class UserCreationCommand {
    @TargetAggregateIdentifier
    private String userId;
    private String email;
    private String password;
    private String name;
    private int age;
    private String address;
    private String ssn;
}

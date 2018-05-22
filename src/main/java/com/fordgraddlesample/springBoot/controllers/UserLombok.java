package com.fordgraddlesample.springBoot.controllers;

import lombok.*;

import java.util.Date;

@Builder
public class UserLombok {

    int id;
    String name;
    String lastName;
    String email;
    Date dob;
    Boolean active;

}

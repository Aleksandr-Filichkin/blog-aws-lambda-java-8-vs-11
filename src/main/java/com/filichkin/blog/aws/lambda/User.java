package com.filichkin.blog.aws.lambda;

import lombok.Data;

@Data
public class User {
    String id;
    String name;
    String email;
    String phone;
}

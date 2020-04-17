package com.filichkin.blog.aws.lambda;

public interface UserRepository {
    User get(String userId);

    User save(User user);

    boolean delete(String user);
}

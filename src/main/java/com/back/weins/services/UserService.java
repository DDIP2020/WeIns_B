package com.back.weins.services;

import com.back.weins.entity.User;
import java.util.List;

public interface UserService {
    User getByID(Integer id);

    User getByName(String name);

    User getByPhone(String phone);

    List<User> getAll();

    String save(User user);

    String update(User user);

    void delete(Integer id);

    String register(User user);

    User login(String phone, String password);

    void follow_relation(Integer sub, Integer obj, Integer flag);
}

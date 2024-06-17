package ru.yandex.user;

import java.util.List;

interface UserRepository {
    List<User> findAll();
    User save(User user);
}
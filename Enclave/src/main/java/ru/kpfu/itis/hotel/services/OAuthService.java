package ru.kpfu.itis.hotel.services;

import ru.kpfu.itis.hotel.models.User;

public interface OAuthService {
    User vkAuth(String code);
}

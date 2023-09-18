package ru.kpfu.itis.hotel.services;

import ru.kpfu.itis.hotel.models.News;

import java.util.List;

public interface NewsService {
    void save(News entity);

    void delete(News entity);

//    void update(News entity);

    List<News> findByTag(String tagName);

    List<News> getAllNews();
}

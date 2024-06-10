package com.example.TazaaKhabar.service;

import com.example.TazaaKhabar.Response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;
    public NewsResponse getNews(String country, String apiKey) {
        String url = prepareUrl(country,apiKey);
        return restTemplate.getForObject(url,NewsResponse.class);
    }


    private String prepareUrl(String country, String apiKey) {
        return "https://newsapi.org/v2/top-headlines?country="
                +country +"&apiKey=" + apiKey;
    }
}

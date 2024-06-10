package com.example.TazaaKhabar.controller;

import com.example.TazaaKhabar.Response.NewsResponse;
import com.example.TazaaKhabar.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;
    @GetMapping("/get")
    public NewsResponse getNews(@RequestParam("country") String country,
                                @RequestParam("apiKey") String apiKey){

        return newsService.getNews(country,apiKey);
    }
}

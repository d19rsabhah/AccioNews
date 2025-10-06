package com.example.AccioNews.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    String baseUrl = "https://newsapi.org/v2/top-headlines";
    public Object getNewsBySource(String country, String apiKey) {
        String url = prepareUrl(country, apiKey);
        return restTemplate.getForObject(url, Object.class);
    }

    private String prepareUrl(String country, String apiKey) {
        return baseUrl + "?country=" + country + "&apiKey=" + apiKey;
    }
}

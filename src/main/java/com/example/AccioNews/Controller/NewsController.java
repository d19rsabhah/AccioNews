package com.example.AccioNews.Controller;


import com.example.AccioNews.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public Object getNewsBySource(@RequestParam("country") String
                                               country, @RequestParam("apiKey") String apiKey){

        return newsService.getNewsBySource(country, apiKey);

    }
}

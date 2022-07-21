package com.careerdevs.muzick.contollers;

import com.careerdevs.muzick.payloads.ApiResponse.Article;
import com.careerdevs.muzick.payloads.ApiResponse.NewsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private RestTemplate restTemplate;

    // this is a different variation than the env key
    @Value("${muzick.props.apikey}")
    public String apiKey;


    @GetMapping("/test")
    public ResponseEntity<String> testRoute(){
        return new ResponseEntity<>("news Route", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getMusicArticles(){
        // url is a subset of uri (uri is everything- method (http etc) and location

        String url = "https://newsapi.org/v2/everything?&apikey="+ apiKey +"&q=music" ;

        NewsApi response = restTemplate.getForObject(url,NewsApi.class);

////        List<Article> articleList = new ArrayList<>();
//
//        for(Article article : response.getArticles()){
//            if(article.getSourceName().equals("wired")){
//                article.setLikes("hi");
////                article.add(article);
//            }
//        }

        System.out.println(response.getStatus());
        System.out.println(response.getArticles().get(0).getTitle());
        System.out.println(response.getArticles().get(0));

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}

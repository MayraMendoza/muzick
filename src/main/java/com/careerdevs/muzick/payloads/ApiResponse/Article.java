package com.careerdevs.muzick.payloads.ApiResponse;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Article {

    // this is private to article class
    // Article clas will have full access to this class.
    // other classes would not have access to it.

    // this class is only used in reference to article class.
    // part of composition isa relationship?
    private class source{
        private String id;
        private String name;

        public source() {
        }

        public source(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    // these do not have to be in order.
    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;

    public Article() {
    }

    public Article(String source, String author, String title, String description, String url, String urlToImage) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    @JsonIgnore
    public String getSourceName(){
        return source.name;
    }
}

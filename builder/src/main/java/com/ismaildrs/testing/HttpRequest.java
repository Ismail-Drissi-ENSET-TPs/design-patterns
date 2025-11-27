package com.ismaildrs.testing;

import java.util.Map;

public class HttpRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;
    private int timeout;
    private boolean followRedirects;

    public HttpRequest(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
        this.timeout = builder.timeout;
        this.followRedirects = builder.followRedirects;
    }

    @Override
    public String toString(){
        return url + ", " + method;
    }

    public static class Builder {
        private String url;
        private String method;
        private Map<String, String> headers;
        private String body;
        private int timeout;
        private boolean followRedirects;

        public HttpRequest build(){
            return new HttpRequest(this);
        }

        public Builder url(String url){
            this.url = url;
            return this;
        }

        public Builder method(String method){
            this.method = method;
            return this;
        }

        public Builder addHeaders(String header, String value){
            this.headers.put(header, value);
            return this;
        };

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout){
            this.timeout = timeout;
            return this;
        }

        public Builder followRedirects(boolean followRedirects){
            this.followRedirects = followRedirects;
            return this;
        }


    }

}

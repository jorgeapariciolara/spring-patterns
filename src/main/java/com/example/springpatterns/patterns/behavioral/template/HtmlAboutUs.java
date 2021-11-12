package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlAboutUs extends HtmlTemplate{
    @Override
    public String head() {
        return String.format("%s %s %s", head(),body(),render());
    }

    @Override
    public String body() {
        return "Copyright 2021 Principal ";
    }

}

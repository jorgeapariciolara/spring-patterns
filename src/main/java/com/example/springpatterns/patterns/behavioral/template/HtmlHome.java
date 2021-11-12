package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlHome extends HtmlAboutUs {
    @Override
    public String head() {
        return "Página de inicio https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css";
    }

    @Override
    public String body() {
        return "Hola desde Home";
    }

}

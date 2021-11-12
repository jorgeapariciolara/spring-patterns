package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlHome extends HtmlAboutUs {
    @Override
    public String head() {
        return "Pagina de Inicio";
    }

    @Override
    public String body() {
        return "Hola desde home";
    }

}

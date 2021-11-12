package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlAboutUs extends HtmlTemplate{
    @Override
    public String head() {
        return "Nuestro equipo https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css ";
    }

    @Override
    public String body() {
        return " Hola desde Página Nosotros";
    }

}

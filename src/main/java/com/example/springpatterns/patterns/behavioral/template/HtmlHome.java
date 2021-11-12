package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlHome extends HtmlAboutUs {
    @Override
    public String head() {
        return
                "Página de inicio";
                    

    }

    @Override
    public String body() {
        return "Hola desde Home";

    }

}

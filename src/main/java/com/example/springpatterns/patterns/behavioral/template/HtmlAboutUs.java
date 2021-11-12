package com.example.springpatterns.patterns.behavioral.template;

// tipo concreto
public class HtmlAboutUs extends HtmlTemplate{
    @Override
    public String head() {
        return
                "Nuestro equipo";
                    

    }

    @Override
    public String body() {
        return
                 "Hola desde Página Nosotros";

    }

}

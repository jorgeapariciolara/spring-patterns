package com.example.springpatterns.behavioral.observer;

import com.example.springpatterns.patterns.behavioral.observer.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

public class WeatherTest {


    @BeforeEach
    void setUp() {
        System.out.println("Iniciando test de Weather");
    }


    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test de Weather");
    }



    @DisplayName("Comprobando que se añade un observer ")
    @Test
    void addObserverTest(){
        WeatherObserver obs = new Computer();
        Weather weather = new Weather();
        weather.addObserver(obs);
        assertNotNull(weather);

    }

    @DisplayName("Comprobando que se borra el observer")
    @Test
    void removeObserverTest(){
        List<WeatherObserver> observers = new ArrayList<>();
        WeatherObserver obs = new Computer();
        Weather weather = new Weather();
        weather.addObserver(obs);
        assertNotEquals(1, observers.size());
        weather.removeObserver(obs);


    }

    @DisplayName("Comprobando que se cambia el tiempo")
    @Test
    void changeWeatherTest(){

        Weather aemet = new Weather();

        // 2. Se crean los observadores y se añaden a la clase principal para que
        // puedan ser notificados cuando haya un cambio

        // computer
        WeatherObserver computer = new Computer();
        aemet.addObserver(computer);
        // smartphone
        aemet.addObserver(new SmartPhone());

        // Cambio del tiempo --> notifica automáticamente a los observadores
        aemet.changeWeather(WeatherType.CLOUDY);
        aemet.changeWeather(WeatherType.RAINY);
        aemet.changeWeather(WeatherType.SUNNY);

        aemet.removeObserver(computer);
        aemet.changeWeather(WeatherType.SUNNY);




    }






}

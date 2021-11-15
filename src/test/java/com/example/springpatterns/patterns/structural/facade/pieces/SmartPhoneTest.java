package com.example.springpatterns.patterns.structural.facade.pieces;

import com.example.springpatterns.patterns.structural.facade.SmartPhoneFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SmartPhoneTest")
class SmartPhoneTest {
    SmartPhone smartPhone;

    @BeforeEach
    void setUp() {
        List<Sensor> sensorlist = new ArrayList<>();
        smartPhone = SmartPhoneFacade.startSmartPhone();
    }

    @Test
    @DisplayName("Enciende")
    void start() {
        smartPhone.start();
        assertTrue(smartPhone.getOn());
    }

    @Test
    @DisplayName("Apaga")
    void stop() {
        smartPhone.stop();
        assertFalse(smartPhone.getOn());
    }

    @Test
    void setBattery() {
        Battery battery = new Battery();
        smartPhone.setBattery(battery);
        assertEquals(battery,smartPhone.getBattery());
    }

    @Test
    void setCpu() {
        CPU cpu = new CPU();
        smartPhone.setCpu(cpu);
        assertEquals(cpu,smartPhone.getCpu());
    }

    @Test
    void setScreen() {
        Screen screen = new Screen();
        smartPhone.setScreen(screen);
        assertEquals(screen,smartPhone.getScreen());
    }

    @Test
    void setSensors() {
        List<Sensor> sensorlist2 = new ArrayList<>();
        sensorlist2.add(new NFCSensor());
        sensorlist2.add(new GPSSensor());
        smartPhone.setSensors(sensorlist2);
        assertEquals(sensorlist2,smartPhone.getSensors());
    }

    @Test
    void setOn() {
        smartPhone.setOn(false);
        assertFalse(smartPhone.getOn());
    }
}

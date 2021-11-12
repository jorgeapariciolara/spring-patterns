package com.example.springpatterns.behavioral.strategy;

import com.example.springpatterns.patterns.behavioral.strategy.CreditCardStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardStrategyTest {

    @Test
    void CreditCardStrategyClassTest(){
        CreditCardStrategy ccs = new CreditCardStrategy("Name1", "card1", "ccv 1", "Date Expire");
        ccs.setName("Name edit");
        ccs.setCardNumber("card edit");
        ccs.setCvv("ccv edit");
        ccs.setDateOfExpiry("Date edit");

        assertEquals("Name edit", ccs.getName());
        assertEquals("card edit", ccs.getCardNumber());
        assertEquals("ccv edit", ccs.getCvv());
        assertEquals("Date edit", ccs.getDateOfExpiry());

    }
}

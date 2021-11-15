package com.example.springpatterns.patterns.behavioral.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

@DisplayName("UserTest")
class UserTest {
    User user = new User(new Telegram(),"name");
    @Test
    @DisplayName("Enviar mensaje")
    void send() {

        user.mediator = mock(Telegram.class);
        doNothing().when(user.mediator).sendMessage("msg",user);
        user.send("msg");
        verify(user.mediator).sendMessage("msg",user);
    }

    @Test
    @DisplayName("Recibir mensaje")
    void receive() {
        assertDoesNotThrow(() ->user.receive("msg"));
    }
}

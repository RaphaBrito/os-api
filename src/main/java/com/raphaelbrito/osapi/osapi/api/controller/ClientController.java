package com.raphaelbrito.osapi.osapi.api.controller;

import java.util.Arrays;
import java.util.List;

import com.raphaelbrito.osapi.osapi.domain.model.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public List<Client> list() {
        var client1 = new Client();
        client1.setId(1L);
        client1.setEmail("brito.raphaelc@gmail.com");
        client1.setName("Raphael Brito");
        client1.setPhone("(81) 99102-2415");
        var client2 = new Client();
        client2.setId(2L);
        client2.setEmail("leticiasillva.m@gmail.com");
        client2.setName("Letícia Brito");
        client2.setPhone("(81) 98180-8997");

        return Arrays.asList(client1, client2);
    }
}
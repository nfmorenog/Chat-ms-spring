package com.javatechie.spring.ws.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.javatechie.spring.ws.api.model.ChatMessage;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/rest")

public class ChatRest {
    //@PostMapping (path = "/send",produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping (path = "/send")
    public @ResponseBody ChatMessage setData(@RequestBody ChatMessage mensaje){

        ChatMessage response = new ChatMessage();
        response.setContent(mensaje.getContent());
        response.setSender(mensaje.getSender());

        return mensaje;
    }



}
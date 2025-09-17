package com.vico.cinespring.service;

import com.vico.cinespring.model.HelloWord;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWord getHelloWord() {
        HelloWord hw = new HelloWord();
        return hw;
    }
}
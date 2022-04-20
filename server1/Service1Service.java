package com.assignment2.service1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service1Service {
    public ArrayList<Service1Words> words = new ArrayList<Service1Words>();

    public  ArrayList<Service1Words> getWords() {
        return words;
    }

    public void addWord(Service1Words word) {

        words.add(word);
    }
}

package com.assignment2.service2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Service2Services {
    public List<Service2Word> words = new ArrayList<Service2Word>();

    public  List<Service2Word> getWords() {
        return words;
    }

    public void addWord(Service2Word word) {
        words.add(word);
    }
}

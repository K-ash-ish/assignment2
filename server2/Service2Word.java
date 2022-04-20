package com.assignment2.service2;

import java.util.List;

public class Service2Word {
    private List<String> words ;

    public Service2Word() {
    }

    public Service2Word(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}

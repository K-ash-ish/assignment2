package com.assignment2.mainservice;

import java.util.ArrayList;

public class ServiceWord {
    private ArrayList<String> words ;

    public ServiceWord() {}

    public ServiceWord(ArrayList<String> words) {
        this.words = words;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

}

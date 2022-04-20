package com.assignment2.service1;

import java.util.ArrayList;
import java.util.List;

public class Service1Words {
    private ArrayList<String> words ;

    public Service1Words() {}

    public Service1Words(ArrayList<String> word) {
        this.words = word;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}

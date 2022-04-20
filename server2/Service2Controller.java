package com.assignment2.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Service2Controller {

    @Autowired
    private Service2Services services;

    @RequestMapping("/words")
    public List<Service2Word> getWords() {
        return services.getWords();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/words")
    public void addWords(@RequestBody Service2Word word){
            services.addWord(word);
        }
        
}

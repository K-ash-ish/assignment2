package com.assignment2.service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Service1Controller {

    @Autowired
    private Service1Service services;

    @RequestMapping("/words")
    public ArrayList<Service1Words> getWords() {
        return services.getWords();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/words")
    public void addWords(@RequestBody Service1Words word){
            services.addWord((Service1Words) word);
        }
        
}

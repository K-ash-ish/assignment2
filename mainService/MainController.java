package com.assignment2.mainservice;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/words")
    public ArrayList<String> getWords(){
        ServiceWord[] service1Word = restTemplate.getForObject("http://localhost:8081/words", ServiceWord[].class);
//        ServiceWord[] service2Word = restTemplate.getForObject("http://localhost:8082/words", ServiceWord[].class);
        ArrayList<String> service1 = convertToArray(service1Word);
//        ArrayList<String> service2 = convertToArray(service2Word);
//        service1.addAll(service2);
        System.out.println(service1);
        return service1;
    }

    private  ArrayList<String> convertToArray(ServiceWord[] service1Word) {
        ArrayList<ServiceWord> newList = new ArrayList<ServiceWord>(List.of(service1Word));
        ArrayList<String> finalList = new ArrayList<>();
        for(ServiceWord words : newList){
            finalList.addAll((words.getWords()));
        }
        return finalList;
    }

    @PostMapping("/words")
    public void addWord(@RequestBody ServiceWord word)  {

         restTemplate.postForObject("http://localhost:8081/words", word, ServiceWord.class);
//         restTemplate.postForObject("http://localhost:8082/words", word, ServiceWord.class);

    }
    @DeleteMapping("/delete")
    public void delete(){
        restTemplate.delete("http://localhost:8081/words");
    }


}
//    ArrayList<ServiceWord> newL = new ArrayList<ServiceWord>(List.of(word));
//    ArrayList<String> finalL = new ArrayList<>();
//        for(ServiceWord words : newL){
//                finalL.addAll((words.getWords()));
//                }
//                System.out.println(finalL.get(0));
//                restTemplate.postForObject("http://localhost:8081/words", finalL, List.class);
//        restTemplate.postForObject("http://localhost:8082/words", finalL, List.class);
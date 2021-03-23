package com.elk.stack.logging.searchesControllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/test")
public class SearchesControllers {

    @RequestMapping
    public String SearchesControllers(){
        return  "Testando Docker";
    }
}
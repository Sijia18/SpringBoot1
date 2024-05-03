package com.develhope.proveSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping (path = "/v1/{provincia}")
    public Person presentation(@RequestParam String nome, @PathVariable String provincia) {
        return new Person(nome, provincia);
    }
}
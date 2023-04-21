package com.bug.issuereplicate;

import com.demo.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("person")
public class MyController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Person> personMono(){
        return Mono.just(Person.newBuilder().setName("test").setAge(1).build());
    }

}

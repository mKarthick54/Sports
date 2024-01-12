package com.example.demo.Controller;


import com.example.demo.model.AccountDetails;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/api/v1")
public class Account {

    @GetMapping(value="/accountDetails/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountDetails getAccountDetailsById(@PathVariable("id") String id){
        return new AccountDetails();

}

}

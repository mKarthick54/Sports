package com.example.demo.Controller;

import com.example.demo.Service.PlayerValidator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("Controller to check the score")
public class Score {

    private PlayerValidator playerValidator;
    public Score(PlayerValidator playerValidator){
        this.playerValidator=playerValidator;

    }
    @GetMapping(value = "/scoreByName/{name}")
    public String getCurrentScore(@PathVariable("name") String name) {

        return name;
    }

    @GetMapping(value="/stateByName/{playerName}")
    public String getPlayerStateByName(@PathVariable("playerName") String name){
        return playerValidator.getStateByPlayerName(name);
    }
}

package com.example.demo.Service;

import com.example.demo.Entity.Player;
import com.example.demo.Repository.PlayerRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class PlayerValidator {

    private PlayerRepository playerRepository;

    public PlayerValidator(PlayerRepository playerRepository){
        this.playerRepository=playerRepository;
    }

    public String getStateByPlayerName(String name) {
        String state="";
        Player player=null;
        if(StringUtils.isNotEmpty(name)){
            player=playerRepository.findByfirstname(name);
        }
        return player.getState();


    }
}

package com.example.demo.Service;

import com.example.demo.Entity.Player;
import com.example.demo.Repository.PlayerRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerValidator {

    private final PlayerRepository playerRepository;

    private final RestTemplate restTemplate;

    public PlayerValidator(PlayerRepository playerRepository, RestTemplate restTemplate) {
        this.playerRepository = playerRepository;
        this.restTemplate = restTemplate;
    }

    public String getStateByPlayerName(String name) {
        String state = "";
        Player player = null;
        if (StringUtils.isNotEmpty(name)) {
            player = playerRepository.findByfirstname(name);
        }
        return player.getState();


    }
}

/*
package com.example.demo.RepositoryTest;


import com.example.demo.Entity.Player;
import com.example.demo.Repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void savePlayer(){
        Player player=new Player();
        player.setFirstname("KL");
        player.setLastName("Rahul");
        player.setAge(35);
        player.setEmail("rahul@abc.com");
        player.setState("Karnataka");
        playerRepository.save(player);
    }

    @Test
    public void findStudentByState(){
       Player player= playerRepository.findByfirstname("Delhi");
        System.out.println(player);
    }
}
*/

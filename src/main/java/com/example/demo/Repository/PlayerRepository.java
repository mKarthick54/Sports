package com.example.demo.Repository;

import com.example.demo.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    Player findByfirstname(String name);


}

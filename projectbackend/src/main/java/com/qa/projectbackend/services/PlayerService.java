package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private PersonRepository personRepository;

    public PlayerService(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Player> getAllPlayers() {
        List<Player> allPlayersList = (List<Player>) personRepository.findAll();
        return allPlayersList;
    }

    public Player addPlayer(Player player) {
       personRepository.save(player);
       return player;
    }

    public Player getPlayer(String firstName) {
        return personRepository.getByfirstName(firstName.toLowerCase());
    }


}

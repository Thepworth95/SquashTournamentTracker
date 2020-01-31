package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private PersonRepository personRepository;

    public List<Player> getAllPlayers() {
        return personRepository.findAll();
    }

    public Player addPlayer(String firstName, String surname, int graduationYear) {
       return personRepository.save(new Player(firstName, surname, graduationYear));
    }

    public Player getPlayer(String firstName) {
        return personRepository.getByfirstName(firstName.toLowerCase());
    }
}

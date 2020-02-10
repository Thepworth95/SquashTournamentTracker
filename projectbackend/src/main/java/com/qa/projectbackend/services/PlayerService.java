package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private PersonRepository personRepository;

    public List<Player> getAllPlayers() {
        List<Player> allPlayersList = personRepository.findAll();
        return allPlayersList.stream().sorted(Comparator.comparingInt(Player::getGraduationYear)).collect(Collectors.toList());
    }

    public Player addPlayer(String firstName, String surname, int graduationYear) {
       return personRepository.save(new Player(firstName.toLowerCase(), surname.toLowerCase(), graduationYear));
    }

    public Player getPlayer(String firstName) {
        return personRepository.getByfirstName(firstName.toLowerCase());
    }


}

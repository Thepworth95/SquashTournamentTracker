package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Player> getPlayer(Integer id) {
        return personRepository.findById(id);
    }


    public Optional<Player> updatePlayer(Integer id, Player player) {
        return personRepository.findById(id).map(user -> {
            user.setFirstName(player.getFirstName());
            user.setSurname(player.getSurname());
            user.setGraduationYear(player.getGraduationYear());
            user.setGroup(player.getGroup());
            user.setMatches(player.getMatches());
            user.setWins(player.getWins());
            user.setLosses(player.getLosses());
            user.setGames(player.getGames());
            return personRepository.save(user);
        });
    }

    public Integer deletePlayer(Integer id) {
        personRepository.deleteById(id);
        return id;
    }
}

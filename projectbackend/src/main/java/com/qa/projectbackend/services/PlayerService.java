package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(@Autowired PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepository.findAll();
    }

    public Player addPlayer(Player player) {
       playerRepository.save(player);
       return player;
    }

    public Optional<Player> getPlayer(Integer id) {
        return playerRepository.findById(id);
    }


    public Optional<Player> updatePlayer(Integer id, Player player) {
        return playerRepository.findById(id).map(updatedPlayer -> {
            if (player.getFirstName() != null) { updatedPlayer.setFirstName(player.getFirstName()); }
            if (player.getSurname() != null) { updatedPlayer.setSurname(player.getSurname()); }
            updatedPlayer.setGraduationYear(updatedPlayer.getGraduationYear());
            updatedPlayer.setGroup(player.getGroup());
            updatedPlayer.setMatches(player.getMatches());
            updatedPlayer.setWins(player.getWins());
            updatedPlayer.setLosses(player.getLosses());
            updatedPlayer.setGames(player.getGames());
            return playerRepository.save(updatedPlayer);
        });
    }

    public Integer deletePlayer(Integer id) {
        playerRepository.deleteById(id);
        return id;
    }
}

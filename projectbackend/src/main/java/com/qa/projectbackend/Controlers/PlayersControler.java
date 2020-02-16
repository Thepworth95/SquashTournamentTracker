package com.qa.projectbackend.Controlers;


import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping(path = "/players")
public class PlayersControler {

    private PlayerService playerService;

    private PlayersControler (@Autowired PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(path = "/get/all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player newplayer = playerService.addPlayer(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(newplayer);
    }

    @GetMapping(path = "/get/{firstName}")
    public ResponseEntity<Player> getPlayer(@PathVariable("firstName") String firstName) {
        return ResponseEntity.ok(playerService.getPlayer(firstName));
    }

}

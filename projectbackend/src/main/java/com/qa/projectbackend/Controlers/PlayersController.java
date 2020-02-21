package com.qa.projectbackend.Controlers;


import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping(path = "/players")
public class PlayersController {

    private PlayerService playerService;

    private PlayersController(@Autowired PlayerService playerService) {
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

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<Optional<Player>> getPlayer(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(playerService.getPlayer(id));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Optional<Player>> updatePlayer(@PathVariable("id") Integer id, @RequestBody Player player) {
        return ResponseEntity.ok(playerService.updatePlayer(id, player));
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<Integer> deletePlayer(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(playerService.deletePlayer(id));
    }
}

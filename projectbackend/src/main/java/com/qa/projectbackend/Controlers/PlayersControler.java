package com.qa.projectbackend.Controlers;


import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/players")
public class PlayersControler {

//    @Autowired

    private PlayerService playerService;

    @GetMapping(path = "/get/all")
    public ResponseEntity<List<Player>> getAllPlayers (){
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    };

    @PostMapping(path = "/add")
    public ResponseEntity<Player> addPlayer(String firstName, String surname, int graduationYear) {
        return new ResponseEntity<>(playerService.addPlayer(firstName, surname, graduationYear), HttpStatus.OK);
    }

    @GetMapping(path = "/get/{firstName}")
    public ResponseEntity<Player> getPlayer(@PathVariable("firstName") String firstName) {
        return ResponseEntity.ok(playerService.getPlayer(firstName));
    }

    

}

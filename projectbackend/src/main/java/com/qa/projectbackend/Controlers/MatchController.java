package com.qa.projectbackend.Controlers;

import com.qa.projectbackend.entity.Matches;
import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.services.MatchesService;
import com.qa.projectbackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/matches")
public class MatchController {

    private MatchesService matchesService;

    private MatchController(@Autowired MatchesService matchesService) {
        this.matchesService = matchesService;
    }

    @GetMapping(path = "/get/all")
    public ResponseEntity<List<Matches>> getAllMatches() {
        return new ResponseEntity<>(matchesService.getAllMatches(), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Matches> addMatch(@RequestBody Matches match) {
        Matches newMatch = matchesService.addMatch(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMatch);
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<Optional<Matches>> getMatch(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(matchesService.getMatch(id));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Optional<Matches>> updateMatch(@PathVariable("id") Integer id, @RequestBody Matches match) {
        return ResponseEntity.ok(matchesService.updateMatch(id, match));
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<Integer> deleteMatch(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(matchesService.deleteMatch(id));
    }
}

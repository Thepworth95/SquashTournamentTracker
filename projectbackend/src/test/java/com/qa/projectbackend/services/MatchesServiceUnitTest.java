package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Matches;
import com.qa.projectbackend.repository.MatchRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatchesServiceUnitTest {

    @InjectMocks
    MatchesService matchesService;

    @Mock
    MatchRepository matchRepository;

    @Test
    public void getAllPlayersTest() {
        Matches match = new Matches();
        List<Matches> matches = new ArrayList<Matches>();
        matches.add(match);

        Mockito.when(this.matchRepository.findAll()).thenReturn(matches);

        assertThat(this.matchesService.getAllMatches()).isEqualTo(matches);
    }

    @Test
    public void addPlayerTest() {
        Matches matches = new Matches();

        Mockito.when(this.matchRepository.save(matches)).thenReturn(matches);

        assertThat(this.matchesService.addMatch(matches)).isEqualTo(matches);

    }

    @Test
    public void getPlayerTest() {
        Matches matches = new Matches();

        Mockito.when(this.matchRepository.findById(1)).thenReturn(Optional.of(matches));

        assertThat(this.matchesService.getMatch(1)).isEqualTo(Optional.of(matches));
    }

    @Test
    public void updatePlayersTest() {
        Matches matches = new Matches();

        Mockito.when(this.matchRepository.findById(1)).thenReturn(Optional.of(matches));
        Mockito.when(this.matchRepository.save(matches)).thenReturn(matches);

        assertThat(this.matchesService.updateMatch(1, matches)).isEqualTo(Optional.of(matches));
    }

    @Test
    public void deleteMatchTest() {

        assertThat(this.matchesService.deleteMatch(1)).isEqualTo(1);
    }

}
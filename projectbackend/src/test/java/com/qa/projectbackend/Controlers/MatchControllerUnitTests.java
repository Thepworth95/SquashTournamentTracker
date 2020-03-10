package com.qa.projectbackend.Controlers;

import com.qa.projectbackend.entity.Matches;
import com.qa.projectbackend.services.MatchesService;
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
public class MatchControllerUnitTests {

    @InjectMocks
    MatchController matchController;

    @Mock
    MatchesService matchesService;

    @Test
    public void getAllMatchesTest() {
        Matches match = new Matches();
        List<Matches> matches = new ArrayList<Matches>();
        matches.add(match);

        Mockito.when(this.matchesService.getAllMatches()).thenReturn(matches);

        assertThat(this.matchController.getAllMatches().getBody()).isEqualTo(matches);
        assertThat(this.matchController.getAllMatches().getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void addMatchTest() {
        Matches match = new Matches();

        Mockito.when(this.matchesService.addMatch(match)).thenReturn(match);

        assertThat(this.matchController.addMatch(match).getBody()).isEqualTo(match);
        assertThat(this.matchController.addMatch(match).getStatusCodeValue()).isEqualTo(201);
    }

    @Test
    public void getMatchTest() {
        Matches match = new Matches();

        Mockito.when(this.matchesService.getMatch(1)).thenReturn(Optional.of(match));

        assertThat(this.matchController.getMatch(1).getBody()).isEqualTo(Optional.of(match));
        assertThat(this.matchController.getMatch(1).getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void updateMatchTest() {
        Matches match = new Matches();

        Mockito.when(this.matchesService.updateMatch(1, match)).thenReturn(Optional.of(match));

        assertThat(this.matchController.updateMatch(1, match).getBody()).isEqualTo(Optional.of(match));
        assertThat(this.matchController.updateMatch(1, match).getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void deleteMatchTest() {
        Matches match = new Matches();

        Mockito.when(this.matchesService.deleteMatch(1)).thenReturn(1);

        assertThat(this.matchController.deleteMatch(1).getBody()).isEqualTo(1);
        assertThat(this.matchController.deleteMatch(1).getStatusCodeValue()).isEqualTo(200);
    }

}
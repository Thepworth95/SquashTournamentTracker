package com.qa.projectbackend.entity;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PlayerTest {


    @InjectMocks
    public Player player = new Player();

    @Test
    public void getFirstNameTest() {
        player.setFirstName("Tom");
        assertThat(this.player.getFirstName().equals("Tom")).isEqualTo(true);
    }

    @Test
    public void getSurnameTest() {
        player.setSurname("Hepworth");
        assertThat(this.player.getSurname().equals("Hepworth")).isEqualTo(true);
    }

    @Test
    public void getGraduationYearTest() {
        player.setGraduationYear(2019);
        assertThat(this.player.getGraduationYear() == 2019).isEqualTo(true);
    }

    @Test
    public void getGroupTest() {
        player.setGroup(1);
        assertThat(this.player.getGroup() == 1).isEqualTo(true);
    }

    @Test
    public void getMatchesTest() {
        player.setMatches(0);
        assertThat(this.player.getMatches() == 0).isEqualTo(true);
    }

    @Test
    public void getWinsTest() {
        player.setWins(0);
        assertThat(this.player.getWins() == 0).isEqualTo(true);
    }

    @Test
    public void getLossesTest() {
        player.setLosses(0);
        assertThat(this.player.getLosses()== 0).isEqualTo(true);
    }

    @Test
    public void getGamesTest() {
        player.setGames(0);
        assertThat(this.player.getGames() == 0).isEqualTo(true);
    }

    @Test
    public void getIdTest() {
        this.player.setId(1);
        assertThat(this.player.getId() == 1).isEqualTo(true);
    }
}

package com.qa.projectbackend.entity;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MatchesTests {

    @InjectMocks
    public Matches matches = new Matches();

    @Mock
    Player player = new Player();
    Player secondPlayer = new Player();
    Matches match2 = new Matches(player, secondPlayer, true);

    @Test
    public void getPlayer1Test() {
        matches.setPlayer1(player);
        assertThat(this.matches.getPlayer1().equals(player)).isEqualTo(true);
    }

    @Test
    public void getPlayer2Test() {
        matches.setPlayer2(player);
        assertThat(this.matches.getPlayer2().equals(player)).isEqualTo(true);
    }


    @Test
    public void getP1scoreTest() {
        matches.setP1score(1);
        assertThat(this.matches.getP1score() == 1).isEqualTo(true);
    }

    @Test
    public void getP2scoreTest() {
        matches.setP2score(1);
        assertThat(this.matches.getP2score() == 1).isEqualTo(true);
    }

    @Test
    public void getWinnerTest() {
        matches.setWinner(player);
        assertThat(this.matches.getWinner().equals(player)).isEqualTo(true);
    }

    @Test
    public void getLooserTest() {
        matches.setLooser(player);
        assertThat(this.matches.getLooser().equals(player)).isEqualTo(true);
    }

    @Test
    public void isGroupgameTest() {
        matches.setGroupgame(false);
        assertThat(this.matches.isGroupgame() == false).isEqualTo(true);
    }

    @Test
    public void getIdTest() {
        matches.setId(1);
        assertThat(this.matches.getId() == 1).isEqualTo(true);
    }

    @Test
    public void constructerTest() {
        assertThat(this.match2.getPlayer1().equals(player)).isEqualTo(true);
        assertThat(this.match2.getPlayer2().equals(secondPlayer)).isEqualTo(true);
        assertThat(this.match2.isGroupgame() == true).isEqualTo(true);
    }
}


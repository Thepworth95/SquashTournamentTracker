package com.qa.projectbackend.Controlers;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.services.PlayerService;
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
public class PlayersControllerUnitTest {

    @InjectMocks
    PlayersController playersController;

    @Mock
    PlayerService playerService;

    @Test
    public void getAllPlayersTest() {
        Player player = new Player();
        List<Player> players = new ArrayList<Player>();
        players.add(player);

        Mockito.when(this.playerService.getAllPlayers()).thenReturn(players);

        assertThat(this.playersController.getAllPlayers().getBody()).isEqualTo(players);
        assertThat(this.playersController.getAllPlayers().getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void addPlayerTest() {
        Player player = new Player();

        Mockito.when(this.playerService.addPlayer(player)).thenReturn(player);

        assertThat(this.playersController.addPlayer(player).getBody()).isEqualTo(player);
        assertThat(this.playersController.addPlayer(player).getStatusCodeValue()).isEqualTo(201);
    }

    @Test
    public void getPlayerTest() {
        Player player = new Player();

        Mockito.when(this.playerService.getPlayer(1)).thenReturn(Optional.of(player));

        assertThat(this.playersController.getPlayer(1).getBody()).isEqualTo(Optional.of(player));
        assertThat(this.playersController.getPlayer(1).getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void updatePlayersTest() {
        Player player = new Player();

        Mockito.when(this.playerService.updatePlayer(1, player)).thenReturn(Optional.of(player));

        assertThat(this.playersController.updatePlayer(1, player).getBody()).isEqualTo(Optional.of(player));
        assertThat(this.playersController.updatePlayer(1, player).getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void deleteMatchTest() {
        Player player = new Player();

        Mockito.when(this.playerService.deletePlayer(1)).thenReturn(1);

        assertThat(this.playersController.deletePlayer(1).getBody()).isEqualTo(1);
        assertThat(this.playersController.deletePlayer(1).getStatusCodeValue()).isEqualTo(200);
    }

}

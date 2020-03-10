package com.qa.projectbackend.services;

import com.qa.projectbackend.entity.Player;
import com.qa.projectbackend.repository.PlayerRepository;
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
public class PlayerServiceUnitTest {

    @InjectMocks
    PlayerService playerService;

    @Mock
    PlayerRepository playerRepository;

    @Test
    public void getAllPlayersTest() {
        Player player = new Player();
        List<Player> players = new ArrayList<Player>();
        players.add(player);

        Mockito.when(this.playerRepository.findAll()).thenReturn(players);

        assertThat(this.playerService.getAllPlayers()).isEqualTo(players);
    }

    @Test
    public void addPlayerTest() {
        Player player = new Player();

        Mockito.when(this.playerRepository.save(player)).thenReturn(player);

        assertThat(this.playerService.addPlayer(player)).isEqualTo(player);

    }

    @Test
    public void getPlayerTest() {
        Player player = new Player();

        Mockito.when(this.playerRepository.findById(1)).thenReturn(Optional.of(player));

        assertThat(this.playerService.getPlayer(1)).isEqualTo(Optional.of(player));
    }

    @Test
    public void updatePlayersTest() {
        Player player = new Player();

        Mockito.when(this.playerRepository.findById(1)).thenReturn(Optional.of(player));
        Mockito.when(this.playerRepository.save(player)).thenReturn(player);

        assertThat(this.playerService.updatePlayer(1, player)).isEqualTo(Optional.of(player));
    }

    @Test
    public void deleteMatchTest() {

        assertThat(this.playerService.deletePlayer(1)).isEqualTo(1);
    }

}

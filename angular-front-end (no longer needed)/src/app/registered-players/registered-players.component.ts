import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {PlayersService} from 'src/app/players.service';
import { Player } from '../entity.model';
@Component({
  selector: 'app-registered-players',
  templateUrl: './registered-players.component.html',
  styleUrls: ['./registered-players.component.scss']
})
export class RegisteredPlayersComponent implements OnInit {

  public players: Player[];

  constructor(
    private playerService: PlayersService,
    private router: Router
  ) { }


  ngOnInit() {

    this.playerService.getAllPlayers().subscribe((player)=> {
      this.players = player
    })

  }

}

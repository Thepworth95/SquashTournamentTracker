import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { PlayersService } from '../players.service';
import { MatchesService } from '../matches.service';


export interface Year {
  value: number;
  viewValue: string;
}

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {

  

  player = new FormGroup({
  firstName: new FormControl(''),
  surname: new FormControl(''),
  graduationYear: new FormControl('')
  });

  Years: Year[] = [
    {value: 2010, viewValue: '2010'},
    {value: 2011, viewValue: '2011'},
    {value: 2012, viewValue: '2012'},
    {value: 2013, viewValue: '2013'},
    {value: 2014, viewValue: '2014'},
    {value: 2015, viewValue: '2015'},
    {value: 2016, viewValue: '2016'},
    {value: 2017, viewValue: '2017'},
    {value: 2018, viewValue: '2018'},
    {value: 2019, viewValue: '2019'},
    {value: 2020, viewValue: '2020'},
    {value: 2021, viewValue: '2021'},
    {value: 2022, viewValue: '2022'},
    {value: 2023, viewValue: '2023'},
  ];
  router: Router;

  constructor(
    private playerService: PlayersService,
    private matchesService: MatchesService
  ) { }

  addNewPlayer(){
   // this.playerService.addPlayer(this.player.firstName, this.player.surname, this.player.graduationYear)
  }

  addNewMatches(){
    const players = this.playerService.getAllPlayers().subscribe
    for (let i = 0; i < players.length; i++) {
      for (let j = 0; j < players.length; i++)
        if (i > j){
          this.matchesService.addMatch(players[i].id, players[j].id)
        }
    }
  }

  ngOnInit() {
  }

}

import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { Player } from 'src/app/entity.model';
import { MatchesService } from 'src/app/matches.service';
import { Router } from '@angular/router';
import { PlayersService } from 'src/app/players.service';

// export interface PeriodicElement {
//   position: number;
//   name: string;
//   matches: number;
//   wins: number;
//   losses: string;
// }



@Component({
  selector: 'app-group',
  templateUrl: './group.component.html',
  styleUrls: ['./group.component.scss']
})
export class GroupComponent implements OnInit {
  
  public players: Player[];

  displayedColumns: string[] = ['firsrname', 'surname', 'wins', 'losses'];
  dataSource = new MatTableDataSource(this.players);

  @ViewChild(MatSort, {static: true}) sort: MatSort;
  
  constructor(
    private playerService: PlayersService,
    private router: Router
  ) { }

  ngOnInit() {
    this.playerService.getAllPlayers().subscribe((player)=> {
      this.players = player
    })
    this.dataSource.sort = this.sort;
  }

}

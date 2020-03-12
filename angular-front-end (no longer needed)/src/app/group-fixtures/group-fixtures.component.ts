import { Component, OnInit } from '@angular/core';
import { MatchesService } from 'src/app/matches.service';
import { Router } from '@angular/router';
import { Match } from '../entity.model';

@Component({
  selector: 'app-group-fixtures',
  templateUrl: './group-fixtures.component.html',
  styleUrls: ['./group-fixtures.component.scss']
})
export class GroupFixturesComponent implements OnInit {

  private match: Match;
  private matches: Match[];

  constructor(
    private matchesService: MatchesService,
    private router: Router
  ) { }

  ngOnInit() {
    this.matchesService.getAllMatches().subscribe((match) => {
      this.matches = match
    })


  }
}
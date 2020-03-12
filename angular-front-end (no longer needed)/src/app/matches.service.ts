import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Match, Player } from './entity.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MatchesService {
  getAllPlayers() {
    throw new Error("Method not implemented.");
  }

  constructor(private http: HttpClient) { }

  public getAllMatches(): Observable<Match[]> {
    return this.http.get<Match[]>(
      'http://localhost:8080/Matches/get/all'
    )
  }

  public getMatch(id: number): Observable<Match> {
    return this.http.get<Match>(
      'http://localhost:8080/Matches/get/' + id
    )
  }

  public addMatch(player1: Player, player2: Player){
    return this.http.post(
      'http://localhost:8080/Matches/add' ,
      {
        'player1': player1,
        'player2': player2,
        'groupgame': true
      }
    )
  }
}

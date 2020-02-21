import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Player } from './entity.model';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PlayersService {

  constructor(private http: HttpClient) { }

public getAllPlayers(): Observable<Player[]>{
  return this.http.get<Player[]>(
    'http://localhost:8080/players/get/all'
  )
}
public getPlayer(id: number): Observable<Player>{
  return this.http.get<Player>(
    'http://localhost:8080/players/get/'+id
    )
}





}

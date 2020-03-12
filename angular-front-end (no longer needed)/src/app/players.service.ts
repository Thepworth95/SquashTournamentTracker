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

public addPlayer(firstname: String, surname: String, graduationYear: number): Observable<any>{
  return this.http.post(
    'http://localhost:8080/players/add',
    {
      'firstName': firstname,
      'surname': surname,
      'graduationYear': graduationYear
    }
  )
}



}

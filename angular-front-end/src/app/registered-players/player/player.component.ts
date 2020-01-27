import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.scss']
})
export class PlayerComponent implements OnInit {

  FirstName: any = "";

  Surname: any = "";

  Graduated: any = "";

  constructor() { }

  ngOnInit() {
  }

}

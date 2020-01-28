import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';

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

  Firstname = new FormControl('');
  Surname = new FormControl('');
  Graduated = new FormControl('');

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
  ];
  router: Router;

  constructor() { }

  ngOnInit() {
  }

}

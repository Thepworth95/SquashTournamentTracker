import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';

export interface PeriodicElement {
  name: string;
  matches: number;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, matches: 3, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, matches: 3, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, matches: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, matches: 3, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, matches: 3, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, matches: 3, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, matches: 3, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, matches: 3, name: 'Oxygen', weight: 15.9994, symbol: 'O'},
  {position: 9, matches: 3, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, matches: 3, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];

@Component({
  selector: 'app-group',
  templateUrl: './group.component.html',
  styleUrls: ['./group.component.scss']
})
export class GroupComponent implements OnInit {

  displayedColumns: string[] = ['position', 'matches', 'name', 'weight', 'symbol'];
  dataSource = new MatTableDataSource(ELEMENT_DATA);

  @ViewChild(MatSort, {static: true}) sort: MatSort;
  
  constructor() { }

  ngOnInit() {
    this.dataSource.sort = this.sort;
  }

}

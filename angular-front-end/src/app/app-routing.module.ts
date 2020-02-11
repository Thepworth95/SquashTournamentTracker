import {NgModule, Component} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { TournementGenoratorComponent } from './tournement-genorator/tournement-genorator.component';
import { RegisteredPlayersComponent } from './registered-players/registered-players.component';
import { TournementPageComponent } from './tournement-page/tournement-page.component';
import { TournementKnockoutComponent } from './tournement-knockout/tournement-knockout.component';
import { KnockoutFixturesComponent } from './knockout-fixtures/knockout-fixtures.component';
import { KnockoutResultsComponent } from './knockout-results/knockout-results.component';
import { GroupFixturesComponent } from './group-fixtures/group-fixtures.component';
import { GroupResultsComponent } from './group-results/group-results.component';


const routes: Routes = [
  {
    path: 'home',
    component: HomepageComponent
  },
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'generator',
    component: TournementGenoratorComponent 
  },
  {
    path: 'players',
    component: RegisteredPlayersComponent
  },
  {
    path: 'gss',
    component: TournementPageComponent
  },
  {
    path: 'gsf',
    component: GroupFixturesComponent
  },
  {
    path: 'gsr',
    component: GroupResultsComponent
  },
  {
    path: 'koss',
    component: TournementKnockoutComponent
  },
  {
    path: 'kosf',
    component: KnockoutFixturesComponent
  },
  {
    path: 'kosr',
    component: KnockoutResultsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

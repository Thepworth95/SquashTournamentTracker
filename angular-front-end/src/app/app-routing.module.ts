import {NgModule, Component} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { RegisteredPlayersComponent } from './registered-players/registered-players.component';
import { TournementPageComponent } from './tournement-page/tournement-page.component';
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
    path: 'players',
    component: RegisteredPlayersComponent
  },
  {
    path: 'standings',
    component: TournementPageComponent
  },
  {
    path: 'fixtures',
    component: GroupFixturesComponent
  },
  {
    path: 'results',
    component: GroupResultsComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

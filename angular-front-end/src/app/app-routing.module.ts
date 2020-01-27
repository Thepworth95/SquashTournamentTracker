import {NgModule, Component} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { TournementGenoratorComponent } from './tournement-genorator/tournement-genorator.component';
import { RegisteredPlayersComponent } from './registered-players/registered-players.component';
import { TournementPageComponent } from './tournement-page/tournement-page.component';


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
    path: 'tournement',
    component: TournementPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

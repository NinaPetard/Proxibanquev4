import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
import { ListeClientsComponent }   from './liste-clients/liste-clients.component';

const routes: Routes = [
  { path: 'listeclients', component: ListeClientsComponent }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
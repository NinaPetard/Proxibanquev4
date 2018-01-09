import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { AppRoutingModule } from './/app-routing.module';

import { ConnexionComponent } from './connexion/connexion.component';
import { DeconnexionComponent } from './deconnexion/deconnexion.component';
import { NavbarComponent } from './navbar/navbar.component';
import { GreetingComponent } from './greeting/greeting.component';
import { ListeClientsComponent } from './liste-clients/liste-clients.component';
import { ListeConseillersComponent } from './liste-conseillers/liste-conseillers.component';
import { AjoutClientComponent } from './ajout-client/ajout-client.component';
import { ComptesComponent } from './comptes/comptes.component';
import { VirementComponent } from './virement/virement.component';
import { BtnAjoutComponent } from './btn-ajout/btn-ajout.component';
import { ModifierClientComponent } from './modifier-client/modifier-client.component';
import { StatsConseillerComponent } from './stats-conseiller/stats-conseiller.component';
import { StatsGlobalesComponent } from './stats-globales/stats-globales.component';




@NgModule({
  declarations: [
    AppComponent,
    ConnexionComponent,
    DeconnexionComponent,
    NavbarComponent,
    GreetingComponent,
    ListeClientsComponent,
    ListeConseillersComponent,
    AjoutClientComponent,
    ComptesComponent,
    VirementComponent,
    BtnAjoutComponent,
    ModifierClientComponent,
    StatsConseillerComponent,
    StatsGlobalesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

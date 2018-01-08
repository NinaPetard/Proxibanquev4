import { Component, OnInit } from '@angular/core';
import { CLIENTS } from '../mock-wslisteclients';
import {Client} from '../client';
import{Compte} from '../compte';
import {COMPTES} from '../mock-wscomptesclient';

@Component({
  selector: 'app-liste-clients',
  templateUrl: './liste-clients.component.html',
  styleUrls: ['./liste-clients.component.css']
})
export class ListeClientsComponent implements OnInit {
  clients=CLIENTS;
  selectedClient:Client;
  listeCptCli:Compte[];
  constructor() {   
   }

   afficherComptes(client){
    this.selectedClient = client;
    this.getComptes();   
   }

  getComptes(){
  var comptes = COMPTES;
  this.listeCptCli = COMPTES.filter(compte => compte.idclient === this.selectedClient.idClient);
  console.log(this.listeCptCli);

  }

  ngOnInit() {
  }



}

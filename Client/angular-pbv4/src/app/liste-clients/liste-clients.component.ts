import { Component, OnInit } from '@angular/core';
import {Client} from './../client';
import{Compte} from './../compte';
import {COMPTES} from './../mock-wscomptesclient';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-liste-clients',
  templateUrl: './liste-clients.component.html',
  styleUrls: ['./liste-clients.component.css']
})
export class ListeClientsComponent implements OnInit {
<<<<<<< HEAD
  
  private clients:Client[];
  private selectedClient:Client;
  private listeCptCli:Compte[];
=======
  clients=CLIENTS;
  selectedClient:Client;
  listeCptCli:Compte[];
  comptes=COMPTES;
  selectedCompte:Compte;
  constructor() {   
   }
>>>>>>> angularJoinelPbV4

  constructor( private clientService:ClientService) { }

  
  afficherComptes(client){
    this.selectedClient = client;
    this.getComptes();   
  }

  getComptes(){
  var comptes = COMPTES;
  this.listeCptCli = COMPTES.filter(compte => compte.idclient === this.selectedClient.idClient);
  /*console.log(this.listeCptCli);*/
   console.log(this.listeCptCli);

  }

getClients(){
  this.clientService.getClients().subscribe(clients => this.clients = clients);
}

  ngOnInit() {
    this.getClients();
  }



}

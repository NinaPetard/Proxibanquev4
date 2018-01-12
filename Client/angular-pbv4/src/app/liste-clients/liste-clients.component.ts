import { Component, OnInit, Injectable } from '@angular/core';
import {Client} from './../client';
import{Compte} from './../compte';
import { ClientService } from '../client.service';
import { registerLocaleData } from '@angular/common/src/i18n/locale_data';
import { CompteService } from '../comptes.service';
import { AuthService } from '../authentification.service';

@Component({
  selector: 'app-liste-clients',
  templateUrl: './liste-clients.component.html',
  styleUrls: ['./liste-clients.component.css']
})

@Injectable()
export class ListeClientsComponent implements OnInit {
  
  private selectedClient:Client;
  private listeCptCli:Compte[];
  private clients:Client[];


  constructor( private clientService:ClientService,
  private compteService:CompteService, private authService:AuthService) { }

  
  afficherComptes(client){    
    this.selectedClient = client;  
    this.getComptesCli(this.selectedClient.id); 
  }


  ngOnInit() {
    this.clientService.getClientConseiller(this.authService.getId()).subscribe(clients => this.clients = clients);
  }

  getComptesCli(idClient){
    console.log("Id du client possèdant les comptes:"+idClient)
    this.compteService.getComptesClient(idClient).subscribe(comptes => this.listeCptCli = comptes);
  }



}

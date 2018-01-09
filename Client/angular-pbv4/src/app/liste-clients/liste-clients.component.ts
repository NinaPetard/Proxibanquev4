import { Component, OnInit, Injectable } from '@angular/core';
import {Client} from './../client';
import{Compte} from './../compte';
import { ClientService } from '../client.service';
import { registerLocaleData } from '@angular/common/src/i18n/locale_data';

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


  constructor( private clientService:ClientService) { }

  
  afficherComptes(client){
    this.selectedClient = client;
    this.getComptes();   
  }

  getComptes(){  
  }


  ngOnInit() {
    this.clientService.getClientConseiller().subscribe(clients => this.clients = clients);
  }



}

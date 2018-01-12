import { Component, OnInit, Input} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ClientService} from '../client.service';
import { Client} from '../client';
import { ListeClientsComponent } from '../liste-clients/liste-clients.component';

@Component({
  selector: 'app-modifier-client',
  templateUrl: './modifier-client.component.html',
  styleUrls: ['./modifier-client.component.css']
})
export class ModifierClientComponent implements OnInit {
  

@Input() idcli: number;
@Input() nomcli: string;
@Input() prenomcli: string;
@Input() Adresse:string;
@Input() odepostal:string;
@Input() Ville:string;
@Input() Telephone:string;
@Input() codepostal:string;
@Input() Email:string;
@Input() client:Client;

  message:string;
  
  constructor(private route: ActivatedRoute,
    private location: Location,
    private clientService:ClientService) {    
   }

  ngOnInit(): void {
    this.getClient();
   
  }
  
  getClient(): void {
    this.idcli = +this.route.snapshot.paramMap.get('idClient');
    //this.clientService.getClient(this.idcli)
    //.subscribe(client => this.client = client);
    //console.log(this.client);
    console.log("Id envoyé:"+this.idcli);
    this.client=this.clientService.getClient(this.idcli);
    this.nomcli=this.client.nomcli;
    this.prenomcli=this.client.prenomcli;
    this.Adresse=this.client.Adresse;
    this.codepostal=this.client.codepostal;
    this.Ville=this.client.Ville;
    this.Telephone=this.client.Telephone;
    this.Email=this.client.Email;

  }

  ModifierClient():void{
    //this.clientService.updateClient(this.client);
    this.message ="Le client "+this.nomcli+" "+this.prenomcli+" a été modifié."
  }
}

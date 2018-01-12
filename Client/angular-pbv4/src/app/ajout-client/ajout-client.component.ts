import { Component, OnInit , Input} from '@angular/core';
import {Client} from '../client'
import { ClientService } from '../client.service';
import { AuthService } from '../authentification.service';
import { FormsModule }   from '@angular/forms';

@Component({
  selector: 'app-ajout-client',
  templateUrl: './ajout-client.component.html',
  styleUrls: ['./ajout-client.component.css']
})
export class AjoutClientComponent implements OnInit {

  constructor(private clientService: ClientService, private authService:AuthService) { }

  private message:string;

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

   ngOnInit(): void {

  }

  addClient(){
  this.client = new Client();
  this.client.id=this.idcli;
  this.client.nomcli=this.prenomcli;
  this.client.prenomcli=this.prenomcli;
  this.client.Adresse=this.Adresse;
  this.client.Ville=this.Ville;
  this.client.codepostal=this.codepostal;
  this.client.Telephone=this.Telephone;
  this.client.Email=this.Email;
  this.client.loginconseiller=this.authService.getId();
  this.clientService.addClient(this.client)
  this.message="Le client "+this.nomcli+" "+this.prenomcli+" a bien été ajouté"
  }

}


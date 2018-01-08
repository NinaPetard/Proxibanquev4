import { Component, OnInit } from '@angular/core';
import { CLIENTS } from '../mock-wslisteclients';

@Component({
  selector: 'app-liste-clients',
  templateUrl: './liste-clients.component.html',
  styleUrls: ['./liste-clients.component.css']
})
export class ListeClientsComponent implements OnInit {
  clients=CLIENTS;
  constructor() { 
   
   }

  ngOnInit() {
  }

}

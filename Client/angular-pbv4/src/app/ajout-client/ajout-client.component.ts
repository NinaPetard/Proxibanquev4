import { Component, OnInit } from '@angular/core';
import {Client} from '../client'

@Component({
  selector: 'app-ajout-client',
  templateUrl: './ajout-client.component.html',
  styleUrls: ['./ajout-client.component.css']
})
export class AjoutClientComponent implements OnInit {

  constructor() { }

  model = new Client(-1, "", "", "", "", "", "","" );

  ngOnInit() {
  }

  get diagnostic() { return JSON.stringify(this.model); }

}

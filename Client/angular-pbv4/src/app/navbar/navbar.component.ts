import { Component, OnInit } from '@angular/core';
import {Conseiller} from '../conseiller';
import {CONSEILLER} from '../mock-wsconseiller';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {


  
  private conseiller:Conseiller;
  

  getConseiller(){
    this.conseiller = CONSEILLER.find(conseiller => conseiller.idConseiller === 1);
  }

  ngOnInit() {
    this.getConseiller();
  }
  constructor() { }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
  private router:Router;
  constructor() {

   
  }

  /*connexion(){
    this.router.navigate(["/conseiller"]);
  }*/

  ngOnInit() {
    console.log("LALAL")
  }

}

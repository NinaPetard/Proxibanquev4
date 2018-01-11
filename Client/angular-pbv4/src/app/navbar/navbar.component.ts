import { Component, OnInit } from '@angular/core';
import {Conseiller} from '../conseiller';
import { ConseillerService } from '../conseiller.service';
import { AuthService } from '../authentification.service';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private conseillerService:ConseillerService,private authService:AuthService) { }
  private conseiller:Conseiller;
  private userRole:string;
  

  getConseiller(){
    //this.conseiller = this.conseillerService.getConseiller(1).subscribe(conseiller => this.conseiller = conseiller);
    
    if(this.userRole=="conseiller"){
      this.conseiller={"logincons":"pdupond","password"  :"toto","prenomcons"  :"Paul","nomcons"  :"Dupond"}
    }
    if(this.userRole=="gerant"){
      this.conseiller={"logincons":"jdupre","password"  :"tata","prenomcons"  :"Jean","nomcons"  :"Dupré"}
    }
  }

  getUser():string{
    return this.authService.getRole();
  }

  ngOnInit() {
    this.userRole = this.getUser();
    this.getConseiller();
   
  }

  deconnexion(){
    this.authService.deconnection();
  }


}


import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Client } from './client';
import { User } from './user';
import { ConseillerService } from './conseiller.service';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class AuthService {
  
 private user:User= new User();

  constructor( private serviceConseiller:ConseillerService) {
    }
//A REMETTRE AVANT DE LIVRER
  identifier(login:string, motdepasse:string): Boolean {
      if(login==="pdupond" && motdepasse==="toto"){
          this.user.login=login;
          this.user.role="conseiller";
          return true;
      }

      if(login==="jdupre" && motdepasse==="tata"){
        this.user.login=login;
        this.user.role="gerant";
        return true;
    }


      else{
          return false;
      }
   
  }



  getId(){
      return this.user.login;
  }

  getConseiller(logincons){
      return this.serviceConseiller.getConseiller(logincons);      
  }
  
  getRole(){
      return this.user.role;
  }

  deconnection(){
      this.user=new User();
  }

  setUserRole(role:string){
      this.user.role=role;

  }



  
}
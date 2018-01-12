import { Injectable } from '@angular/core';

import { Conseiller } from './conseiller';
import { Compte } from './compte';
import {Client} from './client';


import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CompteService {
  private urlcomptes = 'api/comptes'
  
  constructor( private http: HttpClient) {  }


  getComptes (): Observable<Compte[]> {
    return this.http.get<Compte[]>(`api/comptes`);
  }

    

  getComptesConseiller(logincons:string){
    return this.http.get<Compte[]>(`api/comptesdupond`);  
  }  

  getComptesClient(idClient){


    return this.http.get<Compte[]>(`api/comptesdupond/?id=${idClient}`);
    //if(idClient==1){
      //return this.http.get<Compte[]>('./assets/data/comptesdupond1.json'); 
    //}

    //if(idClient==9){
      //return this.http.get<Compte[]>('./assets/data/comptesdupond9.json'); 
    //}

  }

  
}
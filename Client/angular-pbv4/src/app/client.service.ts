import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Client } from './client';
import { AuthService } from './authentification.service';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class ClientService {
  
  listeclients:Client[];
  urllisteConseiller ='assets/data/clientsdupond.json';

  private urlclients = 'api/clients'
  constructor( private http: HttpClient,
  private authService:AuthService) {  }

  getClientConseiller(logincons:string): Observable<Client[]> {
    return this.http.get<Client[]>(`api/clients/?logincons=${logincons}`);
  }


  getAllClients(): Observable<Client[]> {    
    return this.http.get<Client[]>(`api/clients`);
  }

  getClient(idclient: number): Client{
    //return this.http.get<Client>(`api/clients/?id=${idclient}`);
    //const url = `${this.urlclients}/${idclient}`;
    var client ={"idcli"  :"1","prenomcli"  :"Richard",
"nomcli"  :"FOSTER",
"Adresse"  :"9 RUE DU LAC",
"codepostal"  :"45900",
"Ville"  :"LA SOURCE",
"Telephone"  :"0302345698",
"Email"  :"r.foster@forbes.com",
"logincons"  :"pdupond"}
    return client
  }

  updateClient (client:Client): Observable<any> {
    return this.http.put(this.urllisteConseiller, client, httpOptions);
  }



  addClient (client:Client): Observable<Client> {
    console.log(client);
    return this.http.post<Client>(this.urlclients, client, httpOptions);
  }

}
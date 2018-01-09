import { Injectable } from '@angular/core';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

import { Client } from './client';
import { CLIENTS } from './mock-wslisteclients';


@Injectable()
export class ClientService {

  constructor() { }

  getClient(idClient: number): Observable<Client> {   
    return of(CLIENTS.find(client => client.idClient === idClient));
  }

  getClients(): Observable<Client[]> {    
    return of(CLIENTS);
  }
}
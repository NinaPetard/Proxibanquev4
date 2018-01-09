import { Injectable } from '@angular/core';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

import { Conseiller } from './conseiller';
import { CONSEILLER } from './mock-wsconseiller';


@Injectable()
export class ConseillerService {

  constructor() { }

  getConseillers(): Observable<Conseiller[]> {
    
    return of(CONSEILLER);
  }

  getClient(idConseiller: number): Observable<Conseiller> {   
    return of(CONSEILLER.find(conseiller => conseiller.idConseiller === idConseiller));
  }
}
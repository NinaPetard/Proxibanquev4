import { Injectable } from '@angular/core';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

import { Conseiller } from './conseiller';
import {STATSVIR } from './mock-stats';
import { StatsVir } from './statsvir';

@Injectable()
export class StatsService {

  constructor() { }

  getStatsVir(idConseiller): Observable<StatsVir> {
    
    return of(STATSVIR.find(statsvir => statsvir.idConseiller === idConseiller));
  }

}
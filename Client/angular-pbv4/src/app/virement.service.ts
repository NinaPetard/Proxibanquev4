import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Virement } from './virement';



@Injectable()
export class VirementService {
    private urlvirement:string= './assets/data/messagevirement.txt';
  constructor( private http: HttpClient,

    ) { 
      
   }



  faireVirement(virement){ 
    console.log(virement);
    //return this.http.post<string>(this.urlvirement, virement,  { responseType: 'text' });
    if(virement.montant<501){
        return "Le virement a été effectué";
    }
    else{
        return "Erreur: Solde du compte à débiter insuffisant";
    }
    
}

}
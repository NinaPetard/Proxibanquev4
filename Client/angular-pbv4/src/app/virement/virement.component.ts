import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';


import { CLIENTS } from '../mock-wslisteclients';
import {Client} from '../client';
import{Compte} from '../compte';
import {COMPTES} from '../mock-wscomptesclient';
import {CompteService} from '../comptes.service';


@Component({
  selector: 'app-virement',
  templateUrl: './virement.component.html',
  styleUrls: ['./virement.component.css']
})
export class VirementComponent implements OnInit {

 
  comptedebit:Compte;
  comptecredit:Compte[];
  montant:number;
  
  listeCptDebit:Compte[];
  listeCptCredit:Compte[];

  formvirement: FormGroup;


  constructor(private fb: FormBuilder, private compteservice:CompteService) {
  
   }

getComptesDebit(){
  this.compteservice.getComptesConseiller().subscribe(comptes => this.listeCptDebit = comptes);

}


getComptesCredit(){
  this.compteservice.getComptes().subscribe(comptes => this.listeCptCredit = comptes);

}





  ngOnInit() {
    this.getComptesDebit();
    this.getComptesCredit();

    this.formvirement = new FormGroup({
      comptedebit: new FormControl(),
      comptecredit:new FormControl(),
      montant:new FormControl()

    })
  }



}

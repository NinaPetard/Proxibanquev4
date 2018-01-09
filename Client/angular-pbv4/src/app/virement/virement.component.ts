import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';


import { CLIENTS } from '../mock-wslisteclients';
import {Client} from '../client';
import{Compte} from '../compte';
import {COMPTES} from '../mock-wscomptesclient';


@Component({
  selector: 'app-virement',
  templateUrl: './virement.component.html',
  styleUrls: ['./virement.component.css']
})
export class VirementComponent implements OnInit {
  clients=CLIENTS;
  selectedClient:Client;
  listeCptCli:Compte[];
  comptes=COMPTES;
  selectedCompte:Compte;
 
  listeCptCli2:Compte[];
  comptes2=COMPTES;
  selectedCompte2:Compte;

  compteForm : FormGroup;

  constructor(private fb: FormBuilder) {
    this.createForm();   
   }

   afficherComptes(/*client*/compte){
    /*this.selectedClient = client;*/
    this.selectedCompte = compte;
    this.getComptes();   
   }

   afficherComptes2(/*client*/compte2){
    /*this.selectedClient = client;*/
    this.selectedCompte2 = compte2;
    this.getComptes2();   
   }

  getComptes(){
  var comptes = COMPTES;
  /*this.listeCptCli = COMPTES.filter(compte => compte.idclient === this.selectedClient.idClient);*/
  this.listeCptCli = COMPTES.filter(compte => compte.idCompte === this.selectedCompte.idCompte);
  /*console.log(this.listeCptCli);*/
   console.log(this.listeCptCli);

  }

  getComptes2(){
    var comptes2 = COMPTES;
    /*this.listeCptCli = COMPTES.filter(compte => compte.idclient === this.selectedClient.idClient);*/
    this.listeCptCli2 = COMPTES.filter(compte2 => compte2.idCompte === this.selectedCompte2.idCompte);
    /*console.log(this.listeCptCli);*/
     console.log(this.listeCptCli2);
  
    }

    createForm() {
      this.compteForm = this.fb.group({
        /*name: ['', Validators.required ],
        street: '',
        city: '',
        state: '',
        zip: '',
        power: '',*/
        compte: ''
      });
    }

    get secretLairs(): FormArray {
      return this.compteForm.get('secretLairs') as FormArray;
    };



  ngOnInit() {
  }

}

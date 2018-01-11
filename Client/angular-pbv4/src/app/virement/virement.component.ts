import { Component, OnInit , Input} from '@angular/core';
import {Client} from '../client';
import {Virement} from '../virement';
import{Compte} from '../compte';
import {CompteService} from '../comptes.service';
import {VirementService} from '../virement.service';
import { FormsModule }   from '@angular/forms';
import { AuthService } from '../authentification.service';


@Component({
  selector: 'app-virement',
  templateUrl: './virement.component.html',
  styleUrls: ['./virement.component.css']
})
export class VirementComponent implements OnInit {

 
  @Input()virement:Virement;
  
  private message:string;
  private listeCptDebit:Compte[];
  private listeCptCredit:Compte[];
  
  @Input()private compteDebit:number;
  @Input()private compteCredit:number;
  @Input()private montant:number;



  constructor( private compteservice:CompteService,
     private virementservice:VirementService,
    private authService:AuthService) {
  
   }

getComptesDebit(){
  this.compteservice.getComptesConseiller().subscribe(comptes => this.listeCptDebit = comptes);
}

getComptesCredit(){
  this.compteservice.getComptes().subscribe(comptes => this.listeCptCredit = comptes);
}

faireVirement(){
  this.virement = new Virement();
  this.virement.compteCredit=this.compteCredit;
  this.virement.compteDebit=this.compteDebit;
  this.virement.montant=this.montant;
  this.virement.conseiller=this.authService.getId();
  this.message=this.virementservice.faireVirement(this.virement);

}

  ngOnInit() {
    this.getComptesDebit();
    this.getComptesCredit();
  }



}

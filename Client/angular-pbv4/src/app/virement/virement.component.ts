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

  constructor( private compteservice:CompteService,
    private virementservice:VirementService,
   private authService:AuthService) {
 
  }

  private message:string;
  private listeCptDebit:Compte[];
  private listeCptCredit:Compte[];

  @Input()virement:Virement;
  @Input()private compteDebit:number;
  @Input()private compteCredit:number;
  @Input()private montant:number;
  

  

  ngOnInit() {
    this.getComptesDebit();
    this.getComptesCredit();
  }


  

getComptesDebit(){
  this.compteservice.getComptesConseiller(this.authService.getId()).subscribe(comptes => this.listeCptDebit = comptes);
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

  



}

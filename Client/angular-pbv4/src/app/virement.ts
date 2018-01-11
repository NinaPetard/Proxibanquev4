import {Client} from './client';
import {Conseiller} from './conseiller';
import{Compte} from './compte';

export class Virement {
compteDebit: number;
compteCredit: number;
montant:number;
conseiller:string;
}
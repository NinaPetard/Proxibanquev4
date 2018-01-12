import {Conseiller} from './conseiller';
import {Compte} from './compte'

export class Client {
    

    constructor(
      public id?: number,
      public nomcli?: string,
      public prenomcli?: string,
      public Adresse?:string,
      public codepostal?:string,
      public Ville?:string,
      public Telephone?:string,
      public Email?:string,
      public loginconseiller?:string,
      comptes?:Compte[]

    ) {  }
  }
import { InMemoryDbService } from 'angular-in-memory-web-api';

export class DataService implements InMemoryDbService {
  createDb() {
    const clients = [
        {"id"  :"1"  ,
        "prenomcli"  :"Richard"  ,
        "nomcli"  :"FOSTER"  ,
        "Adresse"  :"9 RUE DU LAC"  ,
        "codepostal"  :"45900"  ,
        "Ville"  :"LA SOURCE"  ,
        "Telephone"  :"0302345698"  ,
        "Email"  :"r.foster@forbes.com"  ,
        "logincons"  :"pdupond"}  ,
        {"id"  :"9"  ,
        "prenomcli"  :"Albert"  ,
        "nomcli"  :"MOUNIER"  ,
        "Adresse"  :"126 RUE DES MARINS"  ,
        "codepostal"  :"29000"  ,
        "Ville"  :"BREST"  ,
        "Telephone"  :"024857145"  ,
        "Email"  :"a.mounier@hsbc.com"  ,
        "logincons"  :"pdupond"}];

        const comptes = [{"numcompte"  :"711010"   ,
        "id"  :"1"   ,
            "TYPE_COMPTE"  :"courant"   ,
            "dateouv"  :"26/11/2017"   ,
            "solde"  :"300000"   ,
            "decouvert"  :"500"   ,
            "tauxrem"  :"null"}   ,
            {"numcompte"  :"918303"   ,
            "id"  :"3"   ,
            "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"1000000.5"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"916562"   ,
        "id"  :"6"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"2500"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"917417"   ,
        "id"  :"7"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"-100"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"718456"   ,
        "id"  :"2"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"6400.78"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"914302"   ,
        "id"  :"8"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"-300"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"714878"   ,
        "id"  :"9"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"15000"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"911045"   ,
        "id"  :"10"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"3530"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"718167"   ,
        "id"  :"12"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"7530"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"912264"   ,
        "id"  :"11"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"112000.9"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"717694"   ,
        "id"  :"5"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"12500"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"711987"   ,
        "id"  :"13"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"125000"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"719485"   ,
        "id"  :"14"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"7139.36"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"714009"   ,
        "id"  :"15"   ,
        "TYPE_COMPTE"  :"courant"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"1190.07"   ,
        "decouvert"  :"500"   ,
        "tauxrem"  :"null"}   ,
        {"numcompte"  :"728457"   ,
        "id"  :"2"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"75000"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"924695"   ,
        "id"  :"4"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"10000000"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"727610"   ,
        "id"  :"5"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"800000"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"924545"   ,
        "id"  :"3"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"3000000.1"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"927646"   ,
        "id"  :"8"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"100000.09"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"921026"   ,
        "id"  :"10"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"45000"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"728181"   ,
        "id"  :"11"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"958000.37"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"728246"   ,
        "id"  :"12"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"8601.98"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"729930"   ,
        "id"  :"13"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"7823.09"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"728327"   ,
        "id"  :"14"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"802223.74"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"722892"   ,
        "id"  :"15"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"320937"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}   ,
        {"numcompte"  :"928263"   ,
        "id"  :"16"   ,
        "TYPE_COMPTE"  :"epargne"   ,
        "dateouv"  :"26/11/2017"   ,
        "solde"  :"8609483.25"   ,
        "decouvert"  :"null"   ,
        "tauxrem"  :"0.03"}];
        const comptesdupond = [{
          "numcompte"  :"21451"  ,
      
    "id":"9"   ,
    "TYPE_COMPTE"  :"courant"   ,
    "dateouv"  :"5/02/1990"   ,
    "solde"  :"-1000"   ,
    "decouvert"  :"500"   ,
    "tauxrem"  :"null" ,
    "prenomcli"  :"Richard" ,
    "nomcli"  :"FOSTER" ,
    "Adresse"  :"9 RUE DU LAC" ,
    "codepostal"  :"45900" ,
    "Ville"  :"LA SOURCE" ,
    "Telephone"  :"0302345698" ,
    "Email"  :"r.foster@forbes.com" ,
    "logincons"  :"pdupond"} ,
    {"numcompte"  :"657458" ,
    "id"  :"9" ,
    "TYPE_COMPTE"  :"epargne" ,
    "dateouv"  :"3/02/2005" ,
    "solde"  :"13000" ,
    "decouvert"  :"0" ,
    "tauxrem"  :"1" ,
    "prenomcli"  :"Albert" ,
    "nomcli"  :"MOUNIER" ,
    "Adresse"  :"126 RUE DES MARINS" ,
    "codepostal"  :"29000" ,
    "Ville"  :"BREST" ,
    "Telephone"  :"0302345698" ,
    "Email"  :"a.mounier@hsbc.com" ,
    "logincons"  :"pdupond"}  ,
    {"numcompte"  :"711010" ,
    "id":"1" ,
    "TYPE_COMPTE"  :"courant" ,
    "dateouv"  :"26/11/2017" ,
    "solde"  :"300000" ,
    "decouvert"  :"500" ,
    "tauxrem"  :"null" ,
    "prenomcli"  :"Richard" ,
    "nomcli"  :"FOSTER" ,
    "Adresse"  :"9 RUE DU LAC" ,
    "codepostal"  :"45900" ,
    "Ville"  :"LA SOURCE" ,
    "Telephone"  :"0302345698" ,
    "Email"  :"r.foster@forbes.com" ,
    "logincons"  :"pdupond"} ,
    {"numcompte"  :"714878" ,
    "id"  :"1" ,
    "TYPE_COMPTE"  :"epargne" ,
    "dateouv"  :"26/11/2017" ,
    "solde"  :"15000" ,
    "decouvert"  :"" ,
    "tauxrem"  :"3" ,
    "prenomcli"  :"Albert" ,
    "nomcli"  :"MOUNIER" ,
    "Adresse"  :"126 RUE DES MARINS" ,
    "codepostal"  :"29000" ,
    "Ville"  :"BREST" ,
    "Telephone"  :"0302345698" ,
    "Email"  :"a.mounier@hsbc.com" ,
    "logincons"  :"pdupond"}];

    const conseillers = 
      [{"logincons"  :"pdupond","password"  :"toto","prenomcons"  :"Paul","nomcons"  :"Dupond","loginger"  :"jchirac"},{"logincons"  :"jfontaine","password"  :"tutu","prenomcons"  :"Jean","nomcons"  :"Fontaine","loginger"  :"emacron"},{"logincons"  :"rhoareau","password"  :"titi","prenomcons"  :"Remi","nomcons"  :"Hoareau","loginger"  :"fhollande"},{"logincons"  :"psanchez","password"  :"tata","prenomcons"  :"Pierre","nomcons"  :"Sanchez","loginger"  :"jchirac"},{"logincons"  :"pierre.sanchez","password"  :"tyty","prenomcons"  :"Pierre","nomcons"  :"Sanchez","loginger"  :"fhollande"}]
    





    return {clients , comptes, comptesdupond, conseillers};  

  }
}
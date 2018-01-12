import { Component, OnInit } from '@angular/core';
import {ConseillerService} from '../conseiller.service';
import {Conseiller} from '../conseiller'
import {StatsService} from '../stats.service'
import {StatsVir} from '../statsvir';
import { AuthService } from '../authentification.service';

@Component({
  selector: 'app-liste-conseillers',
  templateUrl: './liste-conseillers.component.html',
  styleUrls: ['./liste-conseillers.component.css']
})
export class ListeConseillersComponent implements OnInit {

  private conseillers:Conseiller[];
  private selectedConseiller:Conseiller;
  private statsConseillerVir:StatsVir;

  constructor(private conseillerService:ConseillerService,
    private statsService:StatsService, private authService:AuthService) { }

  ngOnInit() {
    this.getConseillers()
    this.authService.setUserRole("gerant");

  }

  getConseillers(){
    this.conseillerService.getConseillers().subscribe(conseillers => this.conseillers = conseillers);
  }

  afficherStats(conseiller){
    this.selectedConseiller = conseiller;
    this.getStats(conseiller.idConseiller);   
  }

  getStats(idConseiller){
    this.statsService.getStatsVir(idConseiller).subscribe(statsvir => this.statsConseillerVir = statsvir);
    
  }

}

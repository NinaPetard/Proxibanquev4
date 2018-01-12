import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stats-conseiller',
  templateUrl: './stats-conseiller.component.html',
  styleUrls: ['./stats-conseiller.component.css']
  
})
export class StatsConseillerComponent {
  
  public barChartOptions:any = {
    scaleShowVerticalLines: false,
    responsive: true,
    scales: {
    yAxes: [{ticks: {beginAtZero: true}}]
    }
  };


 

  public barChartLabels:string[] = ['janvier', 'février', 'mars', 'avril', 'mai', 'juin'];
  public barChartType:string = 'bar';
  public barChartLegend:boolean = true;
 
  public barChartData:any[] = [
    {data: [65, 59, 80, 81, 56, 55, 40], label: 'Nombre de virement effectués dans le mois'},
  ];

  public barChartLabels2:string[] = ['janvier', 'février', 'mars', 'avril', 'mai', 'juin'];
  public barChartType2:string = 'bar';
  public barChartLegend2:boolean = true;
 
  public barChartData2:any[] = [
    {data: [8000, 7000, 5000, 3000, 4000, 7000, 4000], label: 'Montant viré dans le mois'},
  ];


}

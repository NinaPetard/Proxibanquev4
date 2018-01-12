import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stats-globales',
  templateUrl: './stats-globales.component.html',
  styleUrls: ['./stats-globales.component.css']
})
export class StatsGlobalesComponent{

  public barChartOptions:any = {
    scaleShowVerticalLines: false,
    responsive: true,
    scales: {
    xAxes: [{stacked: true }],
    yAxes: [{ticks: {beginAtZero: true}}]
    }
  };
 

  public barChartLabels:string[] = ['janvier', 'février', 'mars', 'avril', 'mai', 'juin'];
  public barChartType:string = 'bar';
  public barChartLegend:boolean = true;

 
  public barChartData:any[] = [
    {data: [20, 25, 30, 40, 45,50 , 50], label: 'Nombre de clients en règle', stack: '1'},
    {data: [5,5, 8, 3, 3,5, 3], label: 'Nombre de clients à découvert', stack: '1'}
  ];

}

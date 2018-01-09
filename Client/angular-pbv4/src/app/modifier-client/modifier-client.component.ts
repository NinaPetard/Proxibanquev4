import { Component, OnInit, Input} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ClientService} from '../client.service';
import { Client} from '../client';

@Component({
  selector: 'app-modifier-client',
  templateUrl: './modifier-client.component.html',
  styleUrls: ['./modifier-client.component.css']
})
export class ModifierClientComponent implements OnInit {
  
  @Input() client: Client;
  
  constructor(private route: ActivatedRoute,
     private location: Location,
    private clientService: ClientService) {
    
   }

  ngOnInit(): void {
    this.getClient();
  }
  
  getClient(): void {
    const idClient = +this.route.snapshot.paramMap.get('idClient');
    this.clientService.getClient(idClient)
      .subscribe(client => this.client = client);
  }


}

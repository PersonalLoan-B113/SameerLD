import { Component, OnInit, NgModule } from '@angular/core';
import { CustomercommanserviceService } from 'src/app/shared/customercommanservice.service';
import { LedgerDetails } from 'src/app/model/disburement/LedgerDetails';

@Component({
  selector: 'app-ledger-details',
  templateUrl: './ledger-details.component.html',
  styleUrls: ['./ledger-details.component.css']
})
export class LedgerDetailsComponent implements OnInit {

  constructor(private ld:CustomercommanserviceService) { }
ledger=new LedgerDetails();
  ngOnInit() {
    
  }
  ledgerdata(ledger:LedgerDetails)
  {
    this.ld.ledgeradd(this.ledger).subscribe(rs=>{});
  }

}

import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class CustomercommanserviceService {

  constructor(private  http:HttpClient) { }
  
  url="http://localhost:8088";

  ledgeradd(ledger)
  {
    console.log(ledger);
return this.http.post(this.url+"/"+"led",ledger);

  }
}

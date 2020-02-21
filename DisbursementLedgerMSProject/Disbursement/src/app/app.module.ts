import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LedgerDetailsComponent } from './Component/ledger-details/ledger-details.component';
import {FormsModule} from'@angular/forms';
import {HttpClientModule} from '@angular/common/http'
import { CustomercommanserviceService } from './shared/customercommanservice.service';

@NgModule({
  declarations: [
    AppComponent,
    LedgerDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CustomercommanserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

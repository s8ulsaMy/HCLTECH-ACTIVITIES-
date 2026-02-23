import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';   // 👈 import

import { AppComponent } from './app.component';
import { ProperCasePipe } from './proper-case.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ProperCasePipe
  ],
  imports: [
    BrowserModule,
    FormsModule   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

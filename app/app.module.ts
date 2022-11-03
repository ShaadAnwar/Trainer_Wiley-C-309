import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { YellowBackGroundDirective } from './yellow-back-ground.directive';
import { BookDetailsComponent } from './book-details/book-details.component';
import { LogNumber } from './log-number';

@NgModule({
  declarations: [
    AppComponent,
    YellowBackGroundDirective,
    BookDetailsComponent,
    LogNumber
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

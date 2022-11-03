import { Component } from '@angular/core';
import { BookProcessService } from './book-process.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angulardemo3';
  price=5600.75
  pdate=new Date;
  value=10
  name1="angular"

  constructor(bkproces:BookProcessService){
    this.name1=bkproces.processData(this.name1);
  }
}

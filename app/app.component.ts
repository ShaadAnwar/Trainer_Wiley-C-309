import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  projectTitle="Book Application!!"
  mycolor="yellow";
  status=false
  message=""
  classBlue=""
  checkNumber:boolean=false
  colorBlue="blue"
  bookName="Learn Angular"

  showData(){
    //alert("You clicked button")
    this.message="You clicked button"
    this.classBlue="messageclass1";
  }
  checkIt():boolean{
    return this.checkNumber;
  }
}

import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {
  @Input()
  bookData="";

  @Output()
  eventEmitter=new EventEmitter
  constructor() { }

  ngOnInit(): void {
  }

  myevent(){
    this.eventEmitter.emit("Book Data pulled succussfully!!")
  }

}

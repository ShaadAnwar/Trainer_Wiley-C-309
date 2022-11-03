import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {
  bookStatus:boolean=false;
  
    Books=[
    {"BookName":"Learn Java", "BookAuthor":"Peter Gustav"},
    {"BookName":"Angular Professional", "BookAuthor":"Patric Simon"},
    {"BookName":"Spring Microservices", "BookAuthor":"Wilson Jerome"}
  ];
  constructor() { }

  

  ngOnInit(): void {
  }

}

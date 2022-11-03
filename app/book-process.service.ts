import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookProcessService {

  constructor() { }

  processData(data:string):string{
    return data.toUpperCase();
  }

}

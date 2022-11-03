import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appYellowBackGround]'
})

export class YellowBackGroundDirective {

  constructor(eleref:ElementRef) { 
    eleref.nativeElement.style.background="yellow"
  }

}

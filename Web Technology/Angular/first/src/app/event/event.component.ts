import { Component } from '@angular/core';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})

export class EventComponent {
  name='';

  getData(val: any){
    this.name = "Angular Event";
  }

  event(val: string){
    console.log(val);
  }
}

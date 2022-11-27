import { Component } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
  name = "Darshan University";
  
  typeScript(){
    if(this.name === "Darshan University"){
      this.name = "Kishan";
    }else{
      this.name = "Darshan University";
    }
  }
} 

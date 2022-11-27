import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name = 'first';

  faculties = [
    { name: 'kishan', age: 56 },
    { name: 'rohan', age: 89 }
  ]
}

import { Component } from '@angular/core';
import { AddFacultyComponent } from '../addFaculty/add-faculty.component';
import { ApiFacultyService } from '../api-faculty.service';
import { Faculty } from '../faculty';

@Component({
  selector: 'app-faculty',
  templateUrl: './faculty.component.html',
  styleUrls: ['./faculty.component.css']
})
export class FacultyComponent {

  data:Faculty[] = []; 
  constructor(private __api:ApiFacultyService){

  }

  ngOnInit(){
    this.__api.getAllFacultys().subscribe((res:any) => {
        this.data = res;
    });
  }

  delete(id:any){
    this.__api.delete(id).subscribe((res) => {
      this.ngOnInit();
    })
  }

  // update(id: any){
    
  // }
}

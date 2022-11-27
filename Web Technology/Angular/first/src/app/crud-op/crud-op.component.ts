import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Faculty } from '../faculty';


@Component({
  selector: 'app-crud-op',
  templateUrl: './crud-op.component.html',
  styleUrls: ['./crud-op.component.css']
})
export class CrudOpComponent {
  faculties:Faculty[] = [];

  editID = -1;

  myForm = new FormGroup({
    name:new FormControl('', Validators.required),
    age:new FormControl('', Validators.required)
  });

  insert(){
    if(this.editID < 0){
      this.faculties.push(<Faculty>this.myForm.value);
    }else{
      this.faculties[this.editID] = <Faculty>this.myForm.value;
    } 
    this.myForm.controls.name.setValue('');
    this.myForm.controls.age.setValue('');
    this.editID = -1;
  }

  delete(i: any){
    this.faculties.splice(i,1);
  }

  update(i: any){
    this.editID = i;
    this.myForm.controls.name.setValue(this.faculties[i].name);  
    this.myForm.controls.age.setValue(this.faculties[i].age);
  }
}




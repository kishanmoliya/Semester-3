import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiFacultyService } from '../api-faculty.service';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.css']
})
export class AddFacultyComponent {
  id= "-1";
  btnName = "Add-Faculty";
  constructor(private __api:ApiFacultyService, private router:Router, private actRout:ActivatedRoute){

  }

  myForm = new FormGroup({
    FacultyID: new FormControl('',Validators.required),
    FacultyName: new FormControl('',Validators.required),
    FacultyDesignation: new FormControl('',Validators.required),
    FacultyEducationQualification: new FormControl('',Validators.required),
    FacultyExperience: new FormControl('',Validators.required),
    FacultyWorkingSince: new FormControl('',Validators.required),
    FacultyImage: new FormControl('',Validators.required)
  });

  ngOnInit(){
    if(this.actRout.snapshot.params['id']!=null){
      this.btnName = "Edit Faculty"; 
      this.id = this.actRout.snapshot.params['id'];
      this.__api.getById(this.id).subscribe((res:any) => {
      this.myForm.controls.FacultyID.setValue(res.FacultyID);
      this.myForm.controls.FacultyName.setValue(res.FacultyName);
      this.myForm.controls.FacultyDesignation.setValue(res.FacultyDesignation);
      this.myForm.controls.FacultyEducationQualification.setValue(res.FacultyEducationQualification);
      this.myForm.controls.FacultyExperience.setValue(res.FacultyExperience);
      this.myForm.controls.FacultyWorkingSince.setValue(res.FacultyWorkingSince);
      this.myForm.controls.FacultyImage.setValue(res.FacultyImage);
      })
    }
  }

  insert(){
    if(this.id > '0'){
      this.__api.update(this.id, this.myForm.value).subscribe((res) => {
        this.router.navigate(['/faculty']);
      });
    }else{
      this.__api.insert(this.myForm.value).subscribe((res) => {
        this.router.navigate(['/faculty']);
      });
    }    
  }
} 

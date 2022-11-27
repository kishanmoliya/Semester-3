import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiFacultyService } from '../api-faculty.service';
import { Faculty } from '../faculty';

@Component({
  selector: 'app-one-faculty',
  templateUrl: './one-faculty.component.html',
  styleUrls: ['./one-faculty.component.css']
})
export class OneFacultyComponent {
  id = "0";
  data: Faculty = new Faculty();

  constructor(private __actRoute: ActivatedRoute, private __api: ApiFacultyService, private router:Router) {
  }

  ngOnInit() {
      this.id = this.__actRoute.snapshot.params['id'];
      this.__api.getById(this.id).subscribe((res: any) => {
      this.data = res;
    })
  }

  delete(id:any){
      this.__api.delete(this.id).subscribe((res: any) => {
      this.router.navigate(['./faculty']);
    })
  }
}

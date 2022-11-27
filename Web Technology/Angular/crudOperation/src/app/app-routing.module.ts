import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFacultyComponent } from './addFaculty/add-faculty.component';
import { FacultyComponent } from './faculty/faculty.component';
import { HomeComponent } from './home/home.component';
import { OneFacultyComponent } from './one-faculty/one-faculty.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'faculty', component:FacultyComponent},
  {path:'faculty/add', component:AddFacultyComponent},
  {path:'faculty/edit/:id', component:AddFacultyComponent},
  {path:'faculty/:id', component:OneFacultyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

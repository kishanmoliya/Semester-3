import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AllFacultyComponent } from './allFaculty/all-faculty.component';
import { ContactComponent } from './contact/contact.component';
import { Exp10YearComponent } from './exp10year/exp10-year.component';
import { HomeComponent } from './home/home.component';
import { EventComponent } from './event/event.component';
import { CrudOpComponent } from './crud-op/crud-op.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'about', component:AboutComponent},
  {path:'contact', component:ContactComponent},
  {path:'allFaculty', component:AllFacultyComponent},
  {path:'exp10year', component:Exp10YearComponent},
  {path:'event', component:EventComponent},
  {path:'crudOp', component:CrudOpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

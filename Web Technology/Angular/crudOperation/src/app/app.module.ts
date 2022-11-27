import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FacultyComponent } from './faculty/faculty.component';
import { AddFacultyComponent } from './addFaculty/add-faculty.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { OneFacultyComponent } from './one-faculty/one-faculty.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FacultyComponent,
    AddFacultyComponent,
    HeaderComponent,
    FooterComponent,
    OneFacultyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,   //API call Librery.
    ReactiveFormsModule //formGroup, Add Faculty.
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

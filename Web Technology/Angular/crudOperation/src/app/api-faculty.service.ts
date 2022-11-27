import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiFacultyService {
  [x: string]: any;

  constructor(private __http:HttpClient) { }

  ngOnInit(){

  }

  api = 'https://630ed8a23792563418824a76.mockapi.io/facultyAngular';

  getAllFacultys(){
    return this.__http.get(this.api);
  }
 
  getById(id: any){
    return this.__http.get(this.api+'/'+id);
  }

   delete(id: any){
    return this.__http.delete(this.api+'/'+id);
  }

  insert(form: any){
    return this.__http.post(this.api,form);
  }

  update(id:any, form:any){
    return this.__http.put(this.api+'/'+id,form);
  }
}
   
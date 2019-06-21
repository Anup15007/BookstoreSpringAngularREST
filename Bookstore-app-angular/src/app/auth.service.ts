import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }
  getCustomerDetails(){
    return this.http.post('/api/getCustomerDetails',{
      email, password
    }).subscribe(data=>{
      console.log(data,"is what we got from the server")
    })
  }
}

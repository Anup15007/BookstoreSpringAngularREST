import { Component, OnInit } from '@angular/core';
import {AuthService} from "../auth.service";

@Component({
  selector: 'app-login',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor() {private Auth : AuthService }

  ngOnInit() {
  }

  loginAdmin(event){
    event.preventDefault()
    const target = event.target
    const email = target.querySelector('#emailId').value
    const password = target.querySelector('#Spassword').value
    this.Auth.getCustomerDetails(email,password).subscribe(data=>{
      if (data.success){
        //hello
      }
    })
    console.log(email,password)
  }
}

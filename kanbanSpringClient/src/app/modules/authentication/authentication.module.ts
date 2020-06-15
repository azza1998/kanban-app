import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { AuthenticationRoutingModule } from './authentication-routing.module';
import { AuthenticationComponent } from './authentication.component';
import { SignInComponent } from './pages/sign-in/sign-in.component';
import { SignUpComponent } from './pages/sign-up/sign-up.component';



@NgModule({
  declarations: [AuthenticationComponent, SignInComponent, SignUpComponent],
  imports: [
    CommonModule,
    AuthenticationRoutingModule,
    SharedModule
  ]
})
export class AuthenticationModule { }

import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-interest',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './interest.html',
  styleUrl: './interest.css'
})
export class Interest {

  principal: number = 0;
  rate: number = 0;
  time: number = 0;
  simpleInterest: number = 0;

  calculateSI() {
    this.simpleInterest = (this.principal * this.rate * this.time) / 100;
  }
}
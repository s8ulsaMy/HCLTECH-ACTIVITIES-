import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-databinding',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './databinding.html',
  styleUrl: './databinding.css'
})
export class Databinding {

  title = "Angular Data Binding";

  name = "Sanchiti";

  imageUrl = "https://angular.io/assets/images/logos/angular/angular.png";

  inputText = "";
}
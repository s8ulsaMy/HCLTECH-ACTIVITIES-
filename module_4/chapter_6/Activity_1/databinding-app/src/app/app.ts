import { Component } from '@angular/core';
import { Databinding } from './databinding/databinding';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Databinding],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App { }
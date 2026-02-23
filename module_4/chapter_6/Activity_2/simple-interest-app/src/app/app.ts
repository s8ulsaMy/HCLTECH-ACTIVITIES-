import { Component } from '@angular/core';
import { Interest } from './interest/interest';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Interest],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {}
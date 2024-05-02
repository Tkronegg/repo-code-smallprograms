import { Component } from '@angular/core';
import { bootstrapApplication } from '@angular/platform-browser';
import 'zone.js';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './converter.html',
  imports: [FormsModule],
  styleUrls: ['./global_styles.css'],
})
export class App {
  name = 'Angular';
  inputUnit: string = 'metres';
  outputUnit: string = 'metres';
  number: number = 0;
  result: number = 0;
  chooseInputUnit($event: string) {
    this.inputUnit = $event;
    console.log($event);
  }
  chooseOutputUnit(value: string) {
    this.outputUnit = value;
    console.log(value);
  }
  convert() {
    console.log(this.inputUnit);
    console.log(this.outputUnit);
    if (this.inputUnit == 'metres') {
      if (this.outputUnit == 'kilometres') {
        this.result = this.number / 1000;
      }
    }
  }
}

bootstrapApplication(App);

import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {Animal} from "../animal";
import {AnimalService} from "../animal.service";

@Component({
  selector: 'app-animal',
  templateUrl: './animal.component.html',
  styleUrls: ['./animal.component.css']
})
export class AnimalComponent implements OnInit {

  @Input
  animal: Animal;

  @Output
  deleteAnimal = new EventEmitter<Animal>();

  constructor(private animalService: AnimalService) { }

  ngOnInit(): void {
  }


  onDelete(){
    this.animalService.deleteAnimal(this.animal.id).subscribe(
      data => this.deleteAnimal.emit(this.animal),
      error => console.log(error)
    )
  }


}

import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';
import {Animal} from "../animal";
import {AnimalService} from "../animal.service";

@Component({
  selector: 'app-animal-form',
  templateUrl: './animal-form.component.html',
  styleUrls: ['./animal-form.component.css']
})
export class AnimalFormComponent implements OnInit {

  profileForm = new FormGroup({
    name: new FormControl(''),
    sexe: new FormControl(''),
    signeDistinctif : new FormControl(''),
    dateArrive : new FormControl(''),
    dateDepart : new FormControl(''),
  });

  constructor(private animalService: AnimalService) { }

  @Output()
  createAnimal = new EventEmitter<Animal>();

  onSubmit(){
    let animalForm: Animal =  this.profileForm.value;
    this.animalService.createPersonne(animalForm).subscribe(
      data => this.createAnimal.emit(animalForm),
      error => console.log(error)
    );
  }

  ngOnInit(): void {
  }

}

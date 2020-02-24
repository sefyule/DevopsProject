import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import {Animal} from './animal';


@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  constructor(private httpClient: HttpClient) { }

  getAllAnimaux() : Observable<Array<Animal>> {
    return this.httpClient.get<Array<Animal>>('/animaux')
  }

  deleteAnimal(id: number) : Observable<any>{
    return this.httpClient.delete('/animaux/' + id);
  }

  createPersonne(animal : Animal) : Observable<Animal>{
    return this.httpClient.post<Animal>('/animaux', animal);
  }
}

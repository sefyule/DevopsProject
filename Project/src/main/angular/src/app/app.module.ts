import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimauxComponent } from './animaux/animaux.component';
import { AnimauxFormComponent } from './animaux-form/animaux-form.component';
import { AnimalComponent } from './animaux/animal/animal.component';
import { AnimalFormComponent } from './animaux/animal-form/animal-form.component';

@NgModule({
  declarations: [
    AppComponent,
    AnimauxComponent,
    AnimauxFormComponent,
    AnimalComponent,
    AnimalFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

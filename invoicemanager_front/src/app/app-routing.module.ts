import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { AgregarComponent } from './componentes/agregar/agregar.component';


const routes: Routes = [
  {path:'',redirectTo:'inicio',pathMatch:'full'},
  {path:'inicio',component:InicioComponent},
  {path:'agregar',component:AgregarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { Component, OnInit } from '@angular/core';
import { FacturaService } from 'src/app/servicios/factura.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  lista:any=[];
  constructor(private facturaService: FacturaService) { }

  ngOnInit(): void {
    this.listarFacturas();
  }

  listarFacturas()
  {
    this.facturaService.getFacturas().subscribe(
      res=>{this.lista=res},
      err=>console.log(err)
    );
  }

}

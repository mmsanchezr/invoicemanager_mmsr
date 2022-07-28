import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Factura,FacturaService } from 'src/app/servicios/factura.service';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  facturaNueva: Factura={num_factura:0,id_cliente:0,fecha:''}
  constructor(private facturaService:FacturaService, private router:Router) { }

  ngOnInit(): void {
  }

  agregarFactura()
  {
    this.facturaService.saveFactura(this.facturaNueva).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    )
  }

}

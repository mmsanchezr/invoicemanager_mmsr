import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FacturaService {

  url="http://localhost:8080/api/facturas";
  constructor(private http: HttpClient) { }

  getFacturas():Observable<any>{
    return this.http.get(this.url);
  }

  getUnaFacturas(id: string):Observable<any>{
    return this.http.get(this.url+'/'+id);
  }


  saveFactura(factura: Factura):Observable<any>{
    return this.http.post(this.url,factura);
  }

  editFactura(id:string, factura: Factura):Observable<any>{
    return this.http.put(this.url+'/'+id,factura)
  }
}

export interface Factura{
  num_factura:number;
  id_cliente:number;
  fecha:string;

}
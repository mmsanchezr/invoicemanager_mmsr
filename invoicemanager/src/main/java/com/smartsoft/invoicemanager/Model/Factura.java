package com.smartsoft.invoicemanager.Model;

import javax.persistence.*;

@Entity
@Table(name="factura")
public class Factura {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="num_factura")
    private Integer num_factura;

    @Column(name="id_cliente")
    private Integer id_cliente;

    @Column(name="fecha")
    private String fecha;

    public Integer getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(Integer num_factura) {
        this.num_factura = num_factura;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

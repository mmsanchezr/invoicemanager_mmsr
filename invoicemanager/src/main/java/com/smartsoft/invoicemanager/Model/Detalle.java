package com.smartsoft.invoicemanager.Model;

import javax.persistence.*;

@Entity
@Table(name="detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="num_detalle")
    private Integer num_detalle;

    @Column(name="id_factura")
    private Integer id_factura;

    @Column(name="id_producto")
    private Integer id_producto;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="precio")
    private Integer precio;

    public Integer getNum_detalle() {
        return num_detalle;
    }

    public void setNum_detalle(Integer num_detalle) {
        this.num_detalle = num_detalle;
    }

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}

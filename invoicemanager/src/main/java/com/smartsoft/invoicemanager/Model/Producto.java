package com.smartsoft.invoicemanager.Model;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Integer id_producto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private Integer precio;

    @Column(name="stock")
    private Integer stock;

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}

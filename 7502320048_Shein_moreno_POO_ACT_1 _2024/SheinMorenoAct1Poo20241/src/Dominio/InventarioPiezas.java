/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class InventarioPiezas {
private String nombre;
private String modelo;
private String marca;
private Double precioCompra;
private Double precioVenta;
private String tipo;
private int unidades;
private int numeroEntradaPiezas;
private int numeroSalidapiezas;
private String descripcionRemplazoPieza;
private String nombreQuienEntrega;
private List<InventarioPiezas> inventariopiezas;
private MantenimientoPreventivo mantenimientopreventivo;
private MantenimientoCorrectivo mantenimientocorrectivo;


public InventarioPiezas (){
    
}

    public InventarioPiezas(String nombre, String modelo, String marca, Double precioCompra, Double precioVenta, String tipo, int unidades, int numeroEntradaPiezas, int numeroSalidapiezas, String descripcionRemplazoPieza, String nombreQuienEntrega,InventarioPiezas inventariopiezas, MantenimientoPreventivo mantenimientopreventivo, MantenimientoCorrectivo mantenimientocorrectivo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tipo = tipo;
        this.unidades = unidades;
        this.numeroEntradaPiezas = numeroEntradaPiezas;
        this.numeroSalidapiezas = numeroSalidapiezas;
        this.descripcionRemplazoPieza = descripcionRemplazoPieza;
        this.nombreQuienEntrega = nombreQuienEntrega;
        this.inventariopiezas.add(inventariopiezas);
        this.mantenimientopreventivo = mantenimientopreventivo;
        this.mantenimientocorrectivo = mantenimientocorrectivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public String getTipo() {
        return tipo;
    }

    public int getUnidades() {
        return unidades;
    }

    public int getNumeroEntradaPiezas() {
        return numeroEntradaPiezas;
    }

    public int getNumeroSalidapiezas() {
        return numeroSalidapiezas;
    }

    public String getDescripcionRemplazoPieza() {
        return descripcionRemplazoPieza;
    }

    public String getNombreQuienEntrega() {
        return nombreQuienEntrega;
    }

    public List<InventarioPiezas> getInventariopiezas() {
        return this.inventariopiezas;
    }

    public MantenimientoPreventivo getMantenimientopreventivo() {
        return mantenimientopreventivo;
    }

    public MantenimientoCorrectivo getMantenimientocorrectivo() {
        return mantenimientocorrectivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setNumeroEntradaPiezas(int numeroEntradaPiezas) {
        this.numeroEntradaPiezas = numeroEntradaPiezas;
    }

    public void setNumeroSalidapiezas(int numeroSalidapiezas) {
        this.numeroSalidapiezas = numeroSalidapiezas;
    }

    public void setDescripcionRemplazoPieza(String descripcionRemplazoPieza) {
        this.descripcionRemplazoPieza = descripcionRemplazoPieza;
    }

    public void setNombreQuienEntrega(String nombreQuienEntrega) {
        this.nombreQuienEntrega = nombreQuienEntrega;
    }

    @Override
    public String toString() {
        return "InventarioPiezas{" + "nombre=" + nombre + ",\n modelo=" + modelo + ",\n marca=" + marca + ",\n precioCompra=" + precioCompra + ",\n precioVenta=" + precioVenta + ",\n tipo=" + tipo + ",\n unidades=" + unidades + ",\n numeroEntradaPiezas=" + numeroEntradaPiezas + ",\n numeroSalidapiezas=" + numeroSalidapiezas + ",\n descripcionRemplazoPieza=" + descripcionRemplazoPieza + ",\n nombreQuienEntrega=" + nombreQuienEntrega + '}';
    }
    
    

    


    
}
/*+inventarioPiezas();
+getNombre()
+getModelo()
+getMarca()
+getPrecioCompra()
+setPrecioCompra()
+getPrecioVenta()
+setPrecioVenta()
+getTipo()
+setTipo()
+getUnidades()
+setUnidades()
+getEntradaPiezas()
+getSalidaPiezas()
+getDescripcionRemplazoPieza()
+getNombreQuienEntrega()
+getInventarioPiezas()
+setInventarioPiezas()
*/
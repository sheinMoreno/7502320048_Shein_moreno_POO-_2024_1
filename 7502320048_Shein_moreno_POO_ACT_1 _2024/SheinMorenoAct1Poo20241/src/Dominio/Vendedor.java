/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */



public class Vendedor  {
private String nombreCliente;
private Double venta;
private String vehiculoVendido ;
private Date fechaVentas;
private Date garantia;
private Empleado empleado;
private CatalogoVehiculos catalogoVehiculos;
private List<CatalogoVehiculos> listaVehiculos;

public Vendedor(){
    
}

    public Vendedor(String nombreCliente, Double venta, String vehiculoVendido, Date fechaVentas, Date garantia, Empleado empleado, CatalogoVehiculos catalogoVehiculos, CatalogoVehiculos listaVehiculos) {
        this.nombreCliente = nombreCliente;
        this.venta = venta;
        this.vehiculoVendido = vehiculoVendido;
        this.fechaVentas = fechaVentas;
        this.garantia = garantia;
        this.empleado = empleado;
        this.catalogoVehiculos = catalogoVehiculos;
        this.listaVehiculos.add(listaVehiculos);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Double getVenta() {
        return venta;
    }

    public String getVehiculoVendido() {
        return vehiculoVendido;
    }

    public Date getFechaVentas() {
        return fechaVentas;
    }

    public Date getGarantia() {
        return garantia;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public CatalogoVehiculos getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public List<CatalogoVehiculos> getListaVehiculos() {
        return  this.listaVehiculos;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setVenta(Double venta) {
        this.venta = venta;
    }

    public void setVehiculoVendido(String vehiculoVendido) {
        this.vehiculoVendido = vehiculoVendido;
    }

    public void setFechaVentas(Date fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombreCliente=" + nombreCliente + ",\n venta=" + venta + ",\n vehiculoVendido=" + vehiculoVendido + ",\n fechaVentas=" + fechaVentas + ", \ngarantia=" + garantia + '}';
    }
    

    
}
/*+Vendedor();
+getNombreCliente()
+getVenta()
+getListadeVehiculos()
+getFechaVenta()
+getGarantia()
+getEmpleado empleado()
+getCatalogoVehiculos vehiculos()
+getListaVehiculos()
*/
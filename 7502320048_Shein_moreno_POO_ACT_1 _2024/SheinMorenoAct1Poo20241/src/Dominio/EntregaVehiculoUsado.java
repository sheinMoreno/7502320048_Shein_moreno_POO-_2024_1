/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class EntregaVehiculoUsado {
private String modelo;
private String marca;
private String matricula;
private Double precioTasacion;
private Date fechaEntrega;
private Cliente cliente;

public EntregaVehiculoUsado (){
    
}

   public EntregaVehiculoUsado(String modelo, String marca, String matricula, Double precioTasacion, Date fechaEntrega, Cliente cliente) {
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.precioTasacion = precioTasacion;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getPreciotasacion() {
        return precioTasacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecioTasacion(Double precioTasacion) {
        this.precioTasacion = precioTasacion;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "EntregaVehiculoUsado{" + "modelo=" + modelo + ",\n marca=" + marca + ",\n matricula=" + matricula + ",\n precioTasacion=" + precioTasacion + ",\n fechaEntrega=" + fechaEntrega + '}';
    }
 
        
        
        
        
}
/*+EntregaVehiculoUsado();
+getModelo()
+getMarca()
+getMatricula()
+getPrecioTasacion()
+getFechaEntrega()
+getCliente cliente()
*/
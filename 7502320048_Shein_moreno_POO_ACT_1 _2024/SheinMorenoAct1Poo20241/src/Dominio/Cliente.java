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
public class Cliente extends Usuario  {
private String historialMantemiento;
private Date programacionCitaServicio;
private Double pagosEnLinea;
private SistemaGestion sistemaGestion;
private EntregaVehiculoUsado entregaVehiculoUsado;

public Cliente () {
    
    
}

public Cliente (String historialMantemiento,Date programacionCitaServicio,Double pagosEnLinea,SistemaGestion sistemaGestion,EntregaVehiculoUsado entregaVehiculoUsado ){
  this.historialMantemiento = historialMantemiento;
  this.programacionCitaServicio = programacionCitaServicio;
  this.pagosEnLinea = pagosEnLinea;
  this.sistemaGestion = sistemaGestion;
  this.entregaVehiculoUsado = entregaVehiculoUsado;   

}
public String getHistorialMantemiento(){
    return historialMantemiento;
}


public Date getProgramacionCitaCervicio(){
    return programacionCitaServicio;
}


public Double getPagosLinea(){
    return pagosEnLinea;
}

public void setPagosLinea(Double pagosLinea){
    this.pagosEnLinea = pagosLinea;
    
}
public SistemaGestion getSistemagestion() {
        return sistemaGestion;
    }

    public EntregaVehiculoUsado getEntregavehiculousado() {
        return entregaVehiculoUsado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "historialMantemiento=" + historialMantemiento + ",\n programarCitasCervicios=" + programacionCitaServicio + ",\n pagosLinea=" + pagosEnLinea + '}';
    }



   
}
/*+Cliente();
+getHistorialMantemiento()
+getProgramarCitasCervicios()
+getPagosenLinea()
+getSistemaGestion sistemaGestion()
+getEntregaVehiculoUsado entregavehiculousado()
   */ 
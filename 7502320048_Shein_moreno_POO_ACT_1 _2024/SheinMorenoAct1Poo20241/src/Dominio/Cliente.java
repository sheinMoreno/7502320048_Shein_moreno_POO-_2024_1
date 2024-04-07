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
private Date programacionCitaCervicio;
private Double pagosEnLinea;
private SistemaGestion sistemaGestion;
private EntregaVehiculoUsado entregavehiculousado;

public Cliente () {
    
    
}

public Cliente (String historialMantemiento,Date programacionCitaCervicio,Double pagosEnLinea,SistemaGestion sistemaGestion,EntregaVehiculoUsado entregavehiculousado ){
  this.historialMantemiento = historialMantemiento;
  this.programacionCitaCervicio = programacionCitaCervicio;
  this.pagosEnLinea = pagosEnLinea;
  this.sistemaGestion = sistemaGestion;
  this.entregavehiculousado = entregavehiculousado;   

}
public String getHistorialMantemiento(){
    return historialMantemiento;
}


public Date getProgramacionCitaCervicio(){
    return programacionCitaCervicio;
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
        return entregavehiculousado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "historialMantemiento=" + historialMantemiento + ",\n programarCitasCervicios=" + programacionCitaCervicio + ",\n pagosLinea=" + pagosEnLinea + '}';
    }



   
}
/*+Cliente();
+getHistorialMantemiento()
+getProgramarCitasCervicios()
+getPagosenLinea()
+getSistemaGestion sistemaGestion()
+getEntregaVehiculoUsado entregavehiculousado()
   */ 
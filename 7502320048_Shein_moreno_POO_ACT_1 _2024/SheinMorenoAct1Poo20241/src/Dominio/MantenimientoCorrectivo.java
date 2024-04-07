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
public class MantenimientoCorrectivo {
private String drescripcionMatenimiento;
private String quienRealizoMantenimiento;
private String nombrePieza;
private Double precioPieza;
private Double precioMantenimiento;
private SistemaGestion sistemagestion;
private List <InventarioPiezas> inventarioPiezas;

public MantenimientoCorrectivo (){

}    

    public MantenimientoCorrectivo(String drescripcionMatenimiento, String quienRealizoMantenimiento, String nombrePieza, Double precioPieza, Double precioMantenimiento, SistemaGestion sistemagestion, InventarioPiezas inventarioPiezas ) {
        this.drescripcionMatenimiento = drescripcionMatenimiento;
        this.quienRealizoMantenimiento = quienRealizoMantenimiento;
        this.nombrePieza = nombrePieza;
        this.precioPieza = precioPieza;
        this.precioMantenimiento = precioMantenimiento;
        this.sistemagestion = sistemagestion;
        this.inventarioPiezas.add(inventarioPiezas);
    }

    public String getDrescripcionMatenimiento() {
        return drescripcionMatenimiento;
    }

    public String getQienRealizoMantenimiento() {
        return quienRealizoMantenimiento;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public Double getPrecioPieza() {
        return precioPieza;
    }

    public Double getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public SistemaGestion getSistemagestion() {
        return sistemagestion;
    }

    public List<InventarioPiezas> getInventarioPiezas() {
        return this.inventarioPiezas;
    }

    public void setDrescripcionMatenimiento(String drescripcionMatenimiento) {
        this.drescripcionMatenimiento = drescripcionMatenimiento;
    }

    public void setQienRealizoMantenimiento(String qienRealizoMantenimiento) {
        this.quienRealizoMantenimiento = qienRealizoMantenimiento;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public void setPrecioPieza(Double precioPieza) {
        this.precioPieza = precioPieza;
    }

    public void setPrecioMantenimiento(Double precioMantenimiento) {
        this.precioMantenimiento = precioMantenimiento;
    }

    @Override
    public String toString() {
        return "MantenimientoCorrectivo{" + "drescripcionMatenimiento=" + drescripcionMatenimiento + ",\n qienRealizoMantenimiento=" + quienRealizoMantenimiento + ",\n nombrePieza=" + nombrePieza + ",\n precioPieza=" + precioPieza + ",\n precioMantenimiento=" + precioMantenimiento + '}';
    }
    
    


}
/*+MantenimientoCorrectivo();
+getDrescripcionMatenimiento()
+getQuienRealizoMantemineto()
+getNombrePiezao()
+getPrecioPieza()
+getPrecioMantenimiento()
+getSistemaGestion sistemagestion()
+getInventarioPiezas()
*/
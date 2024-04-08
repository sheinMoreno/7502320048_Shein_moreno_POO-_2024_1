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
public class MantenimientoPreventivo {
private int id;
private Date mantenimientoProgramado;
private String drescripcionMatenimiento;
private String quienRealizoMantenimiento;
private String nombrePieza;
private Double precioMantenimiento;
private SistemaGestion sistemagestion;
private List <InventarioPiezas> inventarioPiezas;

private MantenimientoPreventivo (){
    
}

    public MantenimientoPreventivo(int id, Date mantenimientoProgramado, String drescripcionMatenimiento, String quienRealizoMantenimiento, String nombrePieza, Double precioMantenimiento, SistemaGestion sistemagestion, InventarioPiezas inventarioPiezas) {
        this.id = id;
        this.mantenimientoProgramado = mantenimientoProgramado;
        this.drescripcionMatenimiento = drescripcionMatenimiento;
        this.quienRealizoMantenimiento = quienRealizoMantenimiento;
        this.nombrePieza = nombrePieza;
        this.precioMantenimiento = precioMantenimiento;
        this.sistemagestion = sistemagestion;
        this.inventarioPiezas.add(inventarioPiezas);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Date getMantenimientoProgramado() {
        return mantenimientoProgramado;
    }

    public String getDrescripcionMatenimiento() {
        return drescripcionMatenimiento;
    }

    public String getQuienRealizoMantenimiento() {
        return quienRealizoMantenimiento;
    }

    public String getNombrePieza() {
        return nombrePieza;
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

    public void setMantenimientoProgramado(Date mantenimientoProgramado) {
        this.mantenimientoProgramado = mantenimientoProgramado;
    }

    public void setDrescripcionMatenimiento(String drescripcionMatenimiento) {
        this.drescripcionMatenimiento = drescripcionMatenimiento;
    }

    public void setQuienRealizoMantenimiento(String quienRealizoMantenimiento) {
        this.quienRealizoMantenimiento = quienRealizoMantenimiento;
    }

    @Override
    public String toString() {
        return "MantenimientoPreventivo{" + "id="+id+"\nmantenimientoProgramado=" + mantenimientoProgramado + ",\n drescripcionMatenimiento=" + drescripcionMatenimiento + ",\n quienRealizoMantenimiento=" + quienRealizoMantenimiento + ",\n nombrePieza=" + nombrePieza + ",\n precioMantenimiento=" + precioMantenimiento + '}';
    }






}   

/*+getMantenimientoProgramado
+getDrescripcionMatenimiento()
+getQuienRealizoMatenimiento()
+getNombrePieza()
+getPrecioMantenimiento()
+getSistemaGestion sistemagestion()
+getInventarioPiezas()
*/
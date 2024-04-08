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
public class SistemaGestion {
private int id;
private Date fechasMantenimientos;
private String garantiasVehiculo;
private String notificacionClinetes;
private Cliente cliente;
private MantenimientoPreventivo mantenimientopreventivo;
private MantenimientoCorrectivo mantenimientocorrectivo;


public SistemaGestion (){
    
}

    public SistemaGestion(int id ,Date fechasMantenimientos, String garantiasVehiculo, String notificacionClinetes, Cliente cliente, MantenimientoPreventivo mantenimientopreventivo, MantenimientoCorrectivo mantenimientocorrectivo) {
        this.id = id;
        this.fechasMantenimientos = fechasMantenimientos;
        this.garantiasVehiculo = garantiasVehiculo;
        this.notificacionClinetes = notificacionClinetes;
        this.cliente = cliente;
        this.mantenimientopreventivo = mantenimientopreventivo;
        this.mantenimientocorrectivo = mantenimientocorrectivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Date getFechasMantenimientos() {
        return fechasMantenimientos;
    }

    public String getGarantiasVehiculo() {
        return garantiasVehiculo;
    }

    public String getNotificacionClinetes() {
        return notificacionClinetes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public MantenimientoPreventivo getMantenimientopreventivo() {
        return mantenimientopreventivo;
    }

    public MantenimientoCorrectivo getMantenimientocorrectivo() {
        return mantenimientocorrectivo;
    }

    public void setFechasMantenimientos(Date fechasMantenimientos) {
        this.fechasMantenimientos = fechasMantenimientos;
    }

    public void setGarantiasVehiculo(String garantiasVehiculo) {
        this.garantiasVehiculo = garantiasVehiculo;
    }

    public void setNotificacionClinetes(String notificacionClinetes) {
        this.notificacionClinetes = notificacionClinetes;
    }

    @Override
    public String toString() {
        return "SistemaGestion{" + "id="+id+"\n fechasMantenimientos=" + fechasMantenimientos + ",\n garantiasVehiculo=" + garantiasVehiculo + ",\n notificacionClinetes=" + notificacionClinetes + '}';
    }






}
/*+SistemaGestion();
+getFechasMantenimientos()
+getGarantiasVehiculo()
+getNotificacionClinetes()
+getMantenimientoPreventivo mantenimientopreventivo()
+getMantenimientoCorrectivo mantenimientocorrectivo()
*/
    


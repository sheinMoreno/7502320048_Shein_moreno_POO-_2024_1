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
public class OpcionesAdicionales {
private String pinturaMetalizada;
private String aireAcondicionado;
private List <OpcionesAdicionales> opcionesAdicionales;
private CatalogoVehiculos catalogovehiulos;

public OpcionesAdicionales (){
    
}

    public OpcionesAdicionales(String pinturaMetalizada, String aireAcondicionado, OpcionesAdicionales opcionesAdicionales, CatalogoVehiculos catalogovehiulos) {
        this.pinturaMetalizada = pinturaMetalizada;
        this.aireAcondicionado = aireAcondicionado;
        this.opcionesAdicionales.add(opcionesAdicionales);
        this.catalogovehiulos = catalogovehiulos;
    }

    public String getPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public String getAireAcondicionado() {
        return aireAcondicionado;
    }

    public List<OpcionesAdicionales> getOpcionesAdicionales() {
        return this.opcionesAdicionales;
    }

    public CatalogoVehiculos getCatalogovehiulos() {
        return catalogovehiulos;
    }

    public void setPinturaMetalizada(String pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "OpcionesAdicionales{" + "pinturaMetalizada=" + pinturaMetalizada + ",\n aireAcondicionado=" + aireAcondicionado + '}';
    }
    
        
    
}
/*+pcionesAdicionales();
+getPinturaMetalizada()
+getAireAcondicionado()
+getOpcionesadicionales()
+getCatalogoVehiculos catalogovehiulos()
*/
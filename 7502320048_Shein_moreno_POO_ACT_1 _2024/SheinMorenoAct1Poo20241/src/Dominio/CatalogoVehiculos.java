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
public class CatalogoVehiculos {
private int id;    
private String modelo;
private String marca;
private String cilindrada;
private String precio;
private List<CatalogoVehiculos> listaVehiculos;
private Vendedor vendedor;
private List<OpcionesAdicionales> opcionesAdicionales;

public CatalogoVehiculos (){
    
}
public CatalogoVehiculos (int id,String modelo,String marca,String cilindrada,String precio,CatalogoVehiculos listaVehiculos,Vendedor vendedor,OpcionesAdicionales opcionesAdicionales ){
  this.id = id;
  this.modelo = modelo;
  this.marca = marca; 
  this.cilindrada = cilindrada;
  this.precio = precio;
  this.listaVehiculos.add(listaVehiculos);
  this.vendedor = vendedor;
  this.opcionesAdicionales.add(opcionesAdicionales); 
  
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

public String getModelo(){
    return modelo;
}

public void setModelo(String modelo){
    this.modelo = modelo;
}
public String getMarca(){
  return marca;  
}
public void setMarca(String marca){
    this.marca = marca;
}
public String getCilindrada(){
    return cilindrada;
}
public void setCilndrada(String cilindrada){
    this.cilindrada = cilindrada;
}
public String getPrecio(){
    return precio;
}
public void setPrecio(String precio){
    this.precio = precio;
}  


public List<CatalogoVehiculos> getListaVehiculos(){
    return this.listaVehiculos;
}
public Vendedor getVendedor(){
    return vendedor; 
}
public List<OpcionesAdicionales> getOpcionesAdicionales(){
    return this.opcionesAdicionales;
}

    @Override
    public String toString() {
        return "CatalogoVehiculos{" + "id="+id+",\n modelo=" + modelo + ",\n marca=" + marca + ",\n cilindrada=" + cilindrada + ", \n precio=" + precio + '}';
    }




    

    
}
/*+getModelo()
+getMarca()
+getCilindrada()
+getPrecio()
+getPlaca()
+getListvehiculos8()
+getEmpleado empleado()
+getOpcionesadicionales()

*/
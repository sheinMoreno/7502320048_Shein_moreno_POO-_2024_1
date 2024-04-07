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
public class Empleado extends Usuario  {
private String rol;
private List <Usuario>listaEmpleados;
private Vendedor vendedor;

public Empleado (){
    
} 
public Empleado(String rol, Usuario listaUsuarios, Vendedor vendedor) {
        this.rol = rol;
        this.listaEmpleados.add(listaUsuarios);
        this.vendedor = vendedor;
    }

 public String getRol() {
        return rol;
    }

    public List<Usuario> getListaUsuarios() {
        return this.listaEmpleados;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

public void setRol(String rol) {
        this.rol = rol;
    }

   
    @Override
    public String toString() {
        return "Empleado{" + "rol=" + rol + '}';
    }
/*+Empleado();
+getRol()
+getListausuarios()
+getVendedor vendedor()
 */   
    

    
}

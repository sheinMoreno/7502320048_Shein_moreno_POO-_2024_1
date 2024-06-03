/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ASUS
 */
public class Usuario {
    
 private String id; 
 private String nombre;
 private String telefono;
 private String direccion;
 private String correo;
 
  Usuario (){
    
 }

    public Usuario(String id, String nombre, String telefono, String direccion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getDni() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setDni(String dni) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "dni=" + id + ",\n nombre=" + nombre + ",\n telefono=" + telefono + ",\n direccion=" + direccion + ",\n correo=" + correo + '}';
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 
 
 
}

/*+Usuario();
 +getId()
 +getNombre()
 +getTelefono()
 +setTelefono()
 +getDireccion()
 +setDireccion()
 +getCorreo()
 +setCorreo()
*/
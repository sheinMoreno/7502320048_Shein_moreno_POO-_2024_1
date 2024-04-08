/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.Empleado;
import Dominio.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class EmpleadoCrud implements ICrudModel<Empleado> {

  private HashMap<String, Empleado> bdEmpleado;

    @Override
    public void agregar(Empleado objeto) throws Exception {
        try {
            if(bdEmpleado.containsKey(objeto.getDni()))
              throw new Exception("El Empleado ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public Empleado buscar(Empleado objeto) throws Exception {
        try {
            if(!bdEmpleado.containsKey( objeto.getDni())){
                throw new Exception("El objeto no existe." );
            }
            return bdEmpleado.get(objeto.getDni());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(Empleado objeto) throws Exception {
        try {
            if(!bdEmpleado.containsKey(objeto.getDni())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdEmpleado.put(objeto.getDni(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(Empleado objeto) throws Exception {
        try {
            if(!bdEmpleado.containsKey(objeto.getDni())){
                throw new Exception("el objeto no existe");
            }
            bdEmpleado.remove(objeto.getDni());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<Empleado> listarTodo() throws Exception {
        List<Empleado> empleados =new ArrayList<>();
        try {
            if(bdEmpleado.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<String, Empleado> dni : bdEmpleado.entrySet()) {
                Object key = dni.getKey();
                Empleado empleado= dni.getValue();
                empleados.add(empleado);
                
            }
            return empleados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<Empleado> numeroUsuario=listarTodo();
        int NumeroUsuarios = 0;
        try {
            NumeroUsuarios = numeroUsuario.size();
            if(NumeroUsuarios ==0){
              throw new Exception("No tiene elementos.");   
            }
            return NumeroUsuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
      
    
}

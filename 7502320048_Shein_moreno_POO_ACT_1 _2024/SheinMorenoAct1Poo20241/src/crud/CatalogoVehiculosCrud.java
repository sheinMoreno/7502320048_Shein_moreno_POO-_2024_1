/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.CatalogoVehiculos;
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
public class CatalogoVehiculosCrud implements ICrudModel<CatalogoVehiculos>{
    
    private HashMap<String, CatalogoVehiculosCrud> bdCatalogoVehiculosCrud;

    @Override
    public void agregar(CatalogoVehiculosCrud objeto) throws Exception {
        try {
            if(bdCatalogoVehiculosCrud.containsKey(objeto.getId()))
              throw new Exception("El objeto ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public CatalogoVehiculosCrud buscar(CatalogoVehiculosCrud objeto) throws Exception {
        try {
            if(!bdCatalogoVehiculosCrud.containsKey( objeto.getId())){
                throw new Exception("El objeto no existe." );
            }
            return bdCatalogoVehiculosCrud.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(CatalogoVehiculosCrud objeto) throws Exception {
        try {
            if(!bdCatalogoVehiculosCrud.containsKey(objeto.getId())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdCatalogoVehiculosCrud.put(objeto.getId(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(CatalogoVehiculosCrud objeto) throws Exception {
        try {
            if(!bdCatalogoVehiculosCrud.containsKey(objeto.getId())){
                throw new Exception("el objeto no existe");
            }
            bdCatalogoVehiculosCrud.remove(objeto.getId());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<CatalogoVehiculosCrud> listarTodo() throws Exception {
        List<CatalogoVehiculosCrud> usuarios =new ArrayList<>();
        try {
            if(bdCatalogoVehiculosCrud.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<String, Usuario> dni : bdCatalogoVehiculosCrud.entrySet()) {
                Object key = dni.getKey();
                Usuario usuario= dni.getValue();
                usuarios.add(usuario);
                
            }
            return usuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<CatalogoVehiculosCrud> numeroUsuario=listarTodo();
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

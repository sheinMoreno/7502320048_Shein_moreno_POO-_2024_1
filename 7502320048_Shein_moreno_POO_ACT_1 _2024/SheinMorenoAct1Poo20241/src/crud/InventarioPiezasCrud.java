/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.InventarioPiezas;
import Dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class InventarioPiezasCrud implements ICrudModel<bdInventarioPiezas>{

   @Override
    public void agregar(InventarioPiezas objeto) throws Exception {
        try {
            if(bdInventarioPiezas.containsKey(objeto.getId()))
              throw new Exception("El usuario ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public InventarioPiezas buscar(InventarioPiezas objeto) throws Exception {
        try {
            if(!bdInventarioPiezas.containsKey( objeto.getId())){
                throw new Exception("El objeto no existe." );
            }
            return bdInventarioPiezas.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(InventarioPiezas objeto) throws Exception {
        try {
            if(!bdInventarioPiezas.containsKey(objeto.getId())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdInventarioPiezas.put(objeto.getId(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(InventarioPiezas objeto) throws Exception {
        try {
            if(!bdInventarioPiezas.containsKey(objeto.getId())){
                throw new Exception("el objeto no existe");
            }
            bdInventarioPiezas.remove(objeto.getId());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<InventarioPiezas> listarTodo() throws Exception {
        List<InventarioPiezas> inventarioPieza =new ArrayList<>();
        try {
            if(bdInventarioPiezas.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<String, Usuario> dni : bdInventarioPiezas.entrySet()) {
                Object key = dni.getKey();
                Usuario inventarioPiezas= dni.getValue();
                inventarioPieza.add(inventarioPiezas);
                
            }
            return inventarioPieza;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<InventarioPiezas> numeroDePiezas=listarTodo();
        int NumeroUsuarios = 0;
        try {
            NumeroUsuarios = numeroDePiezas.size();
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

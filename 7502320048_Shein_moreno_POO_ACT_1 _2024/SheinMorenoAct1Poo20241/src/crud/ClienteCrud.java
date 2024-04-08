/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class ClienteCrud implements ICrudModel<Cliente>{

  private HashMap<String, Cliente> bdCliente;

    @Override
    public void agregar(Cliente objeto) throws Exception {
        try {
            if(bdCliente.containsKey(objeto.getDni()))
              throw new Exception("El Cliente ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public Cliente buscar(Cliente objeto) throws Exception {
        try {
            if(!bdCliente.containsKey( objeto.getDni())){
                throw new Exception("El objeto no existe." );
            }
            return bdCliente.get(objeto.getDni());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(Cliente objeto) throws Exception {
        try {
            if(!bdCliente.containsKey(objeto.getDni())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdCliente.put(objeto.getDni(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(Cliente objeto) throws Exception {
        try {
            if(!bdCliente.containsKey(objeto.getDni())){
                throw new Exception("el objeto no existe");
            }
            bdCliente.remove(objeto.getDni());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<Cliente> listarTodo() throws Exception {
        List<Cliente> clientes =new ArrayList<>();
        try {
            if(bdCliente.isEmpty()){
                throw new Exception("No existe el elemto en la lista.");
            }
            for (Map.Entry<String, Cliente> dni : bdCliente.entrySet()) {
                //Object key = dni.getKey();
                Cliente usuario= dni.getValue();
                clientes.add(usuario);
                
            }
            return clientes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<Cliente> numeroUsuario=listarTodo();
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

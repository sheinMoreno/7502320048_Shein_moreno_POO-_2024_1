/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.Usuario;
import Dominio.Vendedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class VendedorCrud implements ICrudModel<Vendedor>{

    private HashMap<String, Vendedor> bdVendedor;

    @Override
    public void agregar(Vendedor objeto) throws Exception {
        try {
            if(bdVendedor.containsKey(objeto.getId()))
              throw new Exception("El usuario ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public Vendedor buscar(Vendedor objeto) throws Exception {
        try {
            if(!bdVendedor.containsKey( objeto.getId())){
                throw new Exception("El objeto no existe." );
            }
            return bdVendedor.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(Vendedor objeto) throws Exception {
        try {
            if(!bdVendedor.containsKey(objeto.getId())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdVendedor.put(objeto.getId(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(Vendedor objeto) throws Exception {
        try {
            if(!bdVendedor.containsKey(objeto.getId())){
                throw new Exception("el objeto no existe");
            }
            bdVendedor.remove(objeto.getId());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<Vendedor> listarTodo() throws Exception {
        List<Vendedor> vendedores =new ArrayList<>();
        try {
            if(bdVendedor.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<String, Vendedor> dni : bdVendedor.entrySet()) {
                Object key = dni.getKey();
                Vendedor vendedor= dni.getValue();
                vendedores.add(vendedor);
                
            }
            return vendedores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<Vendedor> numeroUsuario=listarTodo();
        int NumeroVendedores = 0;
        try {
            NumeroVendedores = numeroUsuario.size();
            if(NumeroVendedores ==0){
              throw new Exception("No tiene elementos.");   
            }
            return NumeroVendedores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}

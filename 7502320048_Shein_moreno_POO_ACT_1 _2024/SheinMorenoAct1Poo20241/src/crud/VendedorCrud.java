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

    private HashMap<Integer, Vendedor> bdVendedor;

    @Override
    public void agregar(Vendedor objeto) throws Exception {
      try {
            if (bdVendedor.containsKey(objeto.getId())) {
                throw new Exception("El vendedor no esta tregistrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }

    @Override
    public Vendedor buscar(Vendedor objeto) throws Exception {
        try {
            if (!bdVendedor.containsKey(objeto.getId())) {
                throw new Exception("El vendedor no existe.");
                   
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
            if (!bdVendedor.containsKey(objeto.getId())) {
                throw new Exception("El vendedor no esta registrado.");
                
            }
            bdVendedor.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(Vendedor objeto) throws Exception {
       try {
            if (bdVendedor.containsKey(objeto.getId())) {
                throw new Exception("El objeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    @Override
    public List<Vendedor> listarTodo() throws Exception {
       List<Vendedor> vendedor = new ArrayList<>();
        try {
            if(bdVendedor.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, Vendedor> entry : bdVendedor.entrySet()) {
                int key = entry.getKey();
                 Vendedor vendedores = entry.getValue();
                 vendedor.add(vendedores);
                
            }
            return vendedor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
       List<Vendedor> numeroVendedores=listarTodo();
        int NumeroVendedores =0;
        try {
            NumeroVendedores = numeroVendedores.size();
            if (NumeroVendedores  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroVendedores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        } 
    

    

    
 
}

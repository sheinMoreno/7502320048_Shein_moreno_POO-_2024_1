/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.CatalogoVehiculos;
import Dominio.InventarioPiezas;
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
public class InventarioPiezasCrud implements ICrudModel<InventarioPiezas>{
    private HashMap<Integer,InventarioPiezas > bdInventarioPiezas;

    @Override
    public void agregar(InventarioPiezas objeto) throws Exception {
        
        try {
            if (bdInventarioPiezas.containsKey(objeto.getId())) {
                throw new Exception("La pieza ya esta registrada.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }

    @Override
    public InventarioPiezas buscar(InventarioPiezas objeto) throws Exception {
       try {
            if (!bdInventarioPiezas.containsKey(objeto.getId())) {
                throw new Exception("La pieza no existe.");
                   
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
            if (!bdInventarioPiezas.containsKey(objeto.getId())) {
                throw new Exception("La pieza no esta registrado.");
                
            }
            bdInventarioPiezas.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(InventarioPiezas objeto) throws Exception {
        try {
            if (bdInventarioPiezas.containsKey(objeto.getId())) {
                throw new Exception("El objeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<InventarioPiezas> listarTodo() throws Exception {
        List<InventarioPiezas> inventarioPiezas = new ArrayList<>();
        try {
            if(bdInventarioPiezas.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, InventarioPiezas> entry : bdInventarioPiezas.entrySet()) {
                int key = entry.getKey();
                 InventarioPiezas piezas = entry.getValue();
                 inventarioPiezas.add(piezas);
                
            }
            return inventarioPiezas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<InventarioPiezas> numeropiezas=listarTodo();
        int NumeroPiezas =0;
        try {
            NumeroPiezas = numeropiezas.size();
            if (NumeroPiezas  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroPiezas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        }
    }

   

    
    
    


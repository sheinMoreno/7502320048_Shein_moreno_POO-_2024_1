/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.CatalogoVehiculos;
import Dominio.Cliente;
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
    
  private HashMap<Integer,CatalogoVehiculos > bdCatalogoVehiculos;  

    @Override
    public void agregar(CatalogoVehiculos objeto) throws Exception {
        try {
            if (bdCatalogoVehiculos.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo ya esta registrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }

    @Override
    public CatalogoVehiculos buscar(CatalogoVehiculos objeto) throws Exception {
        try {
            if (!bdCatalogoVehiculos.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo no existe.");
                   
            }
            return bdCatalogoVehiculos.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(CatalogoVehiculos objeto) throws Exception {
        try {
            if (!bdCatalogoVehiculos.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo no esta registrado.");
                
            }
            bdCatalogoVehiculos.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }

    @Override
    public void eliminar(CatalogoVehiculos objeto) throws Exception {
        try {
            if (bdCatalogoVehiculos.containsKey(objeto.getId())) {
                throw new Exception("El objeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<CatalogoVehiculos> listarTodo() throws Exception {
        List<CatalogoVehiculos> catalogoVehiculos = new ArrayList<>();
        try {
            if(bdCatalogoVehiculos.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, CatalogoVehiculos> entry : bdCatalogoVehiculos.entrySet()) {
                int key = entry.getKey();
                 CatalogoVehiculos vehiculo = entry.getValue();
                 catalogoVehiculos.add(vehiculo);
                
            }
            return catalogoVehiculos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        }
        

    @Override
    public int contar() throws Exception {
        List<CatalogoVehiculos> numeroVehiculos=listarTodo();
        int NumeroVehiculos =0;
        try {
            NumeroVehiculos = numeroVehiculos.size();
            if (NumeroVehiculos  ==0) {
                throw new UnsupportedOperationException("No tiene elemntos.");
                
            }
            return NumeroVehiculos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        }
        
    
    }

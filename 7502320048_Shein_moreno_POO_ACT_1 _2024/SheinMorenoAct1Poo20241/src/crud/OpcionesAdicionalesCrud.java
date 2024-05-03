/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.MantenimientoPreventivo;
import Dominio.OpcionesAdicionales;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class OpcionesAdicionalesCrud implements ICrudModel<OpcionesAdicionales>{
private HashMap<Integer,OpcionesAdicionales >bdOpcionesAdicionales;

    @Override
    public void agregar(OpcionesAdicionales objeto) throws Exception {
        try {
            if (bdOpcionesAdicionales.containsKey(objeto.getId())) {
                throw new Exception("La opcion adicional ya esta registrada.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public OpcionesAdicionales buscar(OpcionesAdicionales objeto) throws Exception {
        try {
            if (!bdOpcionesAdicionales.containsKey(objeto.getId())) {
                throw new Exception("La opcion no existe.");
                   
            }
            return bdOpcionesAdicionales.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(OpcionesAdicionales objeto) throws Exception {
        try {
            if (!bdOpcionesAdicionales.containsKey(objeto.getId())) {
                throw new Exception("La opcion no esta registrado.");
                
            }
            bdOpcionesAdicionales.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(OpcionesAdicionales objeto) throws Exception {
        try {
            if (bdOpcionesAdicionales.containsKey(objeto.getId())) {
                throw new Exception("El ojeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<OpcionesAdicionales> listarTodo() throws Exception {
        List<OpcionesAdicionales> opcionesAdicionales = new ArrayList<>();
        try {
            if(bdOpcionesAdicionales.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, OpcionesAdicionales> entry : bdOpcionesAdicionales.entrySet()) {
                int key = entry.getKey();
                 OpcionesAdicionales OpcionesAdicionalesVehiculos = entry.getValue();
                 opcionesAdicionales.add(OpcionesAdicionalesVehiculos);
                
            }
            return opcionesAdicionales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
         List<OpcionesAdicionales> numeroOpcionesAdicionales=listarTodo();
        int NumeroOpcionesAdicionales =0;
        try {
            NumeroOpcionesAdicionales = numeroOpcionesAdicionales.size();
            if (NumeroOpcionesAdicionales  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroOpcionesAdicionales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        }
    
   
}
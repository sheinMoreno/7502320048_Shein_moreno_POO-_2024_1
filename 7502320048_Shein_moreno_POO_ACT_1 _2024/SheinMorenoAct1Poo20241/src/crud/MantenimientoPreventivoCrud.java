/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.MantenimientoPreventivo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class MantenimientoPreventivoCrud implements ICrudModel<MantenimientoPreventivo>{
private HashMap<Integer,MantenimientoPreventivo > bdMantenimientoPreventivo; 

    @Override
    public void agregar(MantenimientoPreventivo objeto) throws Exception {
         try {
            if (bdMantenimientoPreventivo.containsKey(objeto.getId())) {
                throw new Exception("El mantenimiento ya esta registrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public MantenimientoPreventivo buscar(MantenimientoPreventivo objeto) throws Exception {
        try {
            if (!bdMantenimientoPreventivo.containsKey(objeto.getId())) {
                throw new Exception("El mantenimiento no existe.");
                   
            }
            return bdMantenimientoPreventivo.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(MantenimientoPreventivo objeto) throws Exception {
        try {
            if (!bdMantenimientoPreventivo.containsKey(objeto.getId())) {
                throw new Exception("El objeto no esta registrado.");
                
            }
            bdMantenimientoPreventivo.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(MantenimientoPreventivo objeto) throws Exception {
        try {
            if (bdMantenimientoPreventivo.containsKey(objeto.getId())) {
                throw new Exception("El ojeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<MantenimientoPreventivo> listarTodo() throws Exception {
         List<MantenimientoPreventivo> mantenimientoPreventivo = new ArrayList<>();
        try {
            if(bdMantenimientoPreventivo.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, MantenimientoPreventivo> entry : bdMantenimientoPreventivo.entrySet()) {
                int key = entry.getKey();
                 MantenimientoPreventivo mantenimientospreventivos = entry.getValue();
                 mantenimientoPreventivo.add(mantenimientospreventivos);
                
            }
            return mantenimientoPreventivo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<MantenimientoPreventivo> numeroMantenimientospreventivos=listarTodo();
        int NumeroMantenimientospreventivos =0;
        try {
            NumeroMantenimientospreventivos = numeroMantenimientospreventivos.size();
            if (NumeroMantenimientospreventivos  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroMantenimientospreventivos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        }
    
    

   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.MantenimientoCorrectivo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class MantenimientoCorrectivoCrud implements ICrudModel<MantenimientoCorrectivo>{
    private HashMap<Integer,MantenimientoCorrectivo > bdManteniminetoCorrectivo;

    @Override
    public void agregar(MantenimientoCorrectivo objeto) throws Exception {
       try {
            if (bdManteniminetoCorrectivo.containsKey(objeto.getId())) {
                throw new Exception("El mantenimiento ya esta registrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    @Override
    public MantenimientoCorrectivo buscar(MantenimientoCorrectivo objeto) throws Exception {
         try {
            if (!bdManteniminetoCorrectivo.containsKey(objeto.getId())) {
                throw new Exception("El mantenimiento no existe.");
                   
            }
            return bdManteniminetoCorrectivo.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(MantenimientoCorrectivo objeto) throws Exception {
        try {
            if (!bdManteniminetoCorrectivo.containsKey(objeto.getId())) {
                throw new Exception("El objeto no esta registrado.");
                
            }
            bdManteniminetoCorrectivo.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(MantenimientoCorrectivo objeto) throws Exception {
        try {
            if ( bdManteniminetoCorrectivo.containsKey(objeto.getId())) {
                throw new Exception("El objeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<MantenimientoCorrectivo> listarTodo() throws Exception {
        List<MantenimientoCorrectivo>  mantenimientoCorrectivo= new ArrayList<>();
        try {
            if(bdManteniminetoCorrectivo.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, MantenimientoCorrectivo> entry : bdManteniminetoCorrectivo.entrySet()) {
                int key = entry.getKey();
                 MantenimientoCorrectivo mantenimientosCorrectivos = entry.getValue();
                 mantenimientoCorrectivo.add(mantenimientosCorrectivos);
                
            }
            return mantenimientoCorrectivo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
       List<MantenimientoCorrectivo> numeroMantenimientosCorrectivos=listarTodo();
        int NumeroMantenimientosCorrectivos =0;
        try {
            NumeroMantenimientosCorrectivos = numeroMantenimientosCorrectivos.size();
            if (NumeroMantenimientosCorrectivos  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroMantenimientosCorrectivos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0; 
    }
    

    

    

 
    
}

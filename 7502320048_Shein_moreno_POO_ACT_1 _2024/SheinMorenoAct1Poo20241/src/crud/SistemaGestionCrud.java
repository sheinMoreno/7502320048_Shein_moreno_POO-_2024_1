/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.SistemaGestion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class SistemaGestionCrud implements ICrudModel<SistemaGestion>{
private HashMap<Integer,SistemaGestion > bdSistemaGestion; 

    @Override
    public void agregar(SistemaGestion objeto) throws Exception {
       try {
            if (bdSistemaGestion.containsKey(objeto.getId())) {
                throw new Exception("El sistema de gention ya esta registrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }

    @Override
    public SistemaGestion buscar(SistemaGestion objeto) throws Exception {
      try {
            if (!bdSistemaGestion.containsKey(objeto.getId())) {
                throw new Exception("El sistema de gestion no existe.");
                   
            }
            return bdSistemaGestion.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(SistemaGestion objeto) throws Exception {
       try {
            if (!bdSistemaGestion.containsKey(objeto.getId())) {
                throw new Exception("El sistema de gestion no esta registrado.");
                
            }
            bdSistemaGestion.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(SistemaGestion objeto) throws Exception {
      try {
            if (bdSistemaGestion.containsKey(objeto.getId())) {
                throw new Exception("El ojeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    @Override
    public List<SistemaGestion> listarTodo() throws Exception {
      List<SistemaGestion> sistemaGestion = new ArrayList<>();
        try {
            if(bdSistemaGestion.isEmpty()){
                throw new UnsupportedOperationException("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, SistemaGestion> entry : bdSistemaGestion.entrySet()) {
                int key = entry.getKey();
                 SistemaGestion sistemaGestionVehiculos = entry.getValue();
                 sistemaGestion.add(sistemaGestionVehiculos);
                
            }
            return sistemaGestion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<SistemaGestion> numeroSistemaGestion=listarTodo();
        int NumeroSistemaGestion =0;
        try {
            NumeroSistemaGestion = numeroSistemaGestion.size();
            if (NumeroSistemaGestion  ==0) {
                throw new UnsupportedOperationException("No tiene elementos.");
                
            }
            return NumeroSistemaGestion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}

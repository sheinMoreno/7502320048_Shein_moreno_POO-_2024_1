/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.CatalogoVehiculos;
import Dominio.EntregaVehiculoUsado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class EntregaVehiculoUsadoCrud implements ICrudModel<EntregaVehiculoUsado>{
    private HashMap<Integer,EntregaVehiculoUsado > bdEntregaVehiculoUsado;

    @Override
    public void agregar(EntregaVehiculoUsado objeto) throws Exception {
        try {
            if (bdEntregaVehiculoUsado.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo ya esta registrado.");  
            }
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public EntregaVehiculoUsado buscar(EntregaVehiculoUsado objeto) throws Exception {
        try {
            if (!bdEntregaVehiculoUsado.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo no existe.");
                   
            }
            return bdEntregaVehiculoUsado.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(EntregaVehiculoUsado objeto) throws Exception {
        try {
            if (!bdEntregaVehiculoUsado.containsKey(objeto.getId())) {
                throw new Exception("El vehiculo no esta registrado.");
                
            }
            bdEntregaVehiculoUsado.put(objeto.getId(),objeto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void eliminar(EntregaVehiculoUsado objeto) throws Exception {
        try {
            if (bdEntregaVehiculoUsado.containsKey(objeto.getId())) {
                throw new Exception("El objeto no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<EntregaVehiculoUsado> listarTodo() throws Exception {
        List<EntregaVehiculoUsado> entregaVehiculoUsado = new ArrayList<>();
        try {
            if(bdEntregaVehiculoUsado.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<Integer, EntregaVehiculoUsado> entry : bdEntregaVehiculoUsado.entrySet()) {
                int key = entry.getKey();
                 EntregaVehiculoUsado vehiculoUsado = entry.getValue();
                 entregaVehiculoUsado.add(vehiculoUsado);
                
            }
            return entregaVehiculoUsado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<EntregaVehiculoUsado> numeroAutosUsados=listarTodo();
        int NumeroAutosUsados = 0;
        try {
            NumeroAutosUsados = numeroAutosUsados.size();
            if(NumeroAutosUsados ==0){
              throw new Exception("No tiene elementos.");   
            }
            return NumeroAutosUsados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
        
    }

      
}

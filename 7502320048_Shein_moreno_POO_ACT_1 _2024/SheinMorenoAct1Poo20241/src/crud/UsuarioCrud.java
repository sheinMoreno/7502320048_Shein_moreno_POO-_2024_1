/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import Dominio.Usuario;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ICrudModel;

/**
 *
 * @author ASUS
 */
public class UsuarioCrud implements ICrudModel<Usuario>{
    
    private HashMap<String, Usuario> bdUsuario;

    @Override
    public void agregar(Usuario objeto) throws Exception {
        try {
            if(bdUsuario.containsKey(objeto.getDni()))
              throw new Exception("El usuario ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public Usuario buscar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey( objeto.getDni())){
                throw new Exception("El objeto no existe." );
            }
            return bdUsuario.get(objeto.getDni());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey(objeto.getDni())){
                throw new Exception("El objeto no esta registrado."); 
            }
            bdUsuario.put(objeto.getDni(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey(objeto.getDni())){
                throw new Exception("el objeto no existe");
            }
            bdUsuario.remove(objeto.getDni());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
    }

    @Override
    public List<Usuario> listarTodo() throws Exception {
        List<Usuario> usuarios =new ArrayList<>();
        try {
            if(bdUsuario.isEmpty()){
                throw new Exception("No existe el elemento en la lista.");
            }
            for (Map.Entry<String, Usuario> dni : bdUsuario.entrySet()) {
                Object key = dni.getKey();
                Usuario usuario= dni.getValue();
                usuarios.add(usuario);
                
            }
            return usuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public int contar() throws Exception {
        List<Usuario> numeroUsuario=listarTodo();
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

   

    
    

  
    


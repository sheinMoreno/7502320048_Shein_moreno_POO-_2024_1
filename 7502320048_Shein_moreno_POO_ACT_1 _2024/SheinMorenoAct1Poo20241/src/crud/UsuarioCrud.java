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
            if(bdUsuario.containsKey(objeto.getId()))
              throw new Exception("El usuario ya esta registrado");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   

    @Override
    public Usuario buscar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey( objeto.getId())){
                throw new Exception("El usuario no existe." );
            }
            return bdUsuario.get(objeto.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void editar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey(objeto.getId())){
                throw new Exception("El usuario no esta registrado."); 
            }
            bdUsuario.put((String) objeto.getId(),objeto);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    

    @Override
    public void eliminar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuario.containsKey(objeto.getId())){
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
            for (Map.Entry<String, Usuario> id : bdUsuario.entrySet()) {
                Object key = id.getKey();
                Usuario usuario= id.getValue();
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

   

    
    

  
    


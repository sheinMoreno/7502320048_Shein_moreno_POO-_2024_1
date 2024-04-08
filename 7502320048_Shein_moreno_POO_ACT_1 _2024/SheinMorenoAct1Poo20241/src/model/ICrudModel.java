/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ICrudModel<Clase> {
    
    public void agregar(Clase objeto)throws Exception;

    public Clase buscar(Clase objeto)throws Exception;

    public void editar(Clase objeto)throws Exception;

    public void eliminar(Clase objeto)throws Exception;

    public List<Clase> listarTodo()throws Exception;

    public int contar()throws Exception;
    
}

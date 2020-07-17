/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionthrows;

/**
 *
 * @author Bryner
 */
public class CustomException extends Exception {
/*Programar el codigo fuente que se debe ejecutar 
cuando el catch se activa
    Esto es para mostrar el error que se esta consultando
  */  
    public static final long serialVersionUID = 700;
    public CustomException(String mensaje){
    
        super(mensaje);
    
    
    }
}

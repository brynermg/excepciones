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
public class ExcepcionPropia {
    public static void main(String[] args){
    String user, pass, repass;
    
    user = "moraga";
    pass = "12345";
    repass = "12345";
   
    MiHelper h = new MiHelper(); 
        try {
            h.validarPassword(pass, repass);
        } catch (CustomException e) {
             System.out.println("No se agregó el usuario" + e.getMessage() );
        }
       
    
    }
}

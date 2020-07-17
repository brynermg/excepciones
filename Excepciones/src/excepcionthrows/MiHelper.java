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
public class MiHelper {
    public MiHelper(){
    
        }
    
    public void validarPassword(String pass, String repass)throws CustomException{
    
        if (!pass.equals(repass)) {
            
            throw new CustomException("Las claves no coinciden...");
        }
        if (pass.length()<6) {
            
            throw new CustomException("La es menor a 6 carácteres");
        }
    
    }
}

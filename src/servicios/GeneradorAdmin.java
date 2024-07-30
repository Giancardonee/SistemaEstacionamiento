
package servicios;

import controlador.Ctrl_Usuario;
import modelo.Usuario;
import seguridad.hash;

public class GeneradorAdmin {

    public GeneradorAdmin(Ctrl_Usuario ctrlUsuario){  
            Usuario primerUsuario = new Usuario( "adm", "nombreAdm", "apellidoAdm", "dniAdm", "Administrador", "000-000-000");
            hashearPassword(primerUsuario);
            ctrlUsuario.registrarUsuario(primerUsuario); 
    }    
       
    private void hashearPassword(Usuario primerUsuario){
        String password = "1234";
        String passwordHashed = hash.sha1(password);
        primerUsuario.setContrasena(passwordHashed);
    }
           
    
    
}

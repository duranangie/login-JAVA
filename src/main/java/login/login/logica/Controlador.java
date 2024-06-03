package login.login.logica;

import java.util.List;
import login.login.Persistencia.ControladorPersistencia;

public class Controlador {

    ControladorPersistencia controlPersi = new ControladorPersistencia();

 
    
    
    public String validarUsuario(String usuario, char[] contrasena) {
        String mensaje = "";
        List<Usuario> listaUsuario = controlPersi.traerUsuario();
        for (Usuario usu : listaUsuario) {
            if (usu.getUsuario().equals(usuario)) {
              
                //cambiar contraseña a un string
                String contraseñaUsuario = new String(contrasena);
                if (usu.getContraseña().equals(contraseñaUsuario)) {
                    mensaje = "Usuario correcto";
                    return mensaje;
                } else {
                    mensaje = "contraseña incorrecta";
                    
                }

            } else {
                mensaje = "nombre incorrecta";
               
                

            }
        }
        return mensaje;
    }

}

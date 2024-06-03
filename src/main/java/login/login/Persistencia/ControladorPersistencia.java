
package login.login.Persistencia;
    
import java.util.List;
import login.login.logica.Usuario;


public class ControladorPersistencia {
    
    UsuarioJpaController userjpa= new UsuarioJpaController();

    public List<Usuario> traerUsuario() {
        
        List<Usuario> listaUsuario = userjpa.findUsuarioEntities();
        return listaUsuario;


    }
    
}


package Persistencia;

import Entidades.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public List<Usuario> ObtenerUsuario(){
        return usuJpa.findUsuarioEntities();
    }
}

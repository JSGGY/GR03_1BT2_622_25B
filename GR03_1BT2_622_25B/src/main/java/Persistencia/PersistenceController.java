
package Persistencia;

import Entidades.Usuario;
import java.util.List;


public class PersistenceController {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public List<Usuario> getUser(){
        return usuJpa.findUsuarioEntities();
        
    }
}

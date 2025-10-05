package Entidades;

import Persistencia.PersistenceController;
import java.util.List;


public class Controller {
    PersistenceController control = new PersistenceController();
    
     public List<Usuario> getUser (){
        return control.getUser();
    }
}

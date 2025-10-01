package Entidades;

import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public List<Usuario> obtenerUsuario (){
        return control.ObtenerUsuario();
    }
}

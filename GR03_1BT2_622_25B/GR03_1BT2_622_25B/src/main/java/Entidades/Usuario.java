
package Entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private int id;
    private String usuario;
    private String Password;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String Password) {
        this.id = id;
        this.usuario = usuario;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}

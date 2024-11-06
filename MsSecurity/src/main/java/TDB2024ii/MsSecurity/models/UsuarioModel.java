package TDB2024ii.MsSecurity.models;
//se simplifican mas mediante uso de anotaciones
//xml tools

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
//NO IMPORTA SI SEA MAYUSCULA O MINUSCULA EL NOMBRE DE LA BD
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //no concatenar mayuculas y minusculas el nombre de las columnas
    @Column(name = "idusuario")
    public Integer idUsuario;
    
    @Column(name = "nombre")
    public String nombre;

    @Column(name = "apellidos")
    public String apellidos;


    /* 
    public UsuarioModel() {
    }

    public UsuarioModel(String idUsuario, String nombre, String apellido) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    } */


}

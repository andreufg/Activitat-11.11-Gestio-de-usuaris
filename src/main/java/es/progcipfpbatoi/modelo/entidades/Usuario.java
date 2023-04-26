package es.progcipfpbatoi.modelo.entidades;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private DatePicker birthday;
    private String codigoPostal;
    private String password;
    private String repetirPassword;

    public Usuario(String nombre, String apellidos, String email, String telefono, DatePicker birthday, String codigoPostal, String password, String repetirPassword) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreCompleto = nombre.concat(" " + apellidos);
        this.email = email;
        this.telefono = telefono;
        this.birthday = birthday;
        this.codigoPostal = codigoPostal;
        this.password = password;
        this.repetirPassword = repetirPassword;
    }
    public boolean empiezaPor(String text) {
        return this.nombreCompleto.startsWith(text);
    }
}

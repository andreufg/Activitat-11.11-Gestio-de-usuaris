package es.progcipfpbatoi.modelo.entidades;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;
    private DatePicker birthday;
    private int codigoPostal;
    private int password;
    private int repetirPassword;

    public Usuario(String nombre, String apellidos, String email, int telefono, DatePicker birthday, int codigoPostal, int password, int repetirPassword) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.birthday = birthday;
        this.codigoPostal = codigoPostal;
        this.password = password;
        this.repetirPassword = repetirPassword;
    }
}

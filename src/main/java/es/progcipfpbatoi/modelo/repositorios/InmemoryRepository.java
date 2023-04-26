package es.progcipfpbatoi.modelo.repositorios;

import es.progcipfpbatoi.modelo.entidades.Usuario;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.ArrayList;

public class InmemoryRepository implements UsuariosRepository{
    private ArrayList<Usuario> usuarios;

    public InmemoryRepository() {
        this.usuarios = new ArrayList<>();
        init();
    }

    private void init() {
        LocalDate birthday = LocalDate.now();
        DatePicker fecha = new DatePicker(birthday);
        this.usuarios.add(new Usuario("Ada", "Lovelace","ada@gmail.com","651845665",fecha,"03802","1234","1234"));
        this.usuarios.add(new Usuario("Grace", "Hopper","grace@gmail.com","698415222",fecha,"03802","1234","1234"));
        this.usuarios.add(new Usuario("Margaret", "Hamilton","margaret@gmail.com","632895412",fecha,"03802","1234","1234"));
        this.usuarios.add(new Usuario("Joan", "Clarke","joan@gmail.com","674318492",fecha,"03802","1234","1234"));
    }

    @Override
    public ArrayList<Usuario> findAll() {
        return usuarios;
    }

    @Override
    public boolean save(Usuario usuario) {
        int index = usuarios.indexOf(usuario);

        if (index == -1) {
            return this.usuarios.add(usuario);
        } else {
            this.usuarios.set(index, usuario);
            return true;
        }
    }

    @Override
    public ArrayList<Usuario> findAll(String text) {
        ArrayList<Usuario>usuariosFiltrados = new ArrayList<>();
        for (Usuario usuario: usuarios) {
            if (usuario.empiezaPor(text)) {
                usuariosFiltrados.add(usuario);
            }
        }

        return usuariosFiltrados;
    }
}

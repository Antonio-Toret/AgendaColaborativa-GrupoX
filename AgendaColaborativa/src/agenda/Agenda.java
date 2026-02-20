package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(Contacto c) {
        contactos.add(c);
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
            return true;
        }
        return false;
    }

    public void listarContactos() {
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }
}

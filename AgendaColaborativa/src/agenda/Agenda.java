package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	public void agregarContacto(Contacto c) {
	    if (c == null) {
	        System.out.println("El contacto no puede ser nulo.");
	        return;
	    }
	    contactos.add(c);
	    System.out.println("Contacto " + c.getNombre() + " agregado correctamente.");
	}


    // Lista de contactos
    private List<Contacto> contactos;

    // Constructor
    public Agenda() {
        contactos = new ArrayList<>();
    }

    // Getters y setters
    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    // Busca un contacto por nombre
    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    // Elimina un contacto por nombre
    public boolean eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
            return true;
        }
        return false;
    }
}


package agenda;

public class Agenda {
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
}

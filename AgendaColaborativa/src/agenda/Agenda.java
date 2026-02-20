package agenda;

public class Agenda {
	public void agregarContacto(Contacto c) {
	    if (c == null) {
	        System.out.println("El contacto no puede ser nulo.");
	        return;
	    }
	    contactos.add(c);
	    System.out.println("Contacto " + c.getNombre() + " agregado correctamente.");
	}
}

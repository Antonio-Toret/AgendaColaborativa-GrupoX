package agenda;

public class MainAgenda {
    public static void main(String[] args) {

        // Crear la agenda
        Agenda agenda = new Agenda();

        // Crear contactos
        Contacto c1 = new Contacto("Carlos García", 612345678, "carlos@gmail.com");
        Contacto c2 = new Contacto("Laura Martínez", 698765432, "laura@gmail.com");
        Contacto c3 = new Contacto("Pedro Sánchez", 654321987, "pedro@gmail.com");

        // Agregar contactos a la agenda
        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);

        // Intentar agregar un contacto nulo
        agenda.agregarContacto(null);

        // Mostrar todos los contactos
        System.out.println("\n--- Lista de contactos ---");
        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }

        // Buscar un contacto existente
        System.out.println("\n--- Buscar contacto ---");
        Contacto encontrado = agenda.buscarContacto("Laura Martínez");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado);
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Buscar un contacto que no existe
        Contacto noExiste = agenda.buscarContacto("Ana López");
        if (noExiste != null) {
            System.out.println("Contacto encontrado: " + noExiste);
        } else {
            System.out.println("El contacto 'Ana López' no existe en la agenda.");
        }

        // Eliminar un contacto
        System.out.println("\n--- Eliminar contacto ---");
        boolean eliminado = agenda.eliminarContacto("Carlos García");
        if (eliminado) {
            System.out.println("Contacto 'Carlos García' eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el contacto.");
        }

        // Mostrar lista final tras la eliminación
        System.out.println("\n--- Lista de contactos actualizada ---");
        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }
    }
}

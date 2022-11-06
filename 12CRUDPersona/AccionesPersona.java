import java.util.ArrayList;

public class AccionesPersona {
    /**
     * vamos a hacer un CRUD de la persona
     * C -> consult
     * R -> Register
     * U -> Update
     * D -> Delete
     */
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    // declarar metodos
    public void agregarPersona(Persona p) {
        // voy a ocupar a la lista de personas
        listaPersonas.add(p);

    }

    // voy a nsucar un aperosna por
    public Persona buscarPersona(int id) {
        // necesito una instancia de una persona
        for (Persona p : listaPersonas) {
            if (id == p.getId()) {
                enconntrada = p;

            } else {
                System.out.println("no exixte ese registro de la persona ");
            }
        }
        return encontrada;

    }

    // vamos a actualizar los datos de la persona
    public void actualizarPersona(Persona actulizada) {
        // primero debo buscar a la persona
        Persona actualizar = buscarPersona(buscarPersona(Atualizada.getId));
        listaPersonas.remove(actualizar);
        listaPersonas.add(acualizar);

    }

    public void EliminarPersona(Persona eliminar) {
        listaPersonas.remove(eliminar);

    }

    public ArrayList<Persona> mortrarpPersonas() {
        return listaPersonas;
    }

}

import java.util.*;

public class Manipulacion {

    public void menu(){
        Scanner entrada = new Scanner(System.in);

       

        AccionPrenda control = new AccionPrenda();

        System.out.println("Elija una opcion: ");
        System.out.println("1.- Mostrar Prendas ");
        System.out.println("2.- Registrar nueva Prenda");
        System.out.println("3.- Editar ");
        System.out.println("4.- Eliminar Prenda ");
        System.out.println("5.- Salir");
        
        int opcion = entrada.nextInt();
       

        switch(opcion){
            case 1:
               
                System.out.println("Prenda ");
                ArrayList<Prenda> listadepersonas = control.mostrarPersonas();
               
                System.out.println("hola");
                for(Prenda objeto : listadepersonas){
                    System.out.println("El id es: " + objeto.getId() + "\n" 
                    + "El nombre es: " + objeto.getNombre() + "\n"
                    + "Su edad es: " + objeto.getEdad() + "\n");

                }
                menu();
                break;
            case 2:
                //debemos agregar a la persona
                System.out.println("Ingrese el ID del dormidito: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre el dormidito: ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese la edad del dormidito: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());

                //guardarlo en el objeto correspondiente de persona
                Prenda personaDormidito = new Prenda(idpersona, nombrepersona, edadpersona);

                control.agregarPersona(personaDormidito);
                menu();
                break;
            case 3:
                //primero debo de buscar a la persona que quiero editar
                System.out.println("Ingresa el ID del Dormidito que deseas buscar:");
                idpersona = Integer.parseInt(entrada.nextLine());

                //mando a llamar al metodo de busqueda
                Prenda personabuscar = control.buscarPersona(idpersona);

                System.out.println("La informacion del dormidito es: \n"
                + "ID: " + personabuscar.getId() + "\n"
                + "Nombre: " + personabuscar.getNombre() + "\n"
                + "Edad: " + personabuscar.getEdad() + "\n");

                //cambio de los datos
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());

                //como ya tengo los nuevos datos tengo que pasarlos
                personabuscar.setNombre(nuevonombre);
                personabuscar.setEdad(nuevaedad);

                //ahora si actualizo
                control.actualizarPersona(personabuscar);
                menu();
                break;
            case 4:
                System.out.println("Ingrese el id del dormidito que desea despertar:");
                idpersona = Integer.parseInt(entrada.nextLine());

                //creo el objeto para despertarlo
                Prenda personaEliminar = control.buscarPersona(idpersona);

                //la elimino
                control.eliminarPersona(personaEliminar);

                System.out.println("El dormidito ya desperto");
                menu();
                break;
            default:
                System.out.println("Opcion no valida");
                break;


                
        }


    }
    
}
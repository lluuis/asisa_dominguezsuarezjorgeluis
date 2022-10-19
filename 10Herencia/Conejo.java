import java.util.Scanner;

public class Conejo extends Animal {
    Scanner entrada = new Scanner(System.in);
    int Salta;

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, int Salta) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Salta = Salta;
    }

    // recibir
    public int getSalta() {
        System.out.println("cuantas veces salta su conejo?");
        return Salta;
    }

    // enviar
    public void setSalta(int Salta) {
        this.Salta = Salta;
    }

    // el metodo propio del perro
    public void mostrarConejo() {
        System.out.println("El nombre del Conejo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "la cantidad que salta es: "
                + Salta);
    }

}

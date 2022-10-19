import java.util.Scanner;

public class Uron extends Animal {
    Scanner entrada = new Scanner(System.in);
    int Baila;

    public Uron() {

    }

    public Uron(String nombre, String raza, String tipo_alimento, int edad, int Baila) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Baila = Baila;
    }

    // recibir
    public int getBaila() {
        System.out.println("cuantas veces baila su uron?");
        return Baila;
    }

    // enviar
    public void setBaila(int Baila) {
        this.Baila = Baila;
    }

    // el metodo propio del perro
    public void mostrarUron() {
        System.out.println("El nombre del Uron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Cuantas veces vaila el uron  : "
                + Baila);
    }

}

import java.util.Scanner;

public class Cuyo extends Animal {
    Scanner entrada = new Scanner(System.in);
    int Chilla;

    public Cuyo() {

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, int Chilla) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Chilla = Chilla;
    }

    // recibir
    public int getChilla() {
        System.out.println("cuantas veces chilla su cuyo?");
        return Chilla;
    }

    // enviar
    public void setChilla(int Chilla) {
        this.Chilla = Chilla;
    }

    // el metodo propio del perro
    public void mostrarCuyo() {
        System.out.println("El nombre del Cuyo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n"
                + "El cuyo cuntas veces al dia hace sonidos : " + Chilla);
    }

}

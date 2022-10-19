import java.util.Scanner;

public class Tigre extends Animal {
    Scanner entrada = new Scanner(System.in);
    int Roar;

    public Tigre() {

    }

    public Tigre(String nombre, String raza, String tipo_alimento, int edad, int Roar) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Roar = Roar;
    }

    // recibir
    public int getRoar() {
        System.out.println("cuantas veces ruge su tigre?");
        return Roar;
    }

    // enviar
    public void setRoar(int Roar) {
        this.Roar = Roar;
    }

    // el metodo propio del perro
    public void mostrarTigre() {
        System.out.println("El nombre del Tigre es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Cuantas veces ruge el tigre : "
                + Roar);
    }

}

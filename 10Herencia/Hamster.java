import java.util.Scanner;

public class Hamster extends Animal {
    // aqui deberia de venir String
    Scanner entrada = new Scanner(System.in);
    int Tsu;

    public Hamster() {

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, int Tsu) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Tsu = Tsu;
    }

    // recibir
    public int getTsu() {
        System.out.println("cuantas veces como su hamster en el dia?");
        return Tsu;
    }

    // enviar
    public void setTsu(int Tsu) {
        this.Tsu = Tsu;
    }

    // el metodo propio del perro
    public void mostrarHamster() {
        System.out.println("El nombre del Hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "cuantas veces come en el dia: "
                + Tsu);
    }

}
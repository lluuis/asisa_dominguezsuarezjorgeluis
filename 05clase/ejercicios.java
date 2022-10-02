import java.util.Scanner;

class Ejercicios {

    /** Vamos a hacer una calculadora, un conversor de unidades creacion de cuadros y de movimiento */

    //los metodos son las operaciones de un objeto o de una clase, tambien llamado comportamiento

    //objetos
    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //vamos a ser un metodo para el menu del programa
    public void menu(){
        //menu del programa
        System.out.println("Ejercicios de yo para tu");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadros magicos");
        System.out.println("d.- Desplazamiento de cuadro");
        System.out.println("Elija una opción");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
                 //implementamos metodos
                Ejercicio1();
                break;
            case 'b' :
                //implementamos metodos
               Ejercicio2();
               break;
            case 'c' :
               //implementamos metodos
              Ejercicio3();
              break;
            case 'd' :
              //implementamos metodos
             Ejercicio4();
             break;
            default: 
                System.out.println("Gracias por jugar :3");
        }
    }

    public void Ejercicio1(){
        //variable local
        double num1 = 0.00, suma = 0.00, multi=1.00;
        char operacion;

        System.out.println("Selecciona la operacion que desees realizar");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division ahi la hacen");

        operacion = entrada.next().charAt(0);
        switch(operacion){
            case 'a':
            do{
                System.out.println("Para detener la suma o resta ingrese el numero 0");
                System.out.println("Escriba los numeros que desee sumar o restar");
                num1 = entrada.nextDouble();
                suma += num1;
                //suma = suma + num1;


            }while(num1 != 0);
            System.out.println("El resultado es: " + suma);
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
        }

    }

    public void Ejercicio2(){
 //vamos a crear un programa que se encarge de convertir kilogramos a libras y de metro 
 //tarea metros a yerdas y millas 
 
 double metros = 0.00, kg =0.00, velocidad = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libra = 2.20, ms = 0.00;
 double a,b;
 System.out.println(x:"seleccione lo que desea convertir y en que unidades");
 System.out.println(x:"a. metros a cm a pulgadas");
 System.out.println(x:"b. kilogramos a libras y gramos ");
 System.out.println(x:"c. m/s a km/h");
 System.out.println(x:"d. ahi va la tarea ");
 op = entrada.next().charAt(index: 0);
 switch(op){
    case 'a':
    System.out.println( "ingrese los metros a transformar");
    a=metros*cm;
    b=metros*pulgadas;
    System.out.println( "la cantidada  metros es :" + metros + " de m a cm es : " + a + "de m a pulgadas es : " + b);
    break;
    case 'b':
    System.out.println( "ingrese los metros a transformar");
    a=kg*gramos;
    b=;kg*libra;
    System.out.println( "la cantidada a gramos es :" + gramos + " de kg a gramos es : " + a + "de kg a libras es : " + b);
    break;
    case 'c':
    System.out.println( "ingrese los m/s a transformar");
    ms=entrada.nextDouble();

    a=ms*(3600/1000);
    System.out.println( "la conversion es: " + a );
    break;
    

 }
    }

    public void Ejercicio3(){

    }

    public void Ejercicio4(){

    }

}

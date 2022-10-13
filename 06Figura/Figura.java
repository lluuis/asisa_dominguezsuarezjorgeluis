import java.util.Scanner;
import java.lang.Math;

//libreria math es para el uso de raiz cuadrada y potencias, asi como numero de euler pi, etc

public class Figura {

    //variables globales
    double lado, altura, area, perimetro, lado2, lado3, base;
    int opcion;
    char letra;

    //objeto
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
        /**
         * vamos a realizar un prgorama que se encargue del calculo del area y perimetro de cuadrado, triangulo, rectangulo y circulo
         */

        do{
            System.out.println("Programa para el calculo de area y perimetro de figuras");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Salir");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1: 
                    calcularCuadrado();
                    break;
                case 2: 
                    calcularTriangulo();
                    break;
                case 3: 
                    calcularCirculo();
                    break;
                case 4: 
                    calcularRectangulo();
                    break;
                default:
                    System.out.println("Gracias por ocupar este programa saluditos");
                    break;
            }
            System.out.println("¿Desea repetir el programa?, escriba S para repetir ");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }

    public void calcularCuadrado(){
        try{
            System.out.println("Ingrese el valor del lado del cuadrado: ");
            lado = entrada.nextDouble();
            perimetro = lado*4;
            area = lado*lado;
            System.out.println("El perimetro es de: " +perimetro + " el area es de: " + area);

        }catch(Exception e){
            System.out.println("Ingrese unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public void calcularTriangulo(){
        
        System.out.println("ingrese 1 para el area y  perimetro, 2 para saber que tipo de triangulo es : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
               
                    
                        System.out.println("Ingresa la base del triangulo: ");
                        try{
                    
                        base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triangulo: ");
                        altura = entrada.nextDouble();
                        area = (base*altura)/2;
                        System.out.println("El area del triangulo es: " + area);

                    }catch(NumberFormatException e ){
                        System.out.println("Ingrese unicamente valores numericos");
                        System.out.println("Error: " + e.getMessage());
                        System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                    }finally{
                        System.out.println("no ingresar un caracter alfanumerico");
                    }
                
                break;
            case 2:
                //ahi lo hacen de tarea, porque quiero que identifique si es un triangulo equilatero, escaleno o isoseles
                try{
                System.out.println("ingrese el primer lado");
                lado = entrada.nextDouble();
                System.out.println("ingrese el segundo lado");
                lado2 = entrada.nextDouble();
                System.out.println("ingrese el tercer lado");
                lado3 = entrada.nextDouble();
                }catch(NumberFormatException e){
                    System.out.println("Ingrese unicamente valores numericos");
                        System.out.println("Error: " + e.getMessage());
                        System.out.println(e.getStackTrace()); //obtiene la raiz del problema
                
                if(lado == lado2 && lado == lado3){
                    System.out.println("el triangulo es equilatero");

                }else{
                    if(lado == lado2 && lado !=lado3){
                        System.out.println("el triangulo es isoceles");
                    }else{
                        System.out.println("el triangulo es escaleno");
                    }
                }
            }finally{
                System.out.println("no ingresar un caracter alfanumerico");
            }
            
            
                break;
            default:
                System.out.println("Opcion invalida ayoss");
                break;
        }
    }

    public void calcularCirculo(){
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingresa el radio del circulo: ");
                lado = entrada.nextDouble();

                //pi * r* r
                area = Math.PI*lado*lado;
                System.out.println("El area es de: " + area);
                break;
            case 2:
                System.out.println("Ingrese el diametro del circulo: ");
                lado = entrada.nextDouble();

                //PI * diametro
                perimetro = Math.PI*lado;
                System.out.println("El perimetro es de : " + perimetro);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        
    }

    public void calcularRectangulo(){

        try{
        System.out.println("ingrese la base");
        lado = entrada.nextDouble();
        System.out.println("ingrese la altura");
        lado2 = entrada.nextDouble();
        
        perimetro = (2*base) + (2*altura);
        area = base*altura;
        System.out.println("el perimetro del rectangulo es:" + perimetro + "y el area es: " + area);
    }catch(NumberFormatException e){
        System.out.println("Ingrese unicamente valores numericos");


    }
    


        
    }
    
}
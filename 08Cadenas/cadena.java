import java.util.Scanner;

import javax.crypto.ShortBufferException;
import javax.sound.midi.Soundbank;

public class cadena {
    
    Scanner entrada =  new Scanner(System.in);

    //metodo de cadena
    public void cadenas(){
        String s1 = "hola habia un a vez un patito que decia miau, y queria mimir; pero no lo dejaban y por eso estaba triste";
        System.out,println("el tamañ de la cadena es : " + s1.length());
        
        // si comienza con ??
        System.out.println("la cadena inicia V o F con hola?... " + s1.startsWith("hola"));

        //si finaliza
        System.out.println("la cadena termina V o F con gato? " + s1.endsWith( "gato"));

        //vamos aleer una variable 
        System.out.println("ingrrese una palabra: ");
        String s2 = entrada.nextLine();
        System.out.println("la palabra es : " + s2);

        //vamos a obtener subcadenas de la palabra 
        System.out.println("primera parte: " + s1.subs(  7 ,  20));

        System.out.println("segunda parte : " + s1 sub);

        //convertir una variable de la cadena 
        int valor = 24;

        String s3 = String.valueOf(valor);
        System.out.println("el valor es de : " + s3 + "como cadena ");

        /*
         2 + 2 022 cadena 
         2+2 =4 int 
          */

        String s4 = "20";
        int numero = Integer.parseInt(s4);
        System.out.println("el valor de: " + numero + "ahora es un numero");

        String s5 = "20.89";

        Double numero1 = Double.parseDouble(s5);

        System.out.println("el valor de: " + numero1 + "ahora es un decimal");

        numero1 = numero1 = numero;

        System.out.println("el resultado es: " + numero1);

        //convertir de otra forma entero a una cadena 
        Integer x = 5;
        
        System.out.println("el valor de: " + x.toString() + "ahora es una cadena ");

        System.out.println("el valor de: " + Integer.toString(i:12) + "ahora es una cadena");

        



    }

    



}    
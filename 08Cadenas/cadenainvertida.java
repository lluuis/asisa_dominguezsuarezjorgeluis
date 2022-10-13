import java.util.*;

public class cadenainvertida {

    Scanner entrada = new Scanner(System.in);

    public class cadenainvertidadepalabras(){
        String cadena = "";
        System.out.println("ingresa la horacion que quieres invertir: ");

        cadena = entrada.nextLine();

        String invertida = "";
    for(int i= cadena.length()-1; i >=0; i--){

        char car = cadena.charAt(i);
        
        invertida += car;

    }   
    System.out.println("cadena invertida es : " + invertida);
    
    }




    
}

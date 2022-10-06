
import java.util.*;
public class arerglosMartriz {
    public static void main(String[] args){
    /*vamos hacer un arreglo unidimencional y 
    correrlo  */
    int arreglo[] = new int[10];
    Scanner entrada = new Scanner(System.in);
    int valor;

    for(int j=0; j<arreglo.length; j++){
        System.out.println("ingrese el valor del arreglo");
        arreglo[j] = entrada.nextInt();
    }
    //vamos a recorrerlo
for(int i= 0; i<arreglo.length;i++){
    System.out.println("la magia: "+ arreglo[i]);

}

}
}
// convolucion discreta
// alumno: dominguez suarez jorge luis  

import java.util.Scanner; 

public class Prueba{

    public static void main(String args[]){
        Scanner entrada  = new Scanner (System.in); 
        int vector[] = new int[4]; 
        int vector2[] = new int[4]; 
        int vector3[] = new int[100]; 
        int op;
        // omiti el reflejo por que el programa lo hace manuelamente 
       do{
        System.out.println("\n\n\t\t CONVOLUCION DISCRETA \n\n"); 

        System.out.println("\n\n\t\t Señal x(n)\n\n");

        Scanner entrada;
        for(int i=0; i<vector.length; i++){
            System.out.print("Ingresa los elementos de la señal x(n) : "); 
            vector[i] = entrada.nextInt(); 
        }
        System.out.println("\nEl arreglo esta compuesto por : \n");
        for (int i:vector){
            System.out.println("*  Elemento : "+vector[i]);
        }

        System.out.println("\n\n\t\t Señal h(n) \n\n");

        for (int i=0; i<vector2.length; i++ ){
            System.out.print("Ingresa los elementos de la señal h(n) : "); 
            vector2[i] = entrada.nextInt(); 
        }
        System.out.println("\nEl arreglo esta compuesto por : \n");

        for(int i:vector2){
            System.out.println("*  Elemento : "+vector2[i]);
        }


        int j=0; 
        for(int i=0; i<1 ; i++){

            vector3[0] = (vector[0]*vector2[0]); //vector 3 0
            j++;
            vector3[j] = (vector[1]*vector2[1]);//vector 3 1
            j++;
            vector3[1] = (vector3[0]+vector3[1]);// vector 3 2
            j++; // vector3[2]
            vector3[j] = (vector[0]*vector2[2]);//verctor 3 3
            j++; 
            vector3[j] = (vector[1]*vector2[1]); //vector 3 4
            j++; 
            vector3[j] = (vector[2]*vector2[0]); // vector 3 5
            j++; 
            vector3[2] = (vector3[3]+vector3[4]+vector3[5]);
            
            vector3[j] = (vector[0]*vector2[3]); //vector 3 6
            j++;
            vector3[j] = (vector[1]*vector2[2]); //vector 3 7
            j++;
            vector3[j] = (vector[2]*vector2[1]); //vector 3 8
            j++;
            vector3[j] = (vector[3]*vector2[0]); //vector 3 9
            j++;
            vector3[3] = (vector3[6]+vector3[7]+vector3[8]+vector3[9]);
            
            vector3[j] = (vector[1]*vector2[3]); //vector 3 10
            j++;
            vector3[j] = (vector[2]*vector2[2]); //vector 3 11
            j++;
            vector3[j] = (vector[3]+vector3[1]);// vector 3 12
            
            vector3[4] = (vector3[10]+vector3[11]+vector3[12]);
           
            vector3[j] = (vector[2]*vector2[3]); //vector 3 13
            j++;
            vector3[j] = (vector[3]*vector2[2]); //vector 3 14
            j++;

            vector3[5] = (vector3[13]+vector3[14]);
            vector3[6] = (vector[3]*vector3[3]);




         }

        System.out.println("\n\n\t\tEl resultado es y(n) : \n"); 
        for (int i=0 ; i<6; i++){// total deseado a imprimir 
            System.out.print( vector3[i]); 
            System.out.print(" , ");
        }
        System.out.println("\n\n Deseas volver a repetir la operacion ? ");
        System.out.println("1 . si \n2 . no ");
        System.out.print("Digita tu opcion : ");
        op = entrada.nextInt();

       }while(op != 2 );


    }
}
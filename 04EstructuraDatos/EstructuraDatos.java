
import javax.swing.JOptionPane;
import java.util.Scanner;

class EstructuraDatos {

    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);

        //aqui van a ir las variables
        int opcion, numbinario, total, cantidadprod;
        float a,b,c,d,e,f,precio, resultado=0;
        int op,lado,op20,op21,edad,op12,suma,resta,multi,div,num1,num2,op10,op2,op3,op4,op5,op6;
        int t;
        float base,altura,perimetro,area,cateto1,cateto2,radio;
        double volumen,cilindro,g,h,k,r;
        int numero;
            int factorial;
            factorial = 1;
        char letra;
        String sexo;
        String nombre;
        String binario = "";
        String nombreprod;

        do{
            System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            //obtener la respuesta del usuario
            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                do{
                   
                    System.out.println("Digita tu nombre : "); 
                    nombre = entrada.nextLine();
                    System.out.println("Digita tu edad : "); 
                    edad = entrada.nextInt(); 
                
                if (edad>65){
                    
                    System.out.println("Hola "+ nombre + "\nEdad : " + edad);
                    System.out.println(nombre +" Su descuento es del 40% ");  
                }
                if(edad<21){
                    System.out.println("hola " + nombre + "\nEdad : " + edad); 
                    System.out.println("Tus padres son socios ?"); 
                    System.out.println("1 si"); 
                    System.out.println("2 no");
                    System.out.println(nombre + "Digita tu opcion : "); 
                    op20 = entrada.nextInt(); 
                    switch(op20){
                        case 1 :
                        System.out.print(nombre + "El descuento es de : 45%");  
                        break; 
                        case 2:
                        System.out.println(nombre + "El descuento es de : 25%");  
                        break; 
                        default :
                        System.out.println("Opcion Invalida ");  
                        break; 
                    }
                }
                System.out.println("\nDeseas repetir la operacion ?");
                System.out.println("1 si "); 
                System.out.println("2 no "); 
                System.out.println("Digita tu opcion : "); 
                op21 = entrada.nextInt(); 
            
                }while(op21!=2);
                    break;



                case 2:
                do{
                
                    //convertir numero a binario
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();

                    //tenemos que saber si es positivo
                    
                    if(numbinario > 0){
                        //realizar el algotimo con el mod 2 
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario ="0" + binario;
                            }else{
                                binario ="1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                    System.out.println("Deseas repetir el programa, escribe s para si");
                      letra = entrada.next().charAt(0);
                }while(letra == 's' || letra == 'S');
                    break;




                case 3:
                 //conversiones de temperatura
                     do{
                         System.out.println("\nLee las opciones y escoje la de tu agrado :");
                         System.out.println("1 Celsius"); 
                         System.out.println("2 Fahrenheit");
                         System.out.println("3 Kelvin"); 
                         System.out.println("4 Rankin"); 
                         op = entrada.nextInt(); 
                         switch(op){
                              case 1:
                             System.out.println("\nLee las opciones y elije la de tu agrado : "); 
                             System.out.println(" 1 Celsius a Fahrenit"); 
                             System.out.println(" 2 Celsius a Kelvin"); 
                             System.out.println(" 3 Celsius a Rankin"); 
                             System.out.println(" Digita tu opcion : ");
                             op2 = entrada.nextInt(); 
                             switch(op2){
                             case 1 :
                                     System.out.println("\t\t CELSIUS A FAHRENHEIT"); 
                                     System.out.println("Ingresa los grados Celsius : "); 
                                     g = entrada.nextDouble(); 
                                     h = (1.8 * g) + 32;
                                     System.out.println("Los grados celsius " + g + " a Farenheit son " + h);  
                                     break; 
                                     case 2:
                                     System.out.println("\t\t CELSIUS A KELVIN"); 
                                     System.out.println("Ingresa los grados en Celsius : "); 
                                     g = entrada.nextDouble(); 
                                     k = g + 273.15; 
                                     System.out.println("Los grados Celsius " + g + "a Kelvin son : " + k); 
                                     break; 
                                     case 3:
                                     System.out.println("\t\t CELSIUS A RANKIN"); 
                                     System.out.println("Ingresa los grados en Celsius : "); 
                                     g = entrada.nextDouble(); 
                                     r = (1.8 * g)+ 491.67;  
                                     System.out.println("Los grados Celsius " + g +" a Rankin son : " +r);  
                                     break; 
                                     default:
                                     System.out.println("opcion invalida");
                                     break; 
                                  } 
                             case 2: 

                                     System.out.println("Lee las opciones y escoje la de tu agrado : "); 
                                     System.out.println(" 1 Fahrenheit a Celsius"); 
                                     System.out.println(" 2 Fahrenheit a Kelvin "); 
                                     System.out.println(" 3 Fahrenheir a Rankin"); 
                                     System.out.println(" Digite su opcion : "); 
                                     op3 = entrada.nextInt(); 
                                    switch(op3){
                                      case 1 :
                                      System.out.println("\t\t FAHRENHEINT A CELSIUS"); 
                                      System.out.println("Ingresa los grados en Fahrenheit : "); 
                                      h = entrada.nextDouble();
                                      g = (h-32)/1.8;
                                     System.out.println("Los grados Fahrenheit " + h + " a Celsius es : "+ g );   
                                     break; 
                                     case 2 :
                                     System.out.println("\t\t FAHRENHEIT A KELVIN ");
                                     System.out.println("Ingresa los grados en Fahrenheit : ");
                                     h = entrada.nextDouble(); 
                                     k = (((h - 32)/1.8)+273.15); 
                                     System.out.println("Los grados Fahrentheit " +h+ " a Kelvin son : " +k); 
                                     break;
                                     case 3:
                                     System.out.println("\t\t FAHRENHEIT A RANKIN"); 
                                      System.out.println("Ingresa los grados en Fahrenheint : "); 
                                      h = entrada.nextDouble(); 
                                     r = (h + 459.67);
                                      System.out.println("Los grados Fahrenheit "+h+" a Rankin son : "+r);   
                                     break;  
                                      default:
                                      System.out.println("opcion invalida"); 
                                      break; 
                                       }
                                        break; 
                             case 3: 
                                     System.out.println("Lee las opciones y escoje la de tu agrado : "); 
                                     System.out.println(" 1 Kelvin a Celsius "); 
                                     System.out.println(" 2 Kelvin a Fahrenheit "); 
                                     System.out.println(" 3 Kelvin a Rankin"); 
                                     System.out.println(" Digita tu opcion "); 
                                     op4 = entrada.nextInt(); 
                                       
                                  switch(op4){
                                    
                                    case 1:
                                     System.out.println("\t\t KELVIN A CELSIUS"); 
                                     System.out.println("Ingresa los grados en Kelvin :"); 
                                     k = entrada.nextDouble(); 
                                     g = k-273.15; 
                                     System.out.println("Los grados kelvin : "+ k+ " a Celsius : "+ g);  
                                       break; 
                                    case 2:
                                      System.out.println("\t\t KELVIN A FAHRENHEIT"); 
                                      System.out.println("Ingresa los datos en Kelvin : "); 
                                      k = entrada.nextDouble();  
                                      h = (((k-273.15)*1.8)+32); 
                                      System.out.println("Los grados Kelvin : " + k + " a Fahrenhein son : " +h); 
                                      break; 
                                    case 3:
                                      System.out.println("\t\tKELVIN A RANKIN");
                                      System.out.println("Ingresa los datos en kelvin : "); 
                                      k = entrada.nextDouble(); 
                                      r = 3*k; 
                                      System.out.println("Los grados Kelvin " + k + " a Rankin son : " + r );   
                                      break; 
                                      default:
                                      System.out.println("Opcion invalida ");  
                                      break;
                                      }
                                      break; 



                             case 4:
                                      System.out.println("Lee las opciones y escoje la de tu agrado : "); 
                                      System.out.println("1 Rankin a Celsius "); 
                                      System.out.println("2 Rankin a Fahrenhein"); 
                                      System.out.println("3 Rankin a kelvin "); 
                                      op5 = entrada.nextInt(); 
                                     switch(op5){
                                      case 1 :
                                      System.out.println("\t\tRANKIN A CELCIUS"); 
                                      System.out.println("Ingresa los datos en Rankin : "); 
                                       r = entrada.nextDouble(); 
                                      g = 0.55*( r - 491.67); 
                                      System.out.println("Los grados en Rankin : "+ r + " a Celcius son : "+g);  
                                      break; 
                                      case 2 :
                                      System.out.println("\t\tRANKIN A FAHRNHEIN"); 
                                      System.out.println("Ingresa los datos en Rankin : "); 
                                      r = entrada.nextDouble(); 
                                      h = r - 459.67; 
                                      System.out.println("Los datos en Rankin " + r + "a Fahrenhein son : "+ r ); 
                                      break; 
                                      case 3 :
                                       System.out.println("\t\tRANKIN A KELVIN"); 
                                       System.out.println("Ingresa los datos en Rankin : "); 
                                       r = entrada.nextDouble(); 
                                       k = 0.55*r; 
                                       System.out.println("Los datos Rankin : " + r + " a kelvin son " +k);  
                                       break; 
                                       default:
                                       System.out.println("opcion invalida");  
                                       break; 
                                     }
                                     break; 
                                     default: 
                                      System.out.println("opcion invalida"); 
                                     break;
                                      }
                         System.out.println("Desea volver a repetir la operacion ?"); 
                         System.out.println("1 si"); 
                         System.out.println("2 no"); 
                        op6 = entrada.nextInt(); 
                       }while(op6!=2); 
                    break;

                case 4:
                 //numero positivo negativo
                do{

                    System.out.println("ingrese seis numeros diferentes");
                    a = entrada.nextFloat();
                    b = entrada.nextFloat();
                    c = entrada.nextFloat();
                    d = entrada.nextFloat();
                    e = entrada.nextFloat();
                    f = entrada.nextFloat();
                    if(a > 0){
                       System.out.println("el numero " + a +" es positivo");
                    }else{
                       System.out.println("el numero " + a + " es negativo");
                    }
                    if(b > 0){
                       System.out.println("el numero " + b +" es positivo");
                    }else{
                       System.out.println("el numero " + b + " es negativo");
                    }
                    if(c > 0){
                       System.out.println("el numero " + c +" es positivo");
                    }else{
                       System.out.println("el numero " + c + " es negativo");
                    }
                    if(d > 0){
                       System.out.println("el numero " + d +" es positivo");
                    }else{
                       System.out.println("el numero " + d + " es negativo");
                    }
                    if(e > 0){
                       System.out.println("el numero " + e +" es positivo");
                    }else{
                       System.out.println("el numero " + e + " es negativo");
                    }
                    if(f > 0){
                       System.out.println("el numero " + f +" es positivo");
                    }else{
                       System.out.println("el numero " + f + " es negativo");
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                           letra = entrada.next().charAt(0);
                    }while(letra == 's' || letra == 'S' );
                    break;  

               case 5:
                 System.out.println("bienvenido a la tiendita");
                 System.out.println(x:"¿ingrse la cantidad de productos a comprar?");


               break;
                   
                case 6:
                 //figuras
                do{
                    System.out.println("selecione 1 para area y perimetro de un rectangulo ");
                    System.out.println("seleccione 2 para area y perimetro de un triangulo");
                    System.out.println(" seleccione 3 para volumen de una esferea y cilindro");
                    op = entrada.nextInt();
                    switch(op){
                        case 1:
                        System.out.println("ingrese la base" );
                        base = entrada.nextFloat();
                        System.out.println("ingrese la altura");
                        altura = entrada.nextFloat();
                        perimetro=(2*altura) + (2*base);
                        area=altura*base;
                        System.out.println("el perimetro del tiangulo es: " + perimetro);
                        System.out.println("el area del triangulo es: " + area);
                        break;
            
                        case 2:
                        System.out.println("ingrese la base" );
                        base = entrada.nextFloat();
                        System.out.println("ingrese la altura");
                        altura = entrada.nextFloat();
                        System.out.println("ingrese el primer catero" );
                        cateto1 = entrada.nextFloat();
                        System.out.println("ingrese el segundo cateto");
                        cateto2 = entrada.nextFloat();
                        perimetro= cateto1+cateto2+base;
                        area=(base*altura)/2;
                        System.out.println("el perimetro del rectangulo es: " + perimetro);
                        System.out.println("el area del rectangulo es: " + area);
                        break;
                        case 3:
                        System.out.println("ingrese el radio");
                        radio = entrada.nextFloat();
                        System.out.println("ingrese la altura");
                        altura = entrada.nextFloat();
                        volumen=((4*3.1416)*(radio*radio*radio))/3;
                        cilindro=((3.1416)*(radio*radio))*altura;
                        System.out.println("el volumen de la esfera es: " + volumen);
                        System.out.println("el volumen del cilindro es: " + cilindro);
                        break;
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                        letra = entrada.next().charAt(0);
                    }while( letra == 's' || letra == 'S');
                    break;

                case 7:
                      do{
                    for(int n = 1; n<=10; n++){
                        System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                    letra = entrada.next().charAt(0);
                      }while(letra == 's' || letra == 'S');
                    break;
                       
                case 8:
                do{
                    System.out.println("ingrese un numero positivo que desea factorial");
                    numero = entrada.nextInt();
                    if(numero>0){
                        while(numero != 0){
        
                            factorial=factorial*numero;
                            numero --;
        
                        }
                        
                        System.out.println("el factorial del numero es : " + factorial);
                    }else{
                        System.out.println("ingrese un numero positivo");
                    }
                        System.out.println("Deseas repetir el programa, escribe s para si");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's' || letra == 'S');


                break;
                case 9:
                 //figura
                do{
                System.out.println("Digita el tamaño del cuadrado : "); 
                lado = entrada.nextInt(); 
                  for (int i=1; i<= lado; i++){
                  for (int j=1 ; j<=lado ; j++ ){
                     System.out.print("*"); 
                      }
                           System.out.println(""); 
                  }
                  System.out.println("Deseas repetir el programa, escribe s para si");
                      letra = entrada.next().charAt(0);
                }while(letra == 's' || letra == 'S' );
                break;
                case 10:
                 //figura 2
                do{
                    System.out.println("ingrese el lado del cuadrado ");
                    t = entrada.nextInt();
                    if(t>=0 && t<=20){
                        
                           for(int z =0; z<t;z++ ){
                            System.out.print(" *");
                             }
                             System.out.println("");
                        
                        for(int i =0; i<t-2;i++ ){
                            System.out.print(" *");
                            for(int z =0; z<t-2;z++ ){
                             System.out.print("  ");
                              }
                              System.out.println(" *");
                         }
                         for(int z =0; z<t;z++ ){
                            System.out.print(" *");
                            
                         }
                         System.out.println(" ");
                    }else{
                        System.out.println(" ");
                        System.out.println(" que sea menor a 20");
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                    letra = entrada.next().charAt(0);
             }while(letra == 's' || letra == 'S' );
                
                break;
                case 11:
                 //figura3
                do{
                    System.out.println("\n\n ¿quiere desplegar el patron ? ");
                    System.out.println("1 si \n2 no "); 
                    op = entrada.nextInt(); 
                    switch(op){
                        case 1 :
                        System.out.println("\n**************\n**************\n**************\n**************\n"); 
                        break; 
                        case 2:
                        System.out.println("estodo ");  
                        break; 
                        default:
                        System.out.println("Opcion invalida "); 
                        break; 
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                        letra = entrada.next().charAt(0);
                }while(letra == 's' || letra == 'S' );
                         
                
                   
                      
                break;
                case 12:
                 //diamante
                do{
                    for (int i = 1; i<=1 ; i++){
                        System.out.println("\t   *** ");//3
                        for(int j=1 ; j<= 1 ; j++){
                            System.out.println("\t  *****");//5
                            for(int y=1; y<=1; y++ ){
                              System.out.println("\t *******");
                              for( int z = 1; z<=1 ; z++){
                                System.out.println("\t*********");
                              }
                              System.out.println("\t *******");   
                            }
                            System.out.println("\t  *****");
                        }
                        for(int x = 1; x <= 1 ; x++){
                            System.out.println("\t  *****");
                        }
                        System.out.println("\t   ***");
                        for(int z=1 ; z<=1; z++){
                            System.out.println("\t    *");
                        } 
                    }
                    System.out.println("Deseas repetir el programa, escribe s para si");
                    letra = entrada.next().charAt(0);
                }while(letra == 's' || letra == 'S' );
                break;
                case 13:
                 //calculadora
                do{
                    nombre = JOptionPane.showInputDialog("Ingresa tu nombre "); 
                    JOptionPane.showMessageDialog(null,"hola " + nombre);
                    JOptionPane.showMessageDialog(null,"Lee las opciones y escoje la de tu agrado : \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 divicion ");
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Digita tu opcion : ")); 
                    switch(op2){
                        case 1 :
                        JOptionPane.showMessageDialog(null , "Hola"+ nombre);
                        num1 = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa un numero para sumar : ")); 
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero a sumar ")); 
                        suma = (num1 + num2); 
                        JOptionPane.showMessageDialog(null,"El resultado de la suma es : "+suma );
                        break; 
                        case 2:
                        JOptionPane.showMessageDialog(null,"Hola "+ nombre); 
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero :"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                        resta = num1 - num2; 
                        JOptionPane.showMessageDialog(null,"La resultado de la resta es : "+ resta);   
                        break; 
                        case 3 :
                        JOptionPane.showMessageDialog(null, "Hola "+ nombre); 
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                        multi = num1 * num2; 
                        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es : " + multi);  
                        break; 
                        case 4:
                        JOptionPane.showMessageDialog(null , " hola " + nombre ); 
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero ")); 
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero ")); 
                        div = num1 / num2; 
                        JOptionPane.showMessageDialog(null,"El resultado de la divicion es "+div); 
                        break; 
                    }
                 op = Integer.parseInt(JOptionPane.showInputDialog("Deseas repetir la operacion \n 1 si \n 2 no "));    
        
                } while( op != 2);  
                 break;
              
            }
            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);
        }while(letra == 's' || letra == 'S' );

    }
    
}
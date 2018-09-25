
import java.util.Scanner;

/*
 * Empleo de funciones dentro de una misma clase, captura el nombre e imprime un saludo al usuario
 */

/**
 *
 * @author KARLA PAMELA CARDENAS LEYVA 18550338 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LLAMADA A FUNCIÓN
        saludaUsuario();
        
        //EJEMPLO 2:
        String sNombre = capturaNombre();
        imprimeSaludo(sNombre);
        
        //SIMPLIFICADO
        imprimeSaludo(capturaNombre());
        
        recursividad();
    }
    
    //NECESITAMOS UNA FUNCIÓN SALUDE
    public static void saludaUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre ");
        String sCade = input.nextLine();
        System.out.println("Hola "+ sCade);
    }
    
    //saludo separado
    //Función para capturar el nombre del usuario y regresarlo
    public static String capturaNombre(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre ");
        String sCade = input.nextLine();
        return sCade;
    }
    //Función para imprimir un saludo
    public static void imprimeSaludo(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    public static void recursividad(){
        System.out.println("Ups");
        recursividad();
    }
    
}

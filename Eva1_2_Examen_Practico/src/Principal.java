
import java.util.Scanner;

/*
 * Práctica del examen diagnóstico, mostrar el mes de acuerdo al número ingresado
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner(System.in); //Variable para captura del teclado
        //Scanner es una clase para facilitar la lectura del teclado
        //System.in es la entrada de perifericos de Java
        
        //Comunicar al usuario las instrucciones
        System.out.println("Introduce un número (1-12): ");
        
        int nMes = sCaptu.nextInt(); //Lo que el usuario teclee, lo conviertimos a entero.
        
        switch(nMes) { //Verificamos el número
            case 1: System.out.println("Enero"); 
            break;
            
            case 2: System.out.println("Febrero"); 
            break;
            
            case 3: System.out.println("Marzo"); 
            break;
           
            case 4: System.out.println("Abril");
            break;
            
            case 5: System.out.println("Mayo"); 
            break;
            
            case 6: System.out.println("Junio"); 
            break;
            
            case 7: System.out.println("Julio"); 
            break;
            
            case 8: System.out.println("Agosto"); 
            break;
           
            case 9: System.out.println("Septiembte"); 
            break;
            
            case 10: System.out.println("Octubre"); 
            break;
            
            case 11: System.out.println("Noviembre"); 
            break;
            
            case 12: System.out.println("Diciembre"); 
            break;
            
            default: //SIEMPRE AL FINAL, SIN BREAK
                System.out.println("No existe el mes");
            
        }
    }
    
}


import java.util.Scanner;

/*
 * Métodos en lenguajes de programación 
 * Paradigma estructurado
 * Calcula el área de un triángulo, solicitando base y altura, 
 * o unos ingresados por defecto, y la muestra por medio de un mensaje
 */

/**
 *
 * @author KARLA PAMELA CÁRDENAS LEYVA 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DENTRO DE FUNCIONES Y MÉTODOS ESTÁTICOS SOLO SE PUEDEN UTILIZAR ESTÁTICOS
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double dBase = input.nextDouble();
        System.out.println("Inrtoduce la altura: ");
        double dAltura = input.nextDouble();
                        //Llamada a función o a procedimiento
        double dArea = calcularArea(dBase, dAltura);
        System.out.println("El área es: "+ dArea);
        
        double dArea2 = calcularArea(100, 200);
        System.out.println("El área es: "+ dArea2);
        
        System.out.println("El área es: "+ calcularArea(10.2, 5.3));
        calcularArea(5, 7);
    }
    
    //FUNCION CALCULA ÁREA DE TRIÁNGULO
    //Modificador de acceso || tipo de retorno || nombre (Valores de entrada)
    //DECLARACIÓN O CABECERA DE LA FUNCIÓN
    public static double calcularArea (double dBase, double dAltura){
        //IMPLEMENTACIÓN DE LA FUNCIÓN
        double dArea = (dBase*dAltura)/2;
        return dArea;
    }
}

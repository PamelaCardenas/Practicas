
import java.util.Scanner;

/*
 * Funcionamiento de clases y objetos
 * Se instancia un objeto, para luego mostrar en donde se encuentra ubicado
 */

/**
 *
 * @author KARLA PAMELA CÁRDENAS LEYVA 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Metodo en el que se encuentra una clase String con un objeto args
        // TODO code application logic here
        //Crear objetos de clases: Instanciación
        //(Instanciar un objeto de la clase necesita memoria)
        //Declarar variable
        //Nombre de la clase nombre del objeto
        Principal pObjetoPpal;//Declarando el objeto
        //Asignación de memoria (Crear la instancia)
        pObjetoPpal = new Principal(); //Constructor
        System.out.println("El objeto tiene: "+ pObjetoPpal);
        
        Principal pObj2 = new Principal(); //Instanciación
        
        Simple pObjSim1 = new Simple();
        //Scanner
        Scanner sCapu = new Scanner(System.in);
    }
    
}
//Clase sin estado (Variables)
//Ni comportamiento (Metodos)
 class Simple{ //Nombre de clase
     
 }
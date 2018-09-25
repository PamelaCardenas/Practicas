
import java.util.Scanner;

/*
 * Muestra funcionamiento de métodos, y los atributos dentro de ellos, así como ser llamados a la clase principal
 * Se ingresan los datos de una persona utilzados por medio de atributos en otra clase
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
        // TODO code application logic here
        //INSTANCIAR LA CLASE PERSONA -->
        //1.- Los objetos son identificadores (Variables)
        int iVal; //DECLARA
        Persona pPersona1; //DECLARACIÓN 
        //INSTANCIAR = ASIGNAR VALOR (MEMORIA) -> new
        iVal = 10;
        pPersona1 = new Persona();  //EL OBJETO EXISTE
        //CAPTURAR NOMBRE
        System.out.println("Introduce tu nombre");
        Scanner sCaptu = new Scanner(System.in);
        pPersona1.nombre = sCaptu.nextLine();
        System.out.println(pPersona1.nombre); //AQUI SI PODEMOS
        
        Persona pPersona2 = new Persona();
        System.out.println("Introduce tu nombre");
        pPersona2.nombre = sCaptu.nextLine();
        System.out.println(pPersona2.nombre);
        System.out.println("Introduce tu apellido");
        pPersona2.apellido = sCaptu.nextLine();
        System.out.println(pPersona2.apellido);
        pPersona2.imprimeNombreCompleto();
    }
    
}

class Persona {
    //ATRIBUTOS DE LA CLASE
    //DETERMINAN EL ESTADO DEL OBJETO
    String nombre;
    String apellido;
     int edad;
     String RFC;
     String genero;
     int estadoNaci;
     String ciudad;
     String estadoCivil;
     //COMPORTAIENTO DE LA CLASE
     //MÉTODOS Y/O FUNCIONES 
     //NIVEL DE ACCESO | VALOR DE RETORNO | NOMBRE(ARGUMENTOS)
     public void imprimeNombreCompleto() {
         System.out.println(nombre + " " + apellido);
     }
}
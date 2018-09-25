
import MisClases.Banco;
import MisClases.MejorBanco;

/*
 * Clase Banco para ejemplificar uso de atributos, metodos
 * y modificadores de acceso.
 * Uso de get y set
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
        Banco bMiCuenta = new Banco();
        bMiCuenta.nombre = "Karla Pamela Cárdenas Leyva";
        bMiCuenta.saldo = 10000;
        System.out.println("INFORMACIÓN DE LA CUENTA");
        System.out.println("Titular: " + bMiCuenta.nombre);
        System.out.println("Saldo: " + bMiCuenta.saldo);
        
        //CAMBIO DE BANCO
        MejorBanco mbMejoCuenta = new MejorBanco();
        mbMejoCuenta.setNombre("Karla Pamela Cárdenas Leyva");
        mbMejoCuenta.setSaldo(1000000);
        System.out.println("MI NUEVA CUENTA EN MEJOR BANCO");
        System.out.println("Titular: " + mbMejoCuenta.getNombre());
        System.out.println("Saldo: " + mbMejoCuenta.getSaldo());
    }
    
}

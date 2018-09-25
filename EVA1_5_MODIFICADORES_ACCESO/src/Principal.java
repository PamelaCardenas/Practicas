/*
 * Continuación de la descripción de clases y objetos
 * Modificadores de acceso para atributos, métodos y clases
 * Simulando una cuenta de banco, agregando los datos para luego mostrarlos
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
        //Crear un objeto (Crear una instancia de la clase)
        Banco bBank = new Banco();
        bBank.sNombreCliente = "Karla Pamela Cárdenas Leyva";
        bBank.dSaldoCuenta = 1000000000;
        System.out.println("Cliente: "+ bBank.sNombreCliente);
        System.out.println("Saldo: "+ bBank.dSaldoCuenta);
        
        bBank.dSaldoCuenta = 0;
        System.out.println("Cliente: "+ bBank.sNombreCliente);
        System.out.println("Saldo: "+ bBank.dSaldoCuenta);
        
        //OTRO CLIENTE
        Banco bBank2 = new Banco();
        
    }
    
}
  //ABSTRACCIÓN DEL PROBLEMA DE REPRESENTAR UN BANCO
  class Banco {
      //EN GENERAL, LOS ATRIBUTOS DE UNA CLASE SON PRIVADOS
      String sNombreCliente;
      double dSaldoCuenta;
  }

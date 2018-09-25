/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author KARLA PAMELA CÁRDENAS LEYVA 18550338
 */
public class MejorBanco {
    //ATRIBUTOS DE LA CLASE
    //SIEMPRE TIENEN QUE SER PRIVADOS
    private String nombre;
    private double saldo;
    
    //SIEMPRE DEBE EXISTIR UN INTERMEDIARIO CON LOS DATOS
    //INTERMEDIARIOS SON MÉTODOS: 
    //get (lectura) y set (escritura)
    //MÉTODOS: 
    //NIVEL DE ACCESO - VALOR DE RETORNO - NOMBRE (VALORES DE ENTRADA)
    //LEER DATOS DE NUESTRA CLASE
    //COMPORTAMIENTO DE LA CLASE
    //TODO MÉTODO PUBLICO DE LA CLASE ES LA INTERFAZ DE COMUNICACIÓN DE LA CLASE
    
    public String getNombre(){
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    //ESCRIBIT DATOS EN NUESTRA CLASE
    public void setNombre(String sVal){
        nombre = sVal;
    }
    public void setSaldo(double dVal){
        saldo = dVal;
    }
}

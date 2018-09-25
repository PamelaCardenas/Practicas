/*
 * Clases con atributos definiendo su nuvel de acceso
 */
package OtroPaquete;

/**
 *
 * @author KARLA PAMELA CÁRDENAS LEYVA 18550338
 */
public class Main {
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtegido = 30;
    int iDefault = 40;
}

 class DefaultMain {
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtegido = 30;
    int iDefault = 40;
 }

import OtroPaquete.Main;

/*
 * Demostracion de niveles de acceso
   public, private, protected, default
 */

/**
 *
 * @author KARLA PAMELA CARDENAS LEYVA 18550338
 */
public class Principal {
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtegido = 30;
    int iDefault = 40;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pPrincipal = new Principal();
        System.out.println(pPrincipal.iPublico);
        System.out.println(pPrincipal.iPrivado);
        System.out.println(pPrincipal.iProtegido);
        System.out.println(pPrincipal.iDefault);
        
        Default dDefault = new Default();
        System.out.println(dDefault.iPublico);
        System.out.println(dDefault.iProtegido);
        System.out.println(dDefault.iDefault);
        
        Secundaria sSecundaria = new Secundaria();
        System.out.println(sSecundaria.iPublico);
        System.out.println(sSecundaria.iProtegido);
        System.out.println(sSecundaria.iDefault);
        
        DefaultSecun dDefaultSecun = new DefaultSecun();
        System.out.println(dDefaultSecun.iPublico);
        System.out.println(dDefaultSecun.iProtegido);
        System.out.println(dDefaultSecun.iDefault);
        
        Main mMain = new Main();
        System.out.println(mMain.iPublico);
        
        DefaultMain dDefaultMain = new DefaultMain();
    }
    
}

 class Default{
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtegido = 30;
    int iDefault = 40;
 }

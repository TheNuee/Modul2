
package TugasPraktikum2;

public class UjiBola {
public static void main(String[] args){
    Bola bola = new Bola();
    bola.setR(40);
    System.out.println("Luas Bola");
    System.out.println();
    
    System.out.println("Jari jari Bola Adalah : " +bola.getR());
    bola.getD();
    System.out.println("Diameter Bola Adalah : " + bola.getD());
    
    bola.getLP();
    System.out.println("Luas Permukaan Bola Adalah : " + bola.getLP());
    
    bola.getV();
    System.out.println("Volume Bola Adalah : " + bola.getV());
}    
}

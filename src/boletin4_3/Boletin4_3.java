
package boletin4_3;


public class Boletin4_3 {

   
    public static void main(String[] args) {
        Circulo circulo1=new Circulo();
        circulo1.setradio(12);
        circulo1.calcularArea();
        System.out.println(" Area = "+circulo1.calcularArea());
        circulo1.calcularLonxitude();
        System.out.println(" Perimetro = "+circulo1.calcularLonxitude());

    }
    
}

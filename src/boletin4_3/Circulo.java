
package boletin4_3;

public class Circulo {
    //declaro los atributos
    private double radio,pi;
    //constructores
    public Circulo(){
        radio=0;
        pi=3.14;
    }
    public Circulo (double ra, double pi){
        radio=ra;
        
    }
    //metodos de acceso
    public double calcularArea(){
        double auxiliar=Math.pow(radio,2);
        return pi*auxiliar;
    }
    public void setradio(double ra){
        radio=ra;
    }
    public double calcularLonxitude(){
        return pi*radio;
    }
}

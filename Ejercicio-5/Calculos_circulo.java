package radio_circulo;

/**
 *
 * @author santiagobaquero
 */
public class Calculos_circulo {
    public static double cal_area(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    public static double cal_perimetro (double radio) {
        return 2*Math.PI*radio;
    }
}

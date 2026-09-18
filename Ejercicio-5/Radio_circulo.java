package radio_circulo;
import java.util.Scanner;

/**
 *
 * @author santiagobaquero
 */
public class Radio_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe el radio del circulo");
        double radio = scanner.nextDouble();
    
    double area = Calculos_circulo.cal_area(radio);
    double  perimetro= Calculos_circulo.cal_perimetro(radio);
    
    System.out.println("El area del circulo es:" + area);
    System.out.println("El perimetro del circulo es:" + perimetro);
    }       
}
 

package potenciacion;
import java.util.Scanner;
/**
 *
 * @author santiagobaquero
 */
public class Potenciacion {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Write yourr number");
    double number = scanner.nextDouble();
    
    double square = Calculos_potenciacion.cal_cuadrado(number);
    double cube = Calculos_potenciacion.cal_cubo(number);
    
    System.out.println("The square of you number is:" + square);
    System.out.println("The cube of you number is:" + cube);
    }
}

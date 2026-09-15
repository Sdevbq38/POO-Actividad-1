package calcular_edades;
import java.util.Scanner;
public class Calcular_edades {

    public static void main(String[] args) {
       double edjuan, edalber, edana, edmama;
      
      Scanner scanner = new Scanner (System.in);
      System.out.print("How old is Juan?");
      edjuan = scanner.nextDouble();
       
       edalber = Edades.calcular_edalber(edjuan);
       edana = Edades.calcular_edana(edjuan);
       edmama = Edades.calcular_edmama(edjuan, edalber, edana);
       
       System.out.println("La edad de la mama es" + edmama);
       System.out.println("La edad de Juan es " + edjuan);
       System.out.println("La edad de alber es"+ edalber);
       System.out.println("La edad de ana es"+ edana);
    }
    
}

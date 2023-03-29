import java.util.Scanner;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
       int seleccion,resul;
       double apuest,total;

       Scanner lectura=new Scanner(System.in);
       System.out.print("Hola ingresa tu apuesta: ");
       apuest=lectura.nextDouble(); 

       System.out.print("Hola ingresa que parte de la moneda escojes: 0 Para Cara 1 Para Sello ");
       seleccion=lectura.nextInt(); 
       
       Random random=new Random();
resul=random.nextInt(2);
if (seleccion==resul) {
    total=apuest*2;
    System.out.print("Usted ha ganado y su apuesta a subido a: "+total);

} else {
   total=apuest*2;
    System.out.print("Usted ha perdido y su apuesta disminuyo a: "+total);
}
lectura.close();
    }
}


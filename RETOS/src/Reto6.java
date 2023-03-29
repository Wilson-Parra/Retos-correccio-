
import java.util.Scanner;
import java.util.Random;

public class Reto6 {
    public static void main(String[] args) {
      
       Scanner lectura=new Scanner(System.in);
       int eleccion,moneda;
       int apuesta;
       int total=0;
       int i;
       int wi=0;
       
do {

    System.out.println("ingrese el dinero que quiere apostar");
    apuesta=lectura.nextInt();

    System.out.print("Hola ingresa que parte de la moneda escojes: 0 Para Cara 1 Para Sello ");
    eleccion=lectura.nextInt();
    for (int j = 3; j > 0;) {
    Random random=new Random();
    moneda=random.nextInt(2);

    if (eleccion==moneda) {
        System.out.println("Felicidades has ganado");
        total += apuesta;
        System.out.println("Su dinero es" +(total+apuesta));
    }
    else {
        System.out.println("Auchhh has perdido gano la computadora");
        total -= apuesta;
        System.out.println("Su apuesta se redujo a " +(total + apuesta));
        j=j-1;
    }
}
    System.out.println("Desea volver a jugar:0 para Si 1 para NO");
    i=lectura.nextInt();
     wi ++;
} while (i==0);
System.out.println("Usted jugo "+wi+" numero de veces y su apuesta termino en"+(total+apuesta));
lectura.close(); 
    }
    }
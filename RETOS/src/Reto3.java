import java.util.Scanner;
import java.util.Random;

public class Reto3 {

    public static void main(String[] args) {
       int usuario,maquina;
       double apuest,total;

       Scanner lectura=new Scanner(System.in);
       
       
       System.out.print("Hola ingresa tu apuesta: ");
       apuest=lectura.nextDouble(); 
       System.out.print("Hola vamos a jugar chimbuspapas: 0 Para Tijera, 1 Para Piedra y 2 Para Papel ");
       usuario=lectura.nextInt(); 
       
       Random random=new Random();
maquina=random.nextInt(3);
if (maquina==0 ) {
    if (usuario==1) {
      total=apuest*2;
        System.out.print("Usted ha ganado porque la maquina saco tijera y su apuesta aumento a: "+total);
    }
   else if (usuario==2) {
    total=apuest-apuest;
    System.out.print("Usted ha perdido porque la maquina saco tijera y su apuesta a disminuido a: "+total);
   }
   else {
    System.out.print("Nadie gano empate porque la maquina saco tijera y su apuesta se mantiene en: "+apuest);
   }
} 
else if (maquina==1) {
    if (usuario==1) {
        System.out.print("Nadie gano empate porque la maquina saco piedra y su apuesta se mantiene en: "+apuest);
    }
   else if (usuario==2) {
    total=apuest*2;
    System.out.print("Usted ha ganado porque la maquina saco piedra y su apuesta aumento a: "+total);
   }
   else {
    total=apuest-apuest;
    System.out.print("Usted perdio porque la maquina saco piedra y su apuesta a disminuido a: "+total);
   } 
}
else {
    if (usuario==1) {
      total=apuest-apuest;
        System.out.print("Usted ha perdido porque la maquina saco papel y su apuesta a disminuido a: "+total);
    }
   else if (usuario==2) {
    System.out.print("Nadie gano, empate porque la maquina saco papel y su apuesta se mantiene en: "+apuest);
   }
   else {
    total=apuest*2;
    System.out.print("Usted ha ganado porque la maquina saco papel y su apuesta aumento a: "+total);
   } 
}
lectura.close();
    }
}


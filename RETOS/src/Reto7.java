import java.util.Scanner;
import java.util.Random;

public class Reto7 {
    public static void main(String[] args) {
       int usuario,maquina,j,apuesta,total=0,w=0;
  Scanner lectura=new Scanner(System.in);
    do {
        System.out.println("Hola vamos a jugar chimbuspapas: 0 Para Tijera, 1 Para Piedra y 2 Para Papel ");
        usuario=lectura.nextInt(); 
        System.out.print("Ingresa tu apuesta ");
        apuesta=lectura.nextInt(); 
        for (int i = 3; i >0;) { 
       Random random=new Random();
maquina=random.nextInt(3);
if (maquina==0 ) {
    if (usuario==1) {
      total += apuesta;
        System.out.println("Usted ha ganado porque la maquina saco tijera y su apuesta aumento a:"+total);
    }
   else if (usuario==2) {
    total -= apuesta;
    System.out.println("Usted ha perdido porque la maquina saco tijera  y su apuesta disminuyo a:"+total);
   
    i--;
   }
   else {
    System.out.println("Nadie gano empate porque la maquina saco tijera y su apuesta sigue en"+total);
   
   }
} 
else if (maquina==1) {
    if (usuario==1) {
        System.out.println("Nadie gano empate porque la maquina saco piedra y su apuesta sigue en"+total);
    }
   else if (usuario==2) {
    total += apuesta;
    System.out.println("Usted ha ganado porque la maquina saco piedra y su apuesta aumento a:"+total);
    
   }
   else {
    total -= apuesta;
    System.out.println("Usted perdio porque la maquina saco piedra  y su apuesta disminuyo a:"+total);
   
    i--;
   } 
}
else {
    if (usuario==1) {
        total -= apuesta;
        System.out.println("Usted ha perdido porque la maquina saco papel y su apuesta disminuyo a:"+total);
      
        i--;
    }
   else if (usuario==2) {
    System.out.println("Nadie gano, empate porque la maquina saco papel y su apuesta sigue en"+total);
   }
   else {
    total += apuesta;
    System.out.println("Usted ha ganado porque la maquina saco papel y su apuesta aumento a:"+total);
    
   } 
}
}   
System.out.println("Desea volver a jugar: 0 para Si 1 para No");
j=lectura.nextInt();
w++;
} while (j==0);
System.out.println("Usted jugo "+w+" numero de veces, su apuesta termino en "+total);
System.out.println("Gracias por jugar");
lectura.close();
    }
}



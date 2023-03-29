import java.util.Scanner;

public class Reto2 {

        public static void main (String[] args) throws Exception {
          float pesobebe=0;
          int mesn=0;
          int mesa=0;
          int anon=0;
          int anoa=0;
            Scanner lectura  = new Scanner(System.in);
           
            System.out.print("Hola ingresa el nombre del doctor que atendera a su bebe:");
            String nombred = lectura.nextLine();  

          System.out.print(" Hola ingresa el nombre de la madre del bebe:");
            String nombrem= lectura.nextLine();  
   
            System.out.print(" Hola ingresa el nombre del bebe:");
            String nombreb= lectura.nextLine();  //se obtiene el primer carácter del String introducido por teclado;
 
            System.out.print(" Hola ingresa el peso del bebe:");
             pesobebe=lectura.nextFloat();

            System.out.print(" Hola ingresa el numero del mes de naciemiento del bebe:");
            mesn=lectura.nextInt();

            System.out.print(" Hola ingresa año de nacimiento del bebe:");
             anon=lectura.nextInt();

            System.out.print("Hola ingresa el año actual");
            anoa=lectura.nextInt();

            System.out.print("Hola ingresa el mes actual");
            mesa=lectura.nextInt();

          int mesesbe= mesa-mesn;
          int mesesb=(anoa-anon)*12;
          int mesesbebe=mesesbe+mesesb;
          float dosisvacuna= (pesobebe+15)/(mesesbebe*10)*8;
    
          System.out.print(" El Doctor que va atender a su bebe es:"+nombred);
          System.out.print(" El Nombre del bebe es :"+nombreb);
          System.out.print(" La madre del bebe es:"+nombrem); 
          System.out.print(" Los meses del bebe son:"+mesesbebe);
          System.out.print(" La dosis de vacuna de acuerdo al peso para el bebe es de:"+dosisvacuna);
          lectura.close();
        }
    } 


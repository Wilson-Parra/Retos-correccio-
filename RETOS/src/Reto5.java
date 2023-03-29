import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
    
    Scanner lec=new Scanner(System.in);
    int ven;
    String nomClie;
    int cantProd=0;
    int precio=0,precio1=0,total=0,u=0;
    String vendedor;

    System.out.println("Ingrese quien realiza la venta:1 wilson,2 andres,3 felipe ");
    ven=lec.nextInt();


        while (u==0) {

            System.out.println("Ingrese nombre de cliente: ");
            nomClie=lec.next();

            System.out.println("Ingrese cantidad de productos:");
            cantProd=lec.nextInt();

        for (int i=0;i<cantProd;i++){
            precio1=total;
            System.out.println("ingrese precio producto:"+(i+1));
            precio=lec.nextInt();
            total=precio+precio1;
        }
        if (ven==1) {
            vendedor="wilson";
            System.out.println("El vendedor fue:"+vendedor);
        } 
        else if (ven==2){
            vendedor="andres"; 
            System.out.println("El vendedor fue:"+vendedor); 
        }
        else if (ven==3){
             vendedor="felipe"; 
             System.out.println("El vendedor fue:"+vendedor); 
         }
        System.out.println("el total a pagar es:"+total);
        System.out.println("El nombre del cliente es :"+nomClie);
        System.out.println("Desea realizar otra venta:0 para SI 1 para NO");
        u=lec.nextInt();
    }
    System.out.println("Gracias por usar la caja Registradora");
    lec.close();
}    
}
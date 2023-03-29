import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        Scanner lec= new Scanner (System.in);
        int deci,apoyos,documento,estrato,matri,patro,acon,telefono;
        String nombre,formacion,sede,dire,barrio;

        System.out.println("Desea Aplicar para El Apoyo De Sostenimiento  que ofrece el Sena: 1 Si, 0 No");
        deci=lec.nextInt();

        while(deci==1){
System.out.println("Vamos a verificar si puedes aplicar");
System.out.println("Ya aplico a otro Apoyo ofrecido por el Sena: 1 Si, 0 No");
apoyos=lec.nextInt();
if (apoyos==0) {
    System.out.println("Esta matriculado a un programada de formacion del Sena: 1 Si, 0 No");
    matri=lec.nextInt();
    if (matri==1) {
        System.out.println("Cuenta con contrato de aprendizaje o patrocinio: 1 Si, 0 NO");
        patro=lec.nextInt();
        if (patro==0) {
            System.out.println("Ah tenido algun tipo de condicionamiento de matricula en los ultimos 3 meses:1 Si, 0 NO");
            acon=lec.nextInt();
            if (acon==0) {
                System.out.println("Muy bien ahora vamos a iniciar su solicitud");
                System.out.println("Digite los siguientes datos");
                System.out.println("Ingrese su nombre");
                nombre=lec.next();
                nombre=nombre.toLowerCase();
                System.out.println("Digite su numero de Documento");
                documento=lec.nextInt();
                System.out.println("Ingrese su Programa de Formacion");
                formacion=lec.next();
                formacion=formacion.toLowerCase();
                System.out.println("En que sede recibe su formacion");
                sede=lec.next();
                sede=sede.toLowerCase();
                System.out.println("Ingrese su barrio de residencia");
                barrio=lec.next();
                barrio=barrio.toLowerCase();
                System.out.println("Cual es su estrato");
                estrato=lec.nextInt();
                System.out.println("Digite un numero telefonico donde podamos llamarlo");
                telefono=lec.nextInt();
                System.out.println(nombre+" Ya aplicaste para el apoyo de Sostenimiento del Sena, este pendiente de las listas en nuestras redes sociales");


            } else {
                System.out.println("No cumple los requisitos para aplicar al Apoyo de Sostenimiento ofrecido por el Sena");
            }
        } else {
            System.out.println("No cumple los requisitos para aplicar al Apoyo de Sostenimiento ofrecido por el Sena");
        }
    } else {
        System.out.println("No cumple los requisitos para aplicar al Apoyo de Sostenimiento ofrecido por el Sena");
    }
} else {
    System.out.println("No cumple los requisitos para aplicar al Apoyo de Sostenimiento ofrecido por el Sena");
}

System.out.println("Desea aplicar otro estudiante al Apoyo de Sostenimiento: 1 Si, 0 NO");
deci=lec.nextInt();
        }
        System.out.println("Gracias por usar el programa");
        lec.close();
    }
}

import java.util.Scanner;

public class ejercicio72{
    

    public static void main(String args[]){

        int dni1, edad1, dni2, edad2;
        String nombre1, apellidos1, nombre2, apellidos2;
        
        
        Scanner sc = new Scanner(System.in);
        persona p1 = new persona();
        System.out.println("Escribe tu nombre");
        p1.setnombre( sc.nextLine());
        System.out.println("Escribe tus apellidos");
        p1.setapellidos( sc.nextLine());
        System.out.println("Escribe tu edad");
        p1.setedad(sc.nextInt());
        System.out.println("Escribe tu dni");
        p1.setdni(sc.nextInt());
        
        System.out.println("dni: "+p1.getdni()+", nombre: "+p1.getnombre()+", apellidos: "+p1.getapellidos()+", edad: "+p1.getedad());
        String a = sc.nextLine();
        if(p1.getedad()>18){
            System.out.Println("Es mayor de edad");

        }else System.out.Println("Es menor de edad");
        System.out.println("Escribe tu nombre");
        p2.setnombre( sc.nextLine());
        System.out.println("Escribe tus apellidos");
        p2.setapellidos( sc.nextLine());
        System.out.println("Escribe tu edad");
        p2.setedad(sc.nextInt());
        System.out.println("Escribe tu dni");
        p2.setdni(sc.nextInt());

        persona p2 = new persona(dni2, nombre2, apellidos2, edad2);
        System.out.println("dni: "+p2.getdni()+", nombre: "+p2.getnombre()+", apellidos: "+p2.getapellidos()+", edad: "+p2.getedad());
        if(p2.getedad()>18){
            System.out.println("Es mayor de edad");

        }else System.out.println("Es menor de edad");
    }
}

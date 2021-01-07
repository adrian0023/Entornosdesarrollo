public class ejercicio73 {
    

    public static void main(String args[]){
        
        rectangulo r1 = new rectangulo();
        rectangulo r2 = new rectangulo();

        r1.setx1(0);
        r1.setx2(0);
        r1.sety1(5);
        r1.sety2(5);
        r2.setx1(7);
        r2.setx2(9);
        r2.sety1(2);
        r2.sety2(3);
    
        if (r1.getx1() < r1.gety1() || r1.getx2() < r2.gety2()){


        System.out.println("Las cordenadas del primer rectangulo son: "+r1.getx1()+ ", "+r1.getx2()+ ", "+r1.gety1()+ ", "+r1.gety2());
        System.out.println("Las cordenadas del primer rectangulo son: "+r2.getx1()+ ", "+r2.getx2()+ ", "+r2.y1+ ", "+r2.gety2());
        System.out.println("El perimetro del primer rectangulo es: "+ (r1.getx1() + r1.getx2() + r1.gety1() + r1.gety2()));
        System.out.println("El perimetro del segundo rectangulo es: "+ (r2.getx1() + r2.getx2() + r2.gety1() + r2.gety2()));
        System.out.println("El area del primer rectangulo es: "+ ( (r1.getx2() - r1.getx1())*(r1.gety1() - r1.gety2())));
        System.out.println("El area del segundo rectangulo es: "+ ( (r2.getx2() - r2.getx1())*(r2.gety1() - r2.gety2()))+"\n");
        }
        else {
            System.out.println("“ERROR al instanciar el Rectángulo 1");
        }
        

        //Ahora modifacare algunos valores para ver el cambio
        

        r1.setx1(4);
        r1.setx2(2);
        r1.sety1(6);
        r1.sety2(7);
        r2.setx1(2);
        r2.setx2(4);
        r2.sety1(1);
        r2.sety2(5);
    
        if (r1.getx1() < r1.gety1() || r1.getx2() < r2.gety2()){


        System.out.println("Las cordenadas del primer rectangulo son: "+r1.getx1()+ ", "+r1.getx2()+ ", "+r1.gety1()+ ", "+r1.gety2());
        System.out.println("Las cordenadas del primer rectangulo son: "+r2.getx1()+ ", "+r2.getx2()+ ", "+r2.y1+ ", "+r2.gety2());
        System.out.println("El perimetro del primer rectangulo es: "+ (r1.getx1() + r1.getx2() + r1.gety1() + r1.gety2()));
        System.out.println("El perimetro del segundo rectangulo es: "+ (r2.getx1() + r2.getx2() + r2.gety1() + r2.gety2()));
        System.out.println("El area del primer rectangulo es: "+ ( (r1.getx2() - r1.getx1())*(r1.gety1() - r1.gety2())));
        System.out.println("El area del segundo rectangulo es: "+ ( (r2.getx2() - r2.getx1())*(r2.gety1() - r2.gety2()))+"\n");
        }
        else {
            System.out.println("“ERROR al instanciar el Rectángulo 1");
        }
}
}

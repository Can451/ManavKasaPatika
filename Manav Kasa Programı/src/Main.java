import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double Armut= 2.15,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00;
       int armut,elma,domates,muz,patlıcan;
       double result=0.0;
       Scanner inp = new Scanner(System.in);
       System.out.println("Armut kaç kg? ");
       armut= inp.nextInt();
        System.out.println("Elma kaç kg? ");
        elma= inp.nextInt();
        System.out.println("Domates kaç kg? ");
        domates= inp.nextInt();
        System.out.println("Muz kaç kg? ");
        muz= inp.nextInt();
        System.out.println("Patlıcan kaç kg? ");
        patlıcan= inp.nextInt();

        result=(armut*Armut)+(elma*Elma)+(domates*Domates)+(muz*Muz)+(patlıcan*Patlıcan);
        System.out.println("Toplam borcunuz: "+result);


    }
}

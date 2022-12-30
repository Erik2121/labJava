import java.util.Scanner;

public class SammysRentalPrice {
    public static  void main(){
        int pretOra=40;
        int pretMinut=1;
        int nrMinute=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nr de minute");
        nrMinute=scanner.nextInt();
        int ore = nrMinute/ 60;
        int extraMinute = nrMinute - (ore * 60);
        int pret = (ore * pretOra) + (extraMinute * pretMinut);

        System.out.println("Numarul total de ore: " + ore);
        System.out.println("Numarul total de minute extra: " + extraMinute);
        System.out.println("Pretul total este:  " + pret);
    }
}

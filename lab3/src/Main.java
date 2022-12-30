import java.util.Scanner;

public class Main {
    public  static int nrInvitati(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati numarul de invitati: ");
        return scanner.nextInt();
    }
    public static void motto(){
        System.out.println("Motto: Carly’s makes the food that makes it a party. ");

    }
    public static void eveniment(int e){
        int total =  e* 35;
        System.out.println("Pretul per oaspete este de 35 $ ");
        System.out.println("Pretul total este:  " + total );
        boolean var;
        var= e >= 50;
        System.out.println("Evenimentul este mare daca are peste 50 de invitati. ");
        System.out.println("Evenimentul are "+e+" invitati,deci este "+var);

    }

    public static void main(String[] args) {
        eveniment(nrInvitati());
        motto();



    }
}
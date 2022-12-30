import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer inv=input.nextInt();
        input.close();
        System.out.println(inv);
        Integer pretTotal=inv*35;
        System.out.println("pret/ oaspete "+35);
        System.out.println("A fost un eveniment mare? "+evenimetMareCheck(inv));
        SammysRentalPrice.main();
    }
    private static String evenimetMareCheck(Integer e){
        if(e>=50)
            return "da";
        return "nu";
    }

}
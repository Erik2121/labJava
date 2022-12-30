import java.util.Objects;
import java.util.Scanner;
public class Chestionar {
        public static void main()
        {
            Scanner scanner= new Scanner(System.in);
            String r1,r2,r3,r4,r5;
            System.out.print("Urmeaza 5 intrebari si fiecare cu variante de raspuns." +
                    " Veti introduce litera corespunzatoare raspunsului corect  ");
            int nrRaspunsuriCorecte=0,nrRaspunsuriGresite=0;
            //1
            System.out.print("Cate stele compun carul mare?"+"\n");
            System.out.print("a.8"+"\n");
            System.out.print("b.7"+"\n");//corect
            System.out.print("c.9"+"\n");
            System.out.print("d.12"+"\n");
            System.out.print("Introduceti raspunsul: ");
            r1 = scanner.next();
            if ("b".equals(r1)) {
                nrRaspunsuriCorecte++;
                System.out.print("Raspuns corect! ");
            } else {
                nrRaspunsuriGresite++;
                System.out.print("Raspuns gresit! ");
            }
            //2
            System.out.print("Cate migdale sunt recomandate pentru consum pe zi?"+"\n");
            System.out.print("a.18"+"\n");
            System.out.print("b.7"+"\n");
            System.out.print("c.90"+"\n");
            System.out.print("d.10"+"\n");//corect
            System.out.print("Introduceti raspunsul: ");
            r2 = scanner.next();
            if ("d".equals(r2)) {
                nrRaspunsuriCorecte++;
                System.out.print("Raspuns corect! ");
            } else {
                nrRaspunsuriGresite++;
                System.out.print("Raspuns gresit! ");
            }
            //3
            System.out.print("Cate zile are un an bisect?"+"\n");
            System.out.print("a.366"+"\n");//corect
            System.out.print("b.365"+"\n");
            System.out.print("c.356"+"\n");
            System.out.print("d.354"+"\n");
            System.out.print("Introduceti raspunsul: ");
            r3 = scanner.next();
            if ("a".equals(r3)) {
                nrRaspunsuriCorecte++;
                System.out.print("Raspuns corect! ");
            } else {
                nrRaspunsuriGresite++;
                System.out.print("Raspuns gresit! ");
            }
            //4
            System.out.print("Cine zboară fără să zboare?"+"\n");
            System.out.print("a.Frunzele"+"\n");
            System.out.print("b.Pasagerii avionului."+"\n");//corect
            System.out.print("c.Barza"+"\n");
            System.out.print("d.Vulturul"+"\n");
            System.out.print("Introduceti raspunsul: ");
            r4= scanner.next();
            if ("b".equals(r4)) {
                nrRaspunsuriCorecte++;
                System.out.print("Raspuns corect! ");
            } else {
                nrRaspunsuriGresite++;
                System.out.print("Raspuns gresit! ");
            }
            //5
            System.out.print("Care cer n-are stele?"+"\n");
            System.out.print("a.Cerul ziua"+"\n");//corect
            System.out.print("b.Cerul noaptea"+"\n");
            System.out.print("c.Cerul copac"+"\n");//corect
            System.out.print("d.Cerul gurii"+"\n");//corect
            System.out.print("Introduceti raspunsul: ");
            r5= scanner.next();
            switch (r5) {
                case "a", "c", "d" -> {
                    nrRaspunsuriCorecte++;
                    System.out.print("Raspuns corect! ");
                }
                default -> {
                    nrRaspunsuriGresite++;
                    System.out.print("Raspuns gresit! ");
                }
            }
            System.out.print("Ati avut : "+nrRaspunsuriCorecte+" raspunsuri corecte!");
            System.out.print("Ati avut : "+nrRaspunsuriGresite+" raspunsuri gresite!");

        }

}

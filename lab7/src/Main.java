import java.util.Scanner;

public class Main {

    public static  void ex1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("n: ");
        int n=scanner.nextInt();
        int[] e =new int[n];
        for(int i=0; i<n; i++)
            e[i]=scanner.nextInt();
        int minim=e[0];

        for(int j=0; j<e.length; j++)
            if(minim>e[j])
                minim=e[j];
        System.out.println("minim "+minim);


    }
    public static void ex2(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] v =new int[n];
        for(int i=0;i<n;i++)
            v[i]=scanner.nextInt();
        int nul=0;
        for(int i=0;i<v.length;i++)
            if(v[i]==0)
                nul++;
        System.out.println("nul: "+nul);
    }
    public static void ex3(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] v=new int[n];
        for(int i=0;i<n;i++)
            v[i]=scanner.nextInt();
        int nrPozitive=0, nrNegative=0;
        for(int i=0;i<n;i++)
            if(v[i]<0)
                nrNegative++;
            else
                nrPozitive++;

        System.out.println("poz: "+nrPozitive+" neg:"+nrNegative);
    }
    public static void ex4(){
        int i;
        System.out.print("n: ");
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.print("m: ");
        int m;
        m=scanner.nextInt();
        int[][] a =new int[n][m];
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int x,k=0;
        System.out.print("x: ");
        x=scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                if(a[i][j]==x)k++;
            }
        }
        System.out.print("Numarul de aparitii este: "+k);
    }

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
    }
}
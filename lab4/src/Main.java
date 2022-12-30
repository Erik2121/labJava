public class Main {
    public static  boolean verifPerfect(int nr){
        int suma=0;
        for(int i=1;i<nr;i++)
            if(nr%i==0)
                suma+=i;
        return suma == nr;


    }
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++)
            if(verifPerfect(i))
                System.out.println(i);
        System.out.println("Urmeaza un chestionar..");
        Chestionar.main();
    }
}
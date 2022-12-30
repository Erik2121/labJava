public class Main {
    public static void main(String[] args) {
       Personaj jim=new Personaj();
       jim.setNume("Jim");
       jim.setInaltime((float) 1.80);
       jim.setGreutate((float) 63.4);
       jim.setCuloare("rosu");
       System.out.println(jim.getNume());
       System.out.println(jim.getInaltime());
       System.out.println(jim.getGreutate());
       System.out.println(jim.getCuloare());
    }
}
public class TestBottle {
    public static void main(String[] args) {
        Bottle b1,b2;
        b1 = new Bottle(3,0);
        b2 = new Bottle(5,0);
        System.out.println("------------ Start -----------");
        b1.showInfo();
        b2.showInfo();
        b2.filled();
        System.out.println(" ");


        System.out.println("------------ Fill b2 & Pur until b1 full -----------");
        b2.pourUntilFull(b1);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");


        System.out.println("------------ Pour all b1 out -----------");
        b1.pourAll();
        b1.showInfo();
        b2.showInfo();
    }
}

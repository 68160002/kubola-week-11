public class TestBottle {
    public static void main(String[] args) {
        Bottle b1,b2;
        b1 = new Bottle(3,0);
        b2 = new Bottle(5,0);
        System.out.println("------------ Start -----------");
        b1.showInfo();
        b2.showInfo();
        b1.filled();
        System.out.println(" ");


        System.out.println("---- After fill bottle b1 ----");
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");


        System.out.println("---- Fill bottle b2 with b1 ----");
        b1.pourAll(b2);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");


        System.out.println("---- Fill bottle b1 & Pour until b2 full ----");
        b1.filled();
        b1.pourUntilFull(b2);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");


        System.out.println("---- Pour all b2 out & Pour all b1 into b2 ----");
        b2.pourAll();
        b1.pourAll(b2);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");


        System.out.println("---- Fill b1 & Pour all b1 into b2 ----");
        b1.filled();
        b1.pourAll(b2);
        b1.showInfo();
        b2.showInfo();
        System.out.println(" ");
    }
}

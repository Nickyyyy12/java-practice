package se07.oop.animal;

public class InterfaceDemotest {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();

        Fish f = new Fish();
        f.swim();

        Duck d = new Duck();
        d.fly();
        d.swim();

        Airplane a = new Airplane();
        a.fly();

        System.out.println("--------");

        se07.oop.animal.Flyable[] flyers  = new se07.oop.animal.Flyable[3];
        flyers [0] = new Bird();
        flyers [1] = new Duck();
        flyers [2] = new Airplane();

        for (int i = 0; i< flyers.length;i++){
            flyers [i].fly();
        }
    }
}

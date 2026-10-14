package oop.pet;

public class PetTest {
    public static void main(String[] args) {
        Pet d1 = new Dog("边牧",5);
        Pet c1 = new Cat("暹罗",7);
        Pet p1 = new Parrot("鸟",3);
        Sparrow s1 = new Sparrow();

        d1.eat();
        d1.printinfo();
        c1.eat();
        c1.printinfo();
        p1.printinfo();
        p1.eat();


        Flyable[] flyable = new Flyable[3];
        flyable[0] = new Parrot("鸟",3);
        flyable[1] = new Sparrow();
        flyable[2] = new Parrot("狗",1);
        for (int i =0;i< flyable.length;i++){
            flyable[i].fly();
        }

        Pet[] pets = new Pet[3];
        pets[0] = new Parrot("鸟",3);
        pets[1] = new Dog("边牧",5);
        pets[2] = new Cat("暹罗",7);
        for (int i =0;i< pets.length;i++) {
            pets[i].eat();
            pets[i].printinfo();
        }


    }

}

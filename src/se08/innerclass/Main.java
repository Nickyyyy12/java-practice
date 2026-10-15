package se08.innerclass;

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("小李");
        Student S2 = new Student("小王");

        Student.Bag b1 = S1.new Bag();
        Student.Bag b2 = S2.new Bag();

        b1.showOwner();
        b2.showOwner();
    }

}

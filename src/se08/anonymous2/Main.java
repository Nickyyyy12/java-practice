package se08.anonymous2;

public class Main {
    static void sayHello(Greeter greeter, String name){
        System.out.println(greeter.greet(name));
    }

    public static void main(String[] args) {
        sayHello(new Greeter() {
            @Override
            public String greet(String name) {
                return "你好，"+name;
            }
        },"小李");

        sayHello(new Greeter() {
            @Override
            public String greet(String name) {
                return "Hello，"+name;
            }
        },"小李");
    }
}

package basics;

import java.util.Scanner;

public class task {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.close();


            if(a > b){
                System.out.println((a-b) +" " + (a/b) + " "+ (a%b));
            }else {
                System.out.println((b-a) +" " + (b/a) + " " +(b%a));
            }

        }
    }
}

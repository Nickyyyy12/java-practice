package se08.innerclass;

public class Library {
    private static String libraryName = "市图书馆";



    static class Book{
        String title;

        Book(String title){
            this.title = title;
        }

        void show(){
            System.out.println("《"+title+"》"+"属于"+libraryName);
        }
    }
}

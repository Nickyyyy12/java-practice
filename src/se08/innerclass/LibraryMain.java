package se08.innerclass;

public class LibraryMain {

    public static void main(String[] args) {

        Library.Book b1 = new Library.Book("Java基础");
        Library.Book b2 = new Library.Book("数据结构");

        b1.show();
        b2.show();
    }
}

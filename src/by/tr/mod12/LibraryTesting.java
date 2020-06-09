package by.tr.mod12;

public class LibraryTesting {
    public static void main(String[] args) {
        Book book1 = new Book( "Harper Lee", "To Kill a Mockingbird", 1960 );
        Book book2 = new Book( "George Orwell", "1984", 1984 );
        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        System.out.println(lib);
        System.out.println(lib.findByTitle("1984"));
        System.out.println(lib.findByTitle("1983"));
        lib.deleteBook(book1);
        System.out.println(lib);


    }
}

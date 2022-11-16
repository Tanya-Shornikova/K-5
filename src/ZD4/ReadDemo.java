package ZD4;

public class ReadDemo {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В.В.", 1, "ШМС", "21.10.2003", "+806711111");
        Reader[] readers = {reader};

        Book book = new Book("Задача трех тел", "Лю Цысинь");
        Book[] books = {book};

        printReaders(readers);
        printBooks(books);

        reader.takeBook(3);

        reader.returnBook(0);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

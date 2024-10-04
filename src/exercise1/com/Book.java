package exercise1.com;

public class Book {
    String name;
    String authorint;
    int pageCount;

    public static void main(String[] args) {
        Book book1 =new Book();
        book1.name="Cinayət və cəza";
        book1.authorint="Fyodor  Dostoyevski";
        book1.pageCount=300;


        Book book2 =new Book();
        book2.name="Qürur və qərəz";
        book2.authorint="Ceyn Ostin ";
        book2.pageCount=500;


        System.out.println("Book name: " +book1.name);
        System.out.println("authorint :"+book1.authorint);
        System.out.println("page count:"+book1.pageCount);

        System.out.println("Book name: " +book2.name);
        System.out.println("authorint :"+book2.authorint);
        System.out.println("page count:" +book2.pageCount);


    }
}

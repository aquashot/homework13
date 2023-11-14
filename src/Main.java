import Model.Author;
import Model.Book;
public class Main {
    public static void main(String[] args) {
        Author chehov=new Author ("Антон","Чехов");
        Book book=new Book ("Палата %6",chehov,1892);

        Author pushkin=new Author ("Александр","Пушкин");
        Book boid=new Book ("Капитанская дочка",pushkin,1836);
        book.setPublicYear(1986);
        System.out.println(chehov);
        System.out.println(book);
    }
}

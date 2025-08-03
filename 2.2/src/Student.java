import java.util.List;

public class Student {
    private String fio;
    private List<Book> books;

    public Student(String fio, List<Book> books){
        this.fio = fio;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return this.fio + ": " + this.books;
    }
}



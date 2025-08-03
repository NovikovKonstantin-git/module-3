public class Book {
    private String book_name;
    private int count_pages;
    private int year_publishing;

    public Book (String book_name, int count_pages, int year_publishing){
        this.book_name = book_name;
        this.count_pages = count_pages;
        this.year_publishing = year_publishing;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getCount_pages() {
        return count_pages;
    }

    public int getYear_publishing() {
        return year_publishing;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        boolean equally_book_name = this.book_name.equals(book.book_name);
        boolean equally_count_pages = this.count_pages == book.count_pages;
        boolean equally_year_publishibg = this.year_publishing == book.year_publishing;
        return equally_book_name && equally_count_pages && equally_year_publishibg;
    }

    @Override
    public int hashCode() {
        return 31 * book_name.hashCode() + 17 * count_pages + year_publishing;
        // 31 не переполняет int и не замедляет вычисления
        // 17 - начальное значение хэшкода
    }

    @Override
    public String toString() {
        return this.book_name + " - " + this.year_publishing + ", " + this.count_pages + " с.";
    }
}

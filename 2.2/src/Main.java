import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Новиков К.Н.", List.of(
                        new Book("Азбука", 30, 2000),
                        new Book("Преступление и наказание", 288, 1987),
                        new Book("Граф Монте-Кристо", 310, 2005),
                        new Book("След смерти", 467, 2018),
                        new Book("Капитанская дочка", 154, 2007)
                )),
                new Student("Васильев Л.А.", List.of(
                        new Book("Идиот", 123, 1998),
                        new Book("Братья Карамазовы", 481, 2006),
                        new Book("Таинственный остров", 421, 2007),
                        new Book("Мертвые души", 111, 1999),
                        new Book("Герой нашего времени", 521, 1976)
                )),
                new Student("Петручев П.Д.", List.of(
                        new Book("Вишневый сад", 976, 2013),
                        new Book("Отцы и дети", 532, 1991),
                        new Book("Гранатовый браслет", 841, 2005),
                        new Book("Горе от ума", 135, 2016),
                        new Book("Записки юного врача", 253, 2017)
                )),
                new Student("Шмип К.И.", List.of(
                        new Book("Дети капитана Гранта", 436, 2000),
                        new Book("Пиковая дама", 43, 1955),
                        new Book("Евгений Онегин", 89, 1968),
                        new Book("Алые паруса", 105, 2003),
                        new Book("Северная Ведьма", 97, 2002)
                )),
                new Student("Сергеенко В.В.", List.of(
                        new Book("Мартин Иден", 712, 2001),
                        new Book("Обломов", 599, 1989),
                        new Book("О любви", 652, 2013),
                        new Book("Бесы", 301, 2014),
                        new Book("Мы", 178, 2002)
                ))
        );

        // Нейронка помогла с адекватной передачей аргументов в методы
        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .peek(book -> {})
                .sorted(Comparator.comparingInt(Book::getCount_pages))
                .distinct()
                .filter(book -> book.getYear_publishing() > 2000)
                .limit(3)
                .map(Book::getYear_publishing)
                .findFirst()
                .ifPresentOrElse(year_book -> System.out.println("Год выпуска найденной книги: " + year_book),
                        () -> System.out.println("Книга отсутствует :( "));
    }
}
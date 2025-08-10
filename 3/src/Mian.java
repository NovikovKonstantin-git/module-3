import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) throws FileNotFoundCustom, IOExceptionCustom {
        String path = "D:\\Programming\\Java\\Aston Курс\\Дз\\3\\src\\file.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();

        //Запись
        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Данные записаны.");
        }
        catch (java.nio.file.NoSuchFileException e){
            throw new FileNotFoundCustom("Данные не записаны, ошибка в пути к файлу");
        }
        catch (IOException e) {
            throw new IOExceptionCustom("Ошибка записи");
        }

        //Чтение
        try {
            String textOfFile = Files.readString(Paths.get(path));
            System.out.println("Текст файла: " + textOfFile);
        }
        catch (java.nio.file.NoSuchFileException e){
            throw new FileNotFoundCustom("Данные не прочитаны, ошибка в пути к файлу");
        }
        catch (IOException e) {
            throw new IOExceptionCustom("Ошибка чтения");
        }
    }
}
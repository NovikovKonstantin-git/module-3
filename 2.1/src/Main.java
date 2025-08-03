import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnalogueArrayList<String> listik = new AnalogueArrayList<>();
        listik.add("Ананас");
        listik.add("Яблоко");
        listik.add("Груша");

        listik.addAll(List.of("Папайя", "Манго"));

        listik.remove(0);

        System.out.println("Был получен: " +  listik.get(1));
        System.out.print("Лист: ");

        for (int i = 0; i < listik.size(); i++) {
            System.out.print(listik.get(i) + ". ");
        }
    }
}

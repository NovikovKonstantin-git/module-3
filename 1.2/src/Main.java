import heirs.*;

/*
Абстрактные классы: Транспортные средства.
Классы-наследники: Самолёт, Вертолёт, Катер, Танкер, Грузовик, Такси.
Интерфейсы: Колёсные, Винтовые, Крылатые, Перевозчики.

*/

public class Main {
    public static void main(String[] args) {

        Taxi taxi = new Taxi("Такси Maxim", "Nissan", "Rogue", 5);
        System.out.printf("Название: " + taxi.getName() + ", Марка: " + taxi.getBrand() + ", Модель: " +
                taxi.getModel() + ", Количество мест: " + taxi.getPlaces() + ", данный транспорт имеет " +
                taxi.ride(4) + " колеса." + "\n");

        Airplane airplane = new Airplane("Боинг 737", "Airbus", "Boeing 737", 120);
        System.out.printf("Название: " + airplane.getName() + ", Количество мест: " + airplane.getPlaces() +
                airplane.transport(500.3, 15.2, 10.1) + ",  пилотов: " +
                airplane.fly(2) + ", макс. высота: " + airplane.up(7.5) + " км, " + " колёс: " +
                airplane.ride(14) + "." + "\n");

        Boat boat = new Boat("Ветер перемен", "Sea Ray", "Crownline 294 CR", 50);
        System.out.printf("Название: " + boat.getName() + ", винтов: " + boat.slew(2) +
                boat.transport(60.2, 8.3, 6.7) + ". " + "\n");

        Tanker tanker = new Tanker("Зороастр", "Daewoo", "MCASPHALT ADVANTAGE", 90);
        System.out.printf("Название: " + tanker.getName() + ", мест: " + tanker.getPlaces() + ", винтов: " + boat.slew(2) +
                boat.transport(160.2, 12.6, 8.9) + ". " + "\n");

        Helicopter helicopter = new Helicopter("Ми-шка", "Sikorsky", "Ми-24", 4);
        System.out.println("Название: " + helicopter.getName() + ", винтов: " + helicopter.slew(1) + ".");

        Truck truck = new Truck("Мусоровоз", "КОММАШ", "КО-440-6,", 2);
        System.out.printf("Название: " + truck.getName() + ", данный транспорт имеет " +
                truck.ride(6) + " колес." + "\n");
    }
}
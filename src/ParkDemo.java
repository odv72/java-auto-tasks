public class ParkDemo {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ РАБОТЫ ПАРКА И АТТРАКЦИОНОВ ===\n");

        Park park = new Park(
                "Центральный парк культуры и отдыха",
                "ул. Парковая, 1, г. Москва",
                "Ежедневно с 10:00 до 22:00"
        );

        park.displayParkInfo();

        System.out.println("\n=== АТТРАКЦИОНЫ ПАРКА ===\n");

        Park.Attraction attraction1 = park.new Attraction(
                "Колесо обозрения",
                "10:00 - 21:00",
                350.00,
                6
        );

        Park.Attraction attraction2 = park.new Attraction(
                "Американские горки",
                "11:00 - 20:00",
                500.00,
                12
        );

        Park.Attraction attraction3 = park.new Attraction(
                "Карусель",
                "10:00 - 22:00",
                200.00
        );

        System.out.println("Аттракцион №1:");
        attraction1.displayAttractionInfo();

        System.out.println("Аттракцион №2:");
        attraction2.displayAttractionInfo();

        System.out.println("Аттракцион №3:");
        attraction3.displayAttractionInfo();

        System.out.println("=== СВОДНАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Всего аттракционов: 3");
        System.out.println("Самый дорогой: " + attraction2.getAttractionName() +
                " (" + attraction2.getPrice() + " руб.)");
        System.out.println("Самый бюджетный: " + attraction3.getAttractionName() +
                " (" + attraction3.getPrice() + " руб.)");
    }
}
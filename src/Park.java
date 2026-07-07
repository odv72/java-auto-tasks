public class Park {
    private String parkName;
    private String address;
    private String workingHours;

    public Park(String parkName, String address, String workingHours) {
        this.parkName = parkName;
        this.address = address;
        this.workingHours = workingHours;
    }

    public void displayParkInfo() {
        System.out.println("========================================");
        System.out.println("ИНФОРМАЦИЯ О ПАРКЕ:");
        System.out.println("----------------------------------------");
        System.out.println("Название парка:      " + parkName);
        System.out.println("Адрес:               " + address);
        System.out.println("Часы работы:         " + workingHours);
        System.out.println("========================================");
    }

    public class Attraction {
        // Поля аттракциона
        private String attractionName;
        private String workingHours;
        private double price;
        private int ageRestriction;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
            this.ageRestriction = 0;
        }

        public Attraction(String attractionName, String workingHours, double price, int ageRestriction) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
            this.ageRestriction = ageRestriction;
        }

        public void displayAttractionInfo() {
            System.out.println("----------------------------------------");
            System.out.println("АТТРАКЦИОН:");
            System.out.println("  Название:           " + attractionName);
            System.out.println("  Время работы:       " + workingHours);
            System.out.println("  Стоимость билета:   " + price + " руб.");
            if (ageRestriction > 0) {
                System.out.println("  Возрастное ограничение: " + ageRestriction + "+");
            } else {
                System.out.println("  Возрастное ограничение: Без ограничений");
            }
            System.out.println("----------------------------------------");
        }

        public String getAttractionName() { return attractionName; }
        public String getWorkingHours() { return workingHours; }
        public double getPrice() { return price; }
        public int getAgeRestriction() { return ageRestriction; }
    }
}
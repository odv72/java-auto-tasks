public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isBooked;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void displayInfo() {
        System.out.println("========================================");
        System.out.println("ИНФОРМАЦИЯ О ТОВАРЕ:");
        System.out.println("----------------------------------------");
        System.out.println("Название:              " + name);
        System.out.println("Дата производства:     " + productionDate);
        System.out.println("Производитель:         " + manufacturer);
        System.out.println("Страна происхождения:  " + countryOfOrigin);
        System.out.println("Цена:                  " + price + " руб.");
        System.out.println("Статус бронирования:   " + (isBooked ? "ЗАБРОНИРОВАН" : "НЕ ЗАБРОНИРОВАН"));
        System.out.println("========================================");
    }

    public String getName() { return name; }
    public String getProductionDate() { return productionDate; }
    public String getManufacturer() { return manufacturer; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public double getPrice() { return price; }
    public boolean isBooked() { return isBooked; }
}
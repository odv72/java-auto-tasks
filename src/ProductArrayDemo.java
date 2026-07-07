public class ProductArrayDemo {
    public static void main(String[] args) {
            Product[] productsArray = new Product[5];

            System.out.println("=== СОЗДАНИЕ МАССИВА ИЗ 5 ТОВАРОВ ===\n");

            productsArray[0] = new Product(
                    "Samsung S25 Ultra",
                    "01.02.2025",
                    "Samsung Corp.",
                    "Korea",
                    5599.00,
                    true
            );

            productsArray[1] = new Product(
                    "iPhone 16 Pro Max",
                    "15.03.2025",
                    "Apple Inc.",
                    "USA",
                    7999.00,
                    false
            );

            productsArray[2] = new Product(
                    "Xiaomi 15 Pro",
                    "20.04.2025",
                    "Xiaomi Corp.",
                    "China",
                    4999.00,
                    true
            );

            productsArray[3] = new Product(
                    "Google Pixel 9 Pro",
                    "10.05.2025",
                    "Google LLC",
                    "USA",
                    6999.00,
                    false
            );

            productsArray[4] = new Product(
                    "OnePlus 13",
                    "01.06.2025",
                    "OnePlus Technology",
                    "China",
                    3999.00,
                    true
            );

            System.out.println("=== ИНФОРМАЦИЯ О ВСЕХ ТОВАРАХ ===\n");

            for (int i = 0; i < productsArray.length; i++) {
                System.out.println("Товар #" + (i + 1));
                productsArray[i].displayInfo();
                System.out.println();
            }

            System.out.println("=== СПИСОК ТОВАРОВ С ЦЕНАМИ ===");
            for (int i = 0; i < productsArray.length; i++) {
                System.out.println((i + 1) + ". " + productsArray[i].getName() +
                        " - " + productsArray[i].getPrice() + " руб." +
                        " - " + (productsArray[i].isBooked() ? "ЗАБРОНИРОВАН" : "В НАЛИЧИИ"));
            }
        }
    }

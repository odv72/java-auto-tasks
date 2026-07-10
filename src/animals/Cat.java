package animals;

public class Cat extends Animal {
    private boolean isFull;
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0); // кот бегает 200 м, не умеет плавать
        this.isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт");
        } else {
            System.out.println(name + " не стал есть, так как в миске недостаточно еды (нужно " + amount + ", есть " + bowl.getFood() + ")");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
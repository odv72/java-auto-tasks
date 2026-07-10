package animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10); // собака бегает 500 м, плавает 10 м
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
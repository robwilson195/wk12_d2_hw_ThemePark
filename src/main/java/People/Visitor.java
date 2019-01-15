package People;

public class Visitor {

    private final int age;
    private final int height;
    private double money;

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void gainMoney(double cash) {
        this.money += cash;
    }

    public void loseMoney(double cash) {
        this.money -= cash;
    }
}

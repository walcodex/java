public class Temp {
    int value;

    public Temp(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void func() {
        System.out.println("Function in Temp class");
    }

    public void func(int x) {
        System.out.println("Function in Temp class with parameter: " + x);
    }
}

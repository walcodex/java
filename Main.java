public class Main {
    public static void main(String[] args) {

        Temp temp = new Temp2(10);
        System.out.println("Value: " + temp.getValue());
        temp.func();
        temp.func(5);

    }
}
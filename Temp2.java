public class Temp2 extends Temp {

    public Temp2(int value) {
        super(value);
    }
    

    @Override
    public void func() {
        System.out.println("Function in Temp2 class");
    }

    @Override
    public void func(int x) {
        System.out.println("Function in Temp2 class with parameter: " + x);
    }
}

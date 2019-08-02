

public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car bmw = new Car();

        porsche.setModel(("911"), "cummins", "red", 2, 4);
        String model = porsche.getModel();

        System.out.println(model);
    }
}
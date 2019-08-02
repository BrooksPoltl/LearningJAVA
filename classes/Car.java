
public class Car{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model, String engine, String color, int doors, int wheels){
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }
    public String getModel(){
        return this.model;
    }
}
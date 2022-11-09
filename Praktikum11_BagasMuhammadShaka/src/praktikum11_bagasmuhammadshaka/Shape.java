package praktikum11_bagasmuhammadshaka;

public abstract class Shape {
    private String color;

    abstract float getArea();
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  
}

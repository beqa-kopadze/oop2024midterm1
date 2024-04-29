package midterm.beka_kopadze_2.task3;

// Shape.java
public abstract class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(x,y,width,height);
    }

    public int calcSquare() {
        return getWidth() * getHeight();
    }
}


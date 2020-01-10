public class Square extends Shape {

    public Square(int x, int y, int width, int height) {
        super(x, y,width,height);
    }

    public int calcSquare() {
        return getWidth() * getHeight();
    }

}

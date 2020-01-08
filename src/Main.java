public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int width = 10;
        int height = 2;
        Rectangle rectangle = new Rectangle (x, y, width, height);
        rectangle.out (x, y, width, height);

        x = 34;
        y = 56;
        width = 35;
        height = 1;
        Square square = new Square (x, y, width, height);
        square out (x, y, width, height);
    }

}
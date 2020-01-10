public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int width = 10;
        int height = 2;
        Rectangle rectangle = new Rectangle (x, y, width, height);
        rectangle.setX(34);
        rectangle.setY(56);
        rectangle.setWidth(35);
        rectangle.setHeight(1);
        System.out.println(rectangle);
        System.out.println(rectangle.calcSquare());

        Square square = new Square (x, y, width, height);
        System.out.println(square);
        System.out.println(square.calcSquare());
    }

}
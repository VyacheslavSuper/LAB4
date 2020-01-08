public class Rectangle extends Shape {

    private int width;
    private int height;


    private Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calcSquare ( ){
        return this.width * this.height;

    }
}


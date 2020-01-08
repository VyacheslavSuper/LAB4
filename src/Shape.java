class Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


   public void setCenter (int x, int y) {
       this.x = x;
       this.y = y;
   }

    public void out(){
        System.out.format("x=%d y=%d width=%d height=%d\n",
                            x, y, width, height);
    }

}


public class Rectangle {
    private int length;
    private int width;
    private static final int MAX_LENGTH;
    private static final int MAX_WIDTH;



    static {
        MAX_LENGTH = 20;
        MAX_WIDTH = 20;
    }

    public Rectangle(int length) {
        setLength(length);
    }
    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }
    public Rectangle(){
        this.width=10;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }



    public static Rectangle maxArea (Rectangle[] objects){
        Rectangle Max_Area = objects[0];
        for (int i =0; i< objects.length; i++){
            if(objects[i].Area()>Max_Area.Area()){
                Max_Area = objects[i];
            }
        }
        return Max_Area;
    }
    public void setWidth(int width) {
        if (width <= MAX_WIDTH) {
            this.width = width;
        } else {
            this.width = MAX_WIDTH;
        }
    }

    public void setLength(int length) {
        if (length <= MAX_LENGTH) {
            this.length = length;
        } else {
            this.length = MAX_LENGTH;
        }
    }
    public int Area(){
        return this.length *this.width;
    }
    public int Perimeter(){
        return 2*(this.length+this.width);
    }


}

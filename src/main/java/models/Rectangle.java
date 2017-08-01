package models;

/**
 * Created by Guest on 8/1/17.
 */
public class Rectangle {

    private int height;
    private int width;


    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth() {
        return width;
    }
    public boolean isSquare(){

        return height == width;
    }


}

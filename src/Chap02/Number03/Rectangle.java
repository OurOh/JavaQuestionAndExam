package Chap02.Number03;

public class Rectangle {

    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSqure(){
        return this.width == this.height;
    }


}

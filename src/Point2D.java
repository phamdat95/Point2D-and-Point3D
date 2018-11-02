import java.text.DecimalFormat;

public class Point2D {
    private float x;
    private float y;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    // Hàm tạo
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Setter
    void setX(float x){
        this.x = x;
    }
    void setY(float y){
        this.y = y;
    }
    void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Getter
    float getX(){return x;}
    float getY(){return y;}
    private float[] getXY(){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
       return arr;
    }
    // overriding toString
    public String toString(){
        return "Array of {" + decimalFormat.format(getXY()[0]) + ", " + decimalFormat.format(getXY()[1])
                +"}\n(" + decimalFormat.format(getX()) + ", " + decimalFormat.format(getY()) + ")";
    }
}

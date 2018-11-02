public class Point3D extends Point2D {
    private float z;
    // Hàm tạo
    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    // Setter
    void setZ(float z){
        this.z = z;
    }
    void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    // Getter
    private float getZ(){return z;}
    private float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }
    // Overriding tooString
    public String toString(){
        return "Array of {" + decimalFormat.format(getXYZ()[0]) + ", " + decimalFormat.format(getXYZ()[1]) + ", " + decimalFormat.format(getXYZ()[2])
                +"}\n(" + decimalFormat.format(getX()) + ", " + decimalFormat.format(getY())+ ", " + decimalFormat.format(getZ()) + ")";
    }
}

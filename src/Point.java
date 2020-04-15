public class Point {

    private float x;
    private float y;

    public Point(){}
    public  Point(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }

    public float[] getXY(){
        float arr[] = new float[2];
        arr[0] =getX();
        arr[1] =getY();
        return arr;
    }

    public String toString(){
        return " A point with x = "+getXY()[0]+" y = "+getXY()[1];
    }
}

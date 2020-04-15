public class MoveAblePoint extends Point {

    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint(float x, float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public MoveAblePoint(float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public MoveAblePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setXYsSpeed(float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public float[] getXYSpeed(){
        float arr[] = new float[2];
        arr[0] =getxSpeed();
        arr[1] =getySpeed();
        return arr;
    }

    public String toString(){
        return super.toString()+" and speed is "+getxSpeed()+" , "+getySpeed();
    }

    public void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}

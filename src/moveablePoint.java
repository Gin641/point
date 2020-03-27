public class moveablePoint extends point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public moveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public moveablePoint(float x, float y,float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    @Override
    public String toString(){
        return super.toString()
                + ", speed=("
                +getSpeed()[0] + ","
                +getSpeed()[1] + ")";
    }
    public moveablePoint move(){
        this.setX(getX()+ xSpeed);
        this.setY(getY()+ xSpeed);
        return this;
    }

    public static void main(String[] args) {
        moveablePoint moveablePoint = new moveablePoint(0,0,15,15);
        moveablePoint.move();
        moveablePoint.move();
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}

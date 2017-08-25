package PointAndMovablePoint;

/**
 * Created by RENT on 2017-08-25.
 */
public class MovablePoint {
    private float _xSpeed = 0.0f;
    private float _ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        _xSpeed = x;
        _ySpeed = y;
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public MovablePoint(){}

    public float getXSpeed(){
        return _xSpeed;
    }
    public void setXSpeed(float xSpeed){
        _xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return _ySpeed;
    }
    public void setYSpeed(float ySpeed){
        _ySpeed = ySpeed;
    }
    public void getSpeed(float xSpeed, float ySpeed){
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {_xSpeed, _ySpeed};
    }
    public String toString(){
        return String.format("%s,speed=(%f,%f)",super.toString(), _xSpeed,_ySpeed);
    }
    public MovablePoint move() {
        setXSpeed(getXSpeed()+ _xSpeed);
        setYSpeed(getYSpeed() + _ySpeed);
        return this;
    }
}

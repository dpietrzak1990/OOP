package AbstractShape;

/**
 * Created by RENT on 2017-08-22.
 */
public class Square extends Rectangle {

    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Aquare with side=")
                .append(getSide())
                .append(" which is a subclass od")
                .append(super.toString());

        return sb.toString();
    }
}

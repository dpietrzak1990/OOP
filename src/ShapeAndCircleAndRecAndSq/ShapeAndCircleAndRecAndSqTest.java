package ShapeAndCircleAndRecAndSq;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-23.
 */
public class ShapeAndCircleAndRecAndSqTest {
    @Test
    public void shapeDefaultGetColorIsFilledTest(){
        Shape shape = new Shape();
        Assert.assertEquals("red", shape.getColor());
        Assert.assertEquals(true, shape.isFilled());
    }
    @Test
    public void shapeDefaultSetColorSetFilledTest(){
        Shape shape = new Shape();
        shape.setColor("yellow");
        shape.setFilled(false);
        Assert.assertEquals("yellow", shape.getColor());
        Assert.assertEquals(false, shape.isFilled());
    }
    @Test
    public void shapeColorBlueFilledFalseGetColorIsFilledTest(){
        Shape shape = new Shape("blue", false);
        Assert.assertEquals("blue", shape.getColor());
        Assert.assertEquals(false, shape.isFilled());
    }
    @Test
    public void shapeColorBlueFilledFalseToStringTest(){
        Shape shape = new Shape("blue", false);
        Assert.assertEquals("A Shape with color of blue and not filled", shape.toString());
    }
    @Test
    public void circleDefaultGetRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleDefaultSetRadiusTest(){
        Circle circle = new Circle();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleDefaultAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }
    @Test
    public void circleDefaultToStingTest(){
        Circle circle = new Circle();
        Assert.assertEquals("A Circle with radius=1.0, which is a subclass of A Shape with color of red and filled", circle.toString());
    }
    @Test
    public void circleRadius2GetRadiusTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleRadius2SetRadiusTest(){
        Circle circle = new Circle(2.0);
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleRadius2GetAreaTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }

    @Test
    public void circleRadius2StingTest(){
        Circle circle = new Circle(2.0, "yellow", false);
        Assert.assertEquals("A Circle with radius=2.0, which is a subclass of A Shape with color of yellow and not filled", circle.toString());
    }
    @Test
    public void rectangleDefaultGetWidthGetLengthTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getLength(), 0.01);
        Assert.assertEquals(1.0, rectangle.getWidth(), 0.01);
    }
    @Test
    public void rectangleDefaultSetWidthSetLengthTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2.0);
        rectangle.setWidth(3.0);
        Assert.assertEquals(2.0, rectangle.getLength(), 0.01);
        Assert.assertEquals(3.0, rectangle.getWidth(), 0.01);
    }
    @Test
    public void rectangleDefaultGetAreaTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getArea(), 0.01);
    }
    @Test
    public void rectangleDefaultGetPerimeterTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(4.0, rectangle.getPerimeter(), 0.01);
    }
    @Test
    public void rectangleDefaultToStringTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals("A Rectangle with width=1.0 and length=1.0 which is a subclass of A Shape with color of red and filled",
                rectangle.toString());
    }
    @Test
    public void squareDefaultSetSideTest(){
        Square square = new Square();
        square.setSide(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }
    @Test
    public void squareDefaultSetLengthTest(){
        Square square = new Square();
        square.setLength(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }
    @Test
    public void squareDefaultSetWidthTest(){
        Square square = new Square();
        square.setWidth(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }
    @Test
    public void squareDefaultToStringTest(){
        Square square = new Square();
        Assert.assertEquals("A Square with side=1.0 which is a subclass of A Rectangle with width=1.0 and length=1.0 which is a subclass of A Shape with color of red and filled",
                square.toString());
    }
}

package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class CircleAndCylinderTest {
    @Test
    public void circleDefaultGetRadius(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultSetRadius(){
        Circle circle = new Circle();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleDefaultGetColor(){
        Circle circle = new Circle();
        Assert.assertEquals("red", circle.getColor());
    }

    @Test
    public void circleDefaultSetColor(){
        Circle circle = new Circle();
        circle.setColor("yellow");
        Assert.assertEquals("yellow", circle.getColor());
    }

    @Test
    public void circleDefaultArea(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }
    @Test
    public void circleRadiusSting(){
        Circle circle = new Circle();
        Assert.assertEquals("Circle[radius=1,000000,color=red]", circle.toString());
    }
    @Test
    public void cylinderDefaultGetHeight(){
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(),0.1);
    }
    @Test
    public void cylinderDefaultSetHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(1.0);
        Assert.assertEquals(1.0, cylinder.getHeight(),0.1);
    }
    @Test
    public  void cylinderDefaultGetVolume() {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(3.14, cylinder.getVolume(),0.1 );
    }
}


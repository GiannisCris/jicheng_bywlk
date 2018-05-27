package wlk;
public class CircleFromSimpleGeomertricObject extends SimpleGeometricObject{
private double  radius;
public CircleFromSimpleGeomertricObject() {
}
public CircleFromSimpleGeomertricObject(double radius) {
	this.radius=radius;
}
public CircleFromSimpleGeomertricObject(double radius,String color,boolean filled) {
this.radius=radius;
setColor(color);
setFilled(filled);
}
public void setRadius(double radius) {
	this.radius=radius;
}
public double getRadius() {
	return radius;
}
public double getArea() {
	return radius*radius*Math.PI;
}
public double getPerimeter(){
	return 2*radius*Math.PI;
}
public String toString() {
	return "crated on"+getDate()+" color:"+getColor()+" filled:"+getFilled()+" radius:"+radius+" Area:"+getArea()+" Perimeter"+getPerimeter();

}
}

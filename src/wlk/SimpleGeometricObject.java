package wlk;
public class SimpleGeometricObject {
private String color="white";
private boolean filled;
private java.util.Date date;
public SimpleGeometricObject(){
	date=new java.util.Date();
}
public SimpleGeometricObject(String color,boolean filled) {
	date=new java.util.Date();
	this.color=color;
	this.filled=filled;
}
public void setColor(String color) {
	this.color=color;
}
public String getColor() {
	return color;
}
public void setFilled(boolean filled) {
	this.filled=filled;
}
public boolean getFilled() {
	return filled;
}
public java.util.Date getDate(){
	return date;
}
public String toString() {
	return "crated on"+date+" color:"+color+" filled:"+filled;
}

}

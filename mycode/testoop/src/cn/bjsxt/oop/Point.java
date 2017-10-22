package cn.bjsxt.oop;

public class Point {
	double x,y,z;
	
	//通过构造方法初始化对象的属性
	public Point(double _x,double _y,double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(double _x) {
		x = _x;
	}
	public void setY(double _y) {
		y = _y;
	}
	public void setZ(double _z) {
		z = _z;
	}
	
	public double distance(Point p) {
		double result = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
		return result;
	}
	
	public static void main(String[] args) {
		Point p = new Point(3,4,8);
		Point p2 = new Point(10,25,40);
		p.setX(10);
		System.out.println(p.x);
		System.out.println(p.distance(p2));
	}
}

package ajn.zhihu.zhuanlan.chapter10;

public class Point {
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(Point p){
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}

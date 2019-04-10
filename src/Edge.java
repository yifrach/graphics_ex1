
public class Edge {
	private Point p1;
	private Point p2;
	
	public Edge(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point getP1() {
		return this.p1;
	}
	
	public Point getP2() {
		return this.p2;
	}
	
	public void setP1(Point p) {
		this.p1 = p;
	}
	
	public void setP2(Point p) {
		this.p2 = p;
	}
	
	public double distance() {
		double x_dis = Math.pow(this.p1.getX() - this.p2.getX(), 2);
		double y_dis = Math.pow(this.p1.getY() - this.p2.getY(), 2);
		double z_dis = Math.pow(this.p1.getZ() - this.p2.getZ(), 2);
		return Math.sqrt(x_dis + y_dis + z_dis);
	}
	
	public String toString() {
		return "(" + this.p1.toString() + ", " + this.p2.toString() + ")";
	}
}

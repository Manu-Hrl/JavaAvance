package fr.dauphine.javaavance.td1;

public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public Point(Point p2) {
		this(p2.getX(), p2.getY());
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static void exo2Question1() {
		Point p=new Point();
		System.out.println(p.x+" "+p.y);
	}
	
	public boolean isSameAs(Point p) {
		return ((this.x == p.x) && (this.y == p.y));
	}
	
	public Point translate(int dx, int dy) { // Écrite de manière non mutable (exercice 5)
		return new Point((x + dx), (y + dy));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if (!(obj instanceof Point)) return false;
		
		Point p = (Point) obj;
		return (x == p.x) && (y == p.y);
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}

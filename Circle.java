package fr.dauphine.javaavance.td1;

import java.util.List;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public void translate(int dx,int dy) {
		center = center.translate(dx, dy);
	}
	
	public Point getCenter() {
		return center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double area() {
		return  Math.PI * Math.pow(radius, 2);
	}
	
	public boolean contains(Point p) {
		return Math.sqrt(Math.pow(p.getX() - center.getX(), 2) + Math.pow(p.getY() - center.getY(), 2)) <= radius;
	}
	
	public boolean contains(Point p, List <Circle> circles) {
		for (Circle circle : circles) {
			if (circle.contains(p)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "centre : " + center + " | rayon : " + radius;
	}
}

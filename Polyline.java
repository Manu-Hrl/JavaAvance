package fr.dauphine.javaavance.td1;

import java.util.LinkedList;
import java.util.Objects;

public class Polyline {
	private final int MAX_POINTS;
	public LinkedList <Point> points;
	
	//public Point [] points;
	
	public Polyline(int MAX_POINTS) {
		// TODO Auto-generated constructor stub
		this.MAX_POINTS = MAX_POINTS;
		points = new LinkedList <Point> ();
		
		/*
		points = new Point [MAX_POINTS];
		
		for (int i = 0; i < points.length; i++) { //initialisation du tableau à null
			points[i] = null;
		}
		*/
	}
	
	public void add(Point p) { 
		Objects.requireNonNull(p, "This point must not be null");
		points.add(p);
	}
	
	public int nbPoints() { 
		return points.size();
	}
	
	public int pointCapacity() { 
		return points.size();
	}
	
	public boolean contains(Point p) { 
		return points.contains(p);
	}
	/* AVEC TABLEAU DE POINTS
	
	public void add(Point p) {
		for (int i = 0; i < points.length; i++) {
			if (points[i] == null) {
				points[i] = p;
				return;
			}
		}
	}
	
	public int nbPoints() {
		int count = 0;
		
		for (Point point : points) {
			if (point != null) {
				count++;
			}
		}
		
		return count;
	}
	
	public int pointCapacity() {
		return points.length;
	}
	
	public boolean contains(Point p) {
		for (Point point : points) {
			if (point.equals(p)) return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		StringBuffer sb = new StringBuffer(s);
		
		for (Point point : points) {
			sb.append(point + " ");
		}
		
		return sb.toString();
	}
	*/
}

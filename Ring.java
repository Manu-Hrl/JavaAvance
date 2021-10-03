package fr.dauphine.javaavance.td1;

import java.util.List;

public class Ring extends Circle {
	private int smallest_radius;
	
	public Ring(Point p, int biggest_radius, int smallest_radius) {
		super(p, biggest_radius);
		this.smallest_radius = smallest_radius;
	}
	
	
	
	@Override
	public boolean contains(Point p) {
		if (super.contains(p)) {
			return true;
		}
		
		return Math.sqrt(Math.pow(p.getX() - this.getCenter().getX(), 2) + Math.pow(p.getY() - this.getCenter().getY(), 2)) <= smallest_radius;
	}



	
	public boolean contain(Point p, List<Ring> rings) {
		for (Ring ring : rings) {
			if (ring.contains(p)) {
				return true;
			}
		}
		
		return false;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Ring)) return false;
		
		Ring r = (Ring) obj;
		return (this.getCenter() == r.getCenter()) && (this.getRadius() == r.getRadius()) && (this.smallest_radius == r.smallest_radius);
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "centre : " + this.getCenter() + " | anneau externe : " + this.getRadius() + " | anneau interne : " + smallest_radius;
	}
}

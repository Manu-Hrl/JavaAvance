package fr.dauphine.javaavance.td1;

public class TestPolyline {
	
	public static void main(String[] args) {
		Polyline poly = new Polyline(5);
		Point p1=new Point(1,2);
		Point p2=new Point(3,2);
		
		//poly.add(null);
		poly.add(p1);
		poly.add(p2);;
		System.out.println(poly.contains(new Point(3,2)));
	}
}

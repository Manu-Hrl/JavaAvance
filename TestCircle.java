package fr.dauphine.javaavance.td1;

public class TestCircle {
	public static void main(String[] args) {
		// Exo 5 question 5
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		
		c2.translate(1,1);
		System.out.println(c+" "+c2);
		
		
		/* Exo 5 question 6
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		
		System.out.println(c);*/
	}
}

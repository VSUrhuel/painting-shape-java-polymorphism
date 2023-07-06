import java.util.*;
public class PaintThings
{
	public static void main(String[] args) 
	{
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);

		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;

		double deckAmt, ballAmt, tankAmt;

		deck = new Rectangle(20, 35);
		bigBall = new Sphere(15);
		tank = new Cylinder(10, 30);

		deckAmt = paint.amountOfPaint(deck);
		ballAmt = paint.amountOfPaint(bigBall);
		tankAmt = paint.amountOfPaint(tank);

		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck " +deckAmt);
		System.out.println("Big Ball " +ballAmt);
		System.out.println("Tank " +tankAmt);

	}
}
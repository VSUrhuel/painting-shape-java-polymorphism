public class Rectangle extends Shape
{
	private double length;
	private double width;

	public Rectangle(double length, double width)
	{
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return this.length*this.width;
	}
	@Override
	public String toString()
	{
		return super.toString() + " of length " + this.length+ " and width " +this.width;
	}
}
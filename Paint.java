public class Paint
{
	protected double coverage;
	public Paint(double coverage)
	{
		this.coverage = coverage;
	}
	public double amountOfPaint(Shape shape)
	{
		return shape.area()/this.coverage;
	}
}

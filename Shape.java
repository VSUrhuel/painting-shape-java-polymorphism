public abstract class Shape
{
	protected String shapeName;
	
	public Shape(String name)
	{
		this.shapeName = name;
	}
	public abstract double area();
	@Override
	public String toString()
	{
		return "Shape Name: " +this.shapeName+ "\n";
	}
}
package patrat;

public class Patrat {
	
	private double latura;

	public Patrat(double latura) {
		super();
		this.latura = latura;
	}
	public Patrat() {
		
		this.latura = 10;
	}
	
	/*public void  Aria(double latura)
	{
		double a = latura*latura;
		
	}*/
	@Override
	public String toString() {
		return "Patrat " + latura + " Aria "+ latura*latura;
	}
	

}

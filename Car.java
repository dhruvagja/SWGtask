import java.util.*; 
public class Car 
{
		int speed;
		String colour;
	    double regularPrice;
		Car(int speed, String colour, double regularPrice)
		{
			this.speed=speed;
			this.colour=colour;
			this.regularPrice=regularPrice;
		}
		double getSalePrice()
		{
			return regularPrice;
		}
	
}
class Truck extends Car {
	int weight;
	Truck(int sp, String col, double rp, int w)
	{
		super(sp, col, rp);
		weight=w;
	}
	double getSalePrice()
	{
		if(weight>2300)
		{
			super.regularPrice=0.9*super.regularPrice;
		}
		else
		{
			super.regularPrice=0.8*super.regularPrice;
		}
		return super.getSalePrice();
	}
}

class outcome extends Car {
	outcome(int sp, String col, double rp){
		super(sp, col, rp);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter speed, color, price and weight");
		int sp = in.nextInt();
		in.nextLine();
		String col = in.nextLine();	
		double rp  = in.nextDouble();
		int w = in.nextInt();
		
		Truck t = new Truck(sp, col, rp, w);
		System.out.println(t.getSalePrice());
	}
}
    

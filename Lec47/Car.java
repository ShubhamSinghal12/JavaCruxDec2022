package Lec47;

public class Car implements Comparable<Car>{

	int speed;
	int price;
	String color;
	
	public Car(int s,int p,String color)
	{
		this.speed = s;
		this.price = p;
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "Speed: "+this.speed+" Price: "+this.price+" Color: "+this.color;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.color.compareTo(o.color);
	}
}

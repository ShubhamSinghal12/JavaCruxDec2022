package Lec47;

import java.util.Comparator;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr = {1,2,3,4,5,4,2,5,7,1,3,6};
//		bubbleSort(arr);
//		display(arr);
//		String[] brr = {"abc","def","ghi"};
//		display(brr);
		
		Car[] cars = new Car[5];
		cars[0] = new Car(70,500,"Black");
		cars[1] = new Car(120,8000,"Red");
		cars[2] = new Car(80,3000,"White");
		cars[3] = new Car(50,2000,"Blue");
		cars[4] = new Car(170,15000,"Yellow");
//		bubbleSort(new CarPriceComparator(),cars);
		bubbleSort(new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.color.compareTo(o2.color);
			}
		}, cars);
		display(cars);
		
	}
	public static <T> void display(T[] arr)
	{
//		for(int i = 0;i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		for(T i:arr)
		{
			System.out.println(i);
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		for(int i = 0; i < arr.length-1;i++)
		{
			for(int j = 0; j < arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0) 
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	
	public static <T> void bubbleSort(Comparator<T> comp,T[] arr)
	{
		for(int i = 0; i < arr.length-1;i++)
		{
			for(int j = 0; j < arr.length-i-1;j++)
			{
				if(comp.compare(arr[j],arr[j+1]) > 0) 
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	

}

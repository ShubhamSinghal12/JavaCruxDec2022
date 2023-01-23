package Lec19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(100);
		for(int i = 1; i<= 10; i++)
			arr.add(i);
		
		arr.add(0);
		arr.add(0, 100);
		System.out.println(arr);
		arr.remove(arr.size()-1);
		arr.set(0, 1000);
		arr.set(2, 1000);
		System.out.println(arr.indexOf(100));
//		Collections.sort(arr);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(2)==1000);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		
	}

}

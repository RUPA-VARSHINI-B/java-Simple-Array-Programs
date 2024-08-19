package Array;
import java .util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size= sca.nextInt();
		int [] arr= new int[size];
		System.out.println("enter the elements of array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sca.nextInt();
		}
		int count=0;
		System.out.println("the even numbers of array: ");
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
			count++;
		}
		}
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println("the odd numbers of array: ");
			System.out.println(arr[i]);
			
		}
		}
		System.out.println("the total no of arrays"+count);

	}

}

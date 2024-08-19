package Array;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the array size:");
		int size= sca.nextInt();
		int arr[]= new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sca.nextInt();
			
		}
		System.out.println(" the 2 digit array elements:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9&&arr[i]<100) {
				System.out.println(arr[i]);
			}
			
		}
		
	}

}

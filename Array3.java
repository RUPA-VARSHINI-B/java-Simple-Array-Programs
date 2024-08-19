package Array;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size= sca.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sca.nextInt();
			
		}
		System.out.println("the array elements at even index:");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}

	}

}

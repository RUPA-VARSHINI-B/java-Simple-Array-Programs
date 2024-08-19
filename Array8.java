package Array;
import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the size array of elements");
		int size= sca.nextInt();
		int[] arr = new int[size];
		System.out.println("enter an array of elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sca.nextInt();
		}
		System.out.println("the array elements are:");
        for(int i =0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        	
        }
        int max=arr[0],min=arr[0];
        for(int i =0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        System.out.println("the min and max of  array elements are:"+max+min);

	}

}

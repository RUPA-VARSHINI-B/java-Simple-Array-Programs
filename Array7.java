package Array;
import java.util. *;
public class Array7 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size= sca.nextInt();
		int [] arr= new int[size];
		System.out.println("enter the elements of array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sca.nextInt();
		}
		System.out.println("the sum of even numbers of array: ");
		int sum =0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			sum+=arr[i];
			
		}
		}
		System.out.println(sum);

		System.out.println("the product of numbers of array: ");
		int prod =1;
		for(int i=0;i<arr.length;i++) {
		
			prod*=arr[i];
			
		
		}
		System.out.println(prod);
	}

}


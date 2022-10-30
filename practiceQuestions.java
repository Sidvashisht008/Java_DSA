package java8;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("abcba"));
		System.out.println(checkPalindrome("abcdea"));
		numberConversion("101",2,10);
		numberConversion("5",10,2);
		decimalToBinary(5);
		swap(new int[] {1,2,3},0,2);
		System.out.println();
		reverse(new int[] {1,2,3,4,5,6});
		binarySearch(new int[] {1,2,3,4,5,6},3);
		linearSearch(new int[] {1,2,3,4,5,6},6);
		bubbleSort(new int[] {9,1,4,3,28,7,5,6,8});
		lowerBound(new int[] {10 ,20, 30 ,30,40 ,50},30);
	}
	
	public static boolean checkPalindrome(String str) {
		int lo = 0;
		int hi = str.length()-1;
		while(lo<hi) {
			if(str.charAt(lo)!=str.charAt(hi)) {
				return false;
			}
			lo++;
			hi--;
		}
		return true;
	}
	
	public static void numberConversion(String b,int from,int to) {
//		System.out.println(b);
		int a = Integer.parseInt(b);
		int sum = 0;
		int mul = 1;
		while(a>0) {
			int rem = a%to;
			sum += rem*mul;
			mul*=from;
			a/=to;
		}
		System.out.println(sum);
	}
	
	public static void decimalToBinary(int a) {
		int sum = 0;
		int mul = 1;
		while(a>0) {
			int rem = a%2;
			sum += rem*mul;
			mul*=10;
			a/=2;
		}
		System.out.println(sum);
	}
	
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		for(int val: arr) {
			System.out.print(val +" ");
		}
	}
	
	public static void reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
	
	public static void linearSearch(int[] arr,int item) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == item) {
				System.out.println("Element found at index - "+i);
				return;
			}
		}
		System.out.println("Item not found");
	}
	
	public static void binarySearch(int[] arr,int item) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = lo +(hi-lo)/2;
			if(arr[mid] == item) {
				System.out.println("found at index - " +mid);
				return;
			}else if(arr[mid]>item) {
				hi = mid-1;
			}else {
				lo=mid+1;
			}
		}
		System.out.println("Item not found");
	}
	
	public static void bubbleSort(int[] arr) {
		for(int counter = 0;counter<arr.length-1;counter++) {
			for(int j = 0;j<arr.length-counter-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
	
	public static void lowerBound(int[] arr,int item) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>=item) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}

package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int max=0;
		int maxone=0;
		int maxtwo=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>max) {
					max=arr[i]*arr[j];
					maxone=arr[i];
					maxtwo=arr[j];
				}
			}
		}
		System.out.println("["+maxone+","+maxtwo+"]");
	}
}

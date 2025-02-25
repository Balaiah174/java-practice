public class Bubblesort {
	public static void bubblesort(int [ ] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	
		}
}

	public static void main(String[] args) {
		System.out.println("before sorting");
	int []arr= {5,6,3,4,8,2};
	for(int i:arr) {
		System.out.println(i);
	}
	bubblesort(arr);
	System.out.println("after sorting");
	for(int i: arr) {
		System.out.println(i);
	}
	

	}

}

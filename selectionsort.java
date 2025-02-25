public class selectionsort {
	public static void selectionsort(int[] a) {
int n=a.length;
for(int i=0;i<n-1;i++) {
	int minIndex=i;
	for(int j=i+1;j<n;j++) {
		if(a[j]<a[minIndex]) {
		minIndex=j;
		
	}
		}
	int temp=a[i];
	a[i]=a[minIndex];
	a[minIndex]=temp;
}
	}
public static void main(String[] args) {
	System.out.println("before sorting");
int []arr= {4,1,5,2,3};
for(int i:arr) {
	System.out.println(i);
}
selectionsort(arr);
System.out.println("after sorting");
for(int i: arr) {
	System.out.println(i);
}


}

	}

package DS2;

public class Rev {
	public static void main(String args[]) {
		int[] a= {9,8,7,6,5,4,3,2,1};
		for(int i=a.length-1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
}
}

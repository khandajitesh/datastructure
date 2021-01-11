package datastructure;

public class ArrayRotation {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		ArrayRotation.rotate(a,2,7);
	}
	public static int[] rotate(int ar[],int d,int n) {
		int temp[] = new int[d];
		for(int i=0;i<n;i++) {
			if(i<d) {
				temp[i]=ar[i];
			}else {
				ar[i-d]=ar[i];
			}		
		}
		int count=0;
		for(int i=n-d;i<n;i++) {		
			ar[i] = temp[count];
			count++;
		}
		for(int i=0;i< ar.length;i++) {
			System.out.println(ar[i]);
		}
		return null;
	}

}

package datastructure;

public class CyclicallyRotate {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		int[] a = rotate(ar, 6);
		for (int v : a) {
			System.out.println(v);
		}

	}

	public static int[] rotate(int arr[], int n) {
		int arr1[] = new int[arr.length - 1];
		int tmp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];

		}
		arr[0] = tmp;
		n--;
		if (n > 0)
			arr1 = rotate(arr, n);
		else
			arr1 = arr;

		return arr1;
	}
}

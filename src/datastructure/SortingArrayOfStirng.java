package datastructure;

public class SortingArrayOfStirng {
	public static void main(String[] args) {
		String stringArray[] = { "Nani", "Pema", "Aroma", "Zani", "Waxi", "SUA" };
		String str[] = stringSorting(stringArray);
		for (String ss : str) {
			System.out.println(ss);
		}

	}

	public static String[] stringSorting(String[] ar) {
		String sortingArray[] = new String[ar.length];
		int  count=0;
		// Array sorted according as string length
		ar = arSortLengthWise(ar);

		for (int i = 0, k = 1; i < sortingArray.length && k < sortingArray.length - 1; i++, k++) {
			String s1 = ar[i];
			String s2 = ar[k + 1];
			for (int j = 0; j < s1.length(); j++) {
				if (s2.charAt(j) > s1.charAt(j)) {
					ar[i] = s2;
					ar[i + 1] = s1;

				}
			}

		}
		for(int i = 0;i<ar.length-1;i++) {
			for (int j = 0; j < ar.length; j++) {
				if(ar[i].equals(ar[j])) {
					String temp = ar[i+1];
					ar[i+1] = ar[j];
					ar[j] = temp;
				}
				
			}
			
		}
		
		if(count == 1) {
			ar = stringSorting(ar);
		}
	
		return ar;
	}

	// Sort string array lengthwise
	public static String[] arSortLengthWise(String ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i].length() > ar[j].length()) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		/*
		 * for (int i = 0; i < ar.length; i++) { for (int j = i+1; j < ar.length; j++) {
		 * if(ar[i].equals(ar[j])) { String temp = ar[j]; for(int k=j;k>i+1;k--) {
		 * ar[k+1] = ar[k];
		 * 
		 * } ar[i] =temp;
		 * 
		 * } } }
		 */
		
		return ar;
	}

}

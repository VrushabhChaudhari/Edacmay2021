package Challenge;

public class RemoveSubarray {
	static int j = 0;

	static int prob(int arr1[], int n) {
		int arr[];
		arr = arr1;
		int arr2[] = new int[20];
		for (int i = 0; i < n - 1; i++)
			if (arr1[i] <= arr1[i + 1]) {
				arr2[j] = arr1[i];
				j++;
			}

		if (arr.length == n) {
			arr2[j] = arr[n - 1];
			j++;
		}
		return n - j;
	}

	public static void main(String args[]) {
		int arr1[] = { 5, 4, 3, 2, 1 };
		int n = arr1.length;
		System.out.println("Output: "+prob(arr1, n));
	}
}
/*
 * arr1[0]<=arr1[1]&&arr2[0]<=arr1[1] 1 <= 2 && 1 <= 2 1
 * arr1[1]<=arr1[2]&&arr2[1]<=arr1[2] 2 <= 3 && 2 <= 3 2
 * arr1[2]<=arr1[3]&&arr2[2]<=arr1[3] 3 <= 10 && 3 <= 10 3
 * arr1[3]<=arr1[4]&&arr2[3]<=arr1[4] 10 <= 4 && 3 <= 4
 * 
 * arr1[4]<=arr1[5]&&arr2[2]<=arr1[5] 4 <= 2 && 3 <= 2
 * 
 * arr1[5]<=arr1[6]&&arr2[2]<=arr1[6] 2 <= 3 && 3 <= 3 3
 * 
 * 1---j=0 2---j=1 3---j=2
 *
 **/


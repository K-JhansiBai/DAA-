import java.util.Scanner;
class GFG {
	int binarySearch(int arr[], int x)
	{

		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == x)
				return m;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		GFG ob = new GFG();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
        System.out.println("Enter the element to be searched:");
		int x = sc.nextInt();
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "
							+ result);
	}
}

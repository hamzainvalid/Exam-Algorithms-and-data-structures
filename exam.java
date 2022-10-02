import java.util.Arrays;
public class Main {
	static void gnomeSort(int arr[], int n)
	{
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index] >= arr[index - 1])
				index++;
			else {
				int temp = 0;
				temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		return;
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 7, 8, 9, 0, -1, -22, 0, 2, 30, 107, 23, 43, 108, -20 };

		gnomeSort(arr, arr.length);

		System.out.print("Sorted sequence after applying Gnome sort: ");
		System.out.println(Arrays.toString(arr));
	}
}

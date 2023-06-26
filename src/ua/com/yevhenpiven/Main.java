package ua.com.yevhenpiven;

public class Main {

	public static void main(String[] args) {
		// method sorted array from small to large
		for (int i : buble_sort(new int[] { 12, -45, 0, 145, -85, -12, 14, -2859 }))
			System.out.println(i);

	}

	public static int[] buble_sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int a = 0;
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
				}
			}
		}
		return arr;
	}
}

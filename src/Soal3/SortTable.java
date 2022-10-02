package Soal3;

abstract class SortTable{
	public abstract int compare(SortTable b);
	public static void shell_sort(SortTable[] arr) {
		int n = arr.length;
		Employee[] arrE = (Employee[]) arr;

		for(int gap = n/2; gap > 0; gap /= 2) {
			for(int i = gap; i < n; i += 1) {
				Employee temp = arrE[i];
				int j;
				for(j = i; j >= gap && arrE[j - gap].salary() < temp.salary(); j -= gap)
					arr[j] = arr[j - gap];
				arr[j] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			arrE[i].print();
		}
	}
}

package Sorting_algorithms;

public class Quick_sort {

	public static void main(String[] args) {
		
		int nums[]= {234,7,3,753,2,5686,3,34,76,34,35,1};
		
		quickSort (nums, 0, nums.length-1 );
		
		for (int rowan :nums) {
			System.out.print(" "+rowan);
		}

	}

	private static void quickSort (int[] nums, int low, int high) {
		
		
		if (low<high) {
			
			int pi = partion(nums,low,high);
			
			quickSort(nums,low,pi-1);
			quickSort(nums,pi+1,high);

			
		}
		
				
	}

	private static int partion(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low-1;
		for (int j =low; j <high;j++) {
//													int nums[]= {6,7,683,753,2,5686,3,34,76,34,35,8};
			if (pivot>nums[j]) {
				i++;
				int temp = nums[j];
				nums[j]= nums[i];
				nums[i]=temp;
				
			}
			
		}
		int temp = nums[i+1];
		nums[i+1]=nums[high];
		nums[high]=temp;
		
		
//		returning the new pivot position  
		return i+1; 
	}

}

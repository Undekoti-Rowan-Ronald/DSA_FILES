package Sorting_algorithms;

public class Bubble_sort {

	
	
	public static void main(String arr[]) {
		
		int nums[]= {9,4,5,2,1,6,7};
		int temp;
		for(int j=0;j<nums.length-1;j++) {
			
			for(int i=0;i<nums.length-1;i++) {
				
				if (nums[i]>nums[i+1]) {
				temp = nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
				}
				
			}
			
	
		}
		for (int print_nums : nums) {
			System.out.println(print_nums);
					}
		
		
	}
	
	
	
}

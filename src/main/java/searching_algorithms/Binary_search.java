package searching_algorithms;

public class Binary_search {
	
	public int bs(int [] nums, int target) {
//		nums[]= {1,2,3,4,5,6,7,8,9};
//	    target=7;
		
		int left =0;
		int right = nums.length-1;
		
		while (left<=right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) {
				return 1;
			}
			else if  (nums[mid]>target){
				right =mid -1 ;
				
			}
			else if (nums[mid]<target) {
				left = mid+1;
			}
			
			
		}
		return -1;
	}
	
	

}

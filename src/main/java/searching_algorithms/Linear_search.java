package searching_algorithms;

public class Linear_search {
	
public int Lsearch (int [] nums, int target) {
	
	for (int i=0;i<=nums.length-1;i++) {
		
		if(nums[i]==target) {
			return 1;
		}
	}
	
	return -1;
}

}

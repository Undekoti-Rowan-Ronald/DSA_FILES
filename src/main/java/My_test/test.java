package My_test;

public class test {

	public static void main(String[] args) {
		int nums[]= {3,68,7,89,5,2};
		for (int i=1; i<nums.length;i++) {
			int j=i-1;
			int key =nums[i];
			while (j>=0 &&nums[j]>key) {
				nums[j+1]=nums[j];
				j--;
				
			}
			nums[j+1]=key;
		}
for (int rowan :nums) {
	System.out.print(" "+rowan );
}
	}

}

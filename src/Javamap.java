import java.util.ArrayList;
import java.util.List;




public class Javamap {
;
	private List<String> nums = new ArrayList<>();

	public List<String> getNums() {
		return nums;
	}

	public void setNums(List<String> nums) {
		this.nums = nums;
	}
	
	public boolean removeNum(String nums) {
		return this.nums.remove(nums);

	}
	
	public boolean addNum(String nums) {
		return this.nums.add(nums);

	}


}

package cn.bjsxt.oop;

public class PhoneNo {
	public static void main(String[] args) {
		int[] arr = new int[] {8,2,1,0,3};
		int[] index = new int[] {2,0,3,2,4,0,1,3,2,1,3};
		String tel = "";
			for(int i : index) {
				tel+= arr[i];
			}
			
			System.out.println("联系方式："+tel);
	}
}

/*
 * 测试for循环用法
 */
public class TestFor {
	public static void main(String[] args) {
	/*
		int oddsum = 0;  //用来存放奇数的和
		int evenSum = 0;  //用来存放偶数的和
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				oddsum += i;
			}else {
				evenSum += i;
			}			
		}
		System.out.println(oddsum);
		System.out.println(evenSum);
		
		System.out.println("###############");
		
		for(int j=1;j<=1000;j++) {
			if(j%5==0) {
				System.out.print(j+"\t");
			}
			if(j%(5*5)==0) {  //没输出5个换一行
				System.out.println();
			}
		}
	*/
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}

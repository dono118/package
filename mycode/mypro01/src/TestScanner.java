import java.util.Scanner;

/**
 * ����Scanner���ʹ�ã���ν��ռ��̵�����
 * @author Administrator
 *
 */
public class TestScanner {
	
	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();   //�������е�next���������ȴ����̵����룡
		System.out.println("�ղż������룺"+str);
		s.close();
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = s.nextInt();
		System.out.println("�����뱻������");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println("����������Ϊ��"+sum);
		s.close();
	}
	
	public static void main(String[] args) {
		test02();
	}
}

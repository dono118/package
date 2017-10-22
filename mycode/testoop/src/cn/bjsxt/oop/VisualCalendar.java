package cn.bjsxt.oop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���ӻ���������
 * @author Administrator
 *
 */
public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("����������(��ʽ��2011-11-11)��");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			
			for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print('\t');
			}
			
			for(int i=1;i<=maxDate;i++) {
				if(i==day) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY) {
					System.out.print('\n');
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
package cn.bjsxt.oop;

public class Student {
	//��̬������
	String name;
	int id;    //ѧ��
	int age;
	String gender;
	int weight;
	
	//��̬����Ϊ
	public void study() {
		System.out.println(name+"��ѧϰ");
	}
	
	public void sayHello(String sname) {
		System.out.println(name+"��"+sname+"˵����ã�");
	}
	
	public static void main(String[] args) {
		//ͨ���������Class Loader����Student�ࡣ���غ��ڷ������о�����Student�����Ϣ
		Student s1 = new Student();
		s1.name = "����";
		s1.study();
		s1.sayHello("��ʿ��");
		
		Student s2 = new Student();
		s2.id = 1;
		s2.name = "��С��";
		s2.gender = "��";
		s2.age = 20;
	}

}

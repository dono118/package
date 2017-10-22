package cn.bjsxt.oop;

public class Student {
	//静态的数据
	String name;
	int id;    //学号
	int age;
	String gender;
	int weight;
	
	//动态的行为
	public void study() {
		System.out.println(name+"在学习");
	}
	
	public void sayHello(String sname) {
		System.out.println(name+"向"+sname+"说，你好！");
	}
	
	public static void main(String[] args) {
		//通过类加载器Class Loader加载Student类。加载后，在方法区中就有了Student类的信息
		Student s1 = new Student();
		s1.name = "高清";
		s1.study();
		s1.sayHello("马士兵");
		
		Student s2 = new Student();
		s2.id = 1;
		s2.name = "王小波";
		s2.gender = "男";
		s2.age = 20;
	}

}

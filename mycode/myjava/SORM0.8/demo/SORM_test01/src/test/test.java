package test;

import java.util.List;

import com.dono.sorm.core.Query;
import com.dono.sorm.core.QueryFactory;
import com.dono.test.po.Emp;
import com.dono.test.vo.EmpVO;

public class test {
	
	public static void add() {
		Emp e = new Emp();
		e.setAge(18);
		e.setEmpname("高琪琪");
		e.setSalary(2000.0);
		
		Query q = QueryFactory.createQuery();
		
		q.insert(e);
	}
	
	public static void delete() {
		Emp e = new Emp();
		e.setId(3);
		Query q = QueryFactory.createQuery();
		
		q.delete(e);
	}
	
	public static void update() {
		Emp e = new Emp();
		e.setId(1);
		e.setAge(25);
		e.setSalary(4800.0);
		
		Query q = QueryFactory.createQuery();
		
		q.update(e,new String[]{"age","salary"});
	}
	
	public static void select01() {
		Query q = QueryFactory.createQuery();
		Number n = q.queryNumber("select count(*) from emp where salary>?",new Object[]{5000});
		System.out.println(n);
	}
	
	public static void select02() {
		Query q = QueryFactory.createQuery();
		Emp e = (Emp) q.queryUniqueRow("select * from emp where id=?",Emp.class,new Object[]{5});
		System.out.println(e.getEmpname());
	}
	
	public static void select03() {
		Query q = QueryFactory.createQuery();
		List<Emp> list = (List) q.queryRows("select * from emp where id>?",Emp.class,new Object[]{5});
		System.out.println(list);
		for(Emp emp:list) {
			System.out.println(emp.getEmpname()+"--"+emp.getBirthday());
		}
	}
	
	public static void select04() {
		Query q = QueryFactory.createQuery();
		String sql = "select e.id,e.empname,e.age,d.dname 'deptName',d.address 'deptAddr' from emp e join dept d on e.deptId=d.id ";
		List<EmpVO> list = (List) q.queryRows(sql,EmpVO.class,new Object[]{});
		System.out.println(list);
		for(EmpVO emp:list) {
			System.out.println(emp.getEmpname()+"--"+emp.getDeptAddr()+"--"+emp.getDeptName());
		}
	}
	
	public static void select05() {
		Query q = QueryFactory.createQuery();
		Emp e = (Emp) q.queryById(Emp.class, 8);
		System.out.println(e.getEmpname());
	}
	
	public static void main(String[] args) {
		
		//通过这个方法可以生成po类!
//		TableContext.updateJavaPOFile();
//		select01();
//		delete();
//		update();
		
		select05();
	}
}

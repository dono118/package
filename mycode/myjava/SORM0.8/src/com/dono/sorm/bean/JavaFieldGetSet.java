package com.dono.sorm.bean;

/**
 * ��װ��Java���Ժ�get��set������Դ����
 * @author Administrator
 *
 */
public class JavaFieldGetSet {
	/**
	 * ���Ե�Դ����Ϣ���磺private int id;
	 */
	private String fieldInfo;
	/**
	 * ������Դ����Ϣ���磺public int getId(){return id}
	 */
	private String getInfo;
	/**
	 * ������Դ����Ϣ���磺public void setId(int id){this.id=id;}
	 */
	private String setInfo;
	
	@Override
	public String toString() {
		System.out.println(fieldInfo);
		System.out.println(getInfo);
		System.out.println(setInfo);
		return super.toString();
	}
	
	public String getFieldInfo() {
		return fieldInfo;
	}
	public void setFieldInfo(String fieldInfo) {
		this.fieldInfo = fieldInfo;
	}
	public String getGetInfo() {
		return getInfo;
	}
	public void setGetInfo(String getInfo) {
		this.getInfo = getInfo;
	}
	public String getSetInfo() {
		return setInfo;
	}
	public void setSetInfo(String setInfo) {
		this.setInfo = setInfo;
	}
	
	public JavaFieldGetSet(String fieldInfo, String getInfo, String setInfo) {
		super();
		this.fieldInfo = fieldInfo;
		this.getInfo = getInfo;
		this.setInfo = setInfo;
	}
	
	public JavaFieldGetSet() {
	}
	
}

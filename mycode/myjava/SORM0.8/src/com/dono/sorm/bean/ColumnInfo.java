package com.dono.sorm.bean;

/**
 * ��װ����һ���ֶε���Ϣ
 * @author Administrator
 *
 */
public class ColumnInfo {
	/**
	 * �ֶ�����
	 */
	private String name;
	
	/**
	 * �ֶε���������
	 */
	private String datatype;
	
	/**
	 * �ֶεļ����ͣ�0����ͨ�� 1������ 2�������
	 */
	private int keyType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public int getKeyType() {
		return keyType;
	}

	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}

	public ColumnInfo(String name, String datatype, int keyType) {
		super();
		this.name = name;
		this.datatype = datatype;
		this.keyType = keyType;
	}
	
	public ColumnInfo() {
	}
}

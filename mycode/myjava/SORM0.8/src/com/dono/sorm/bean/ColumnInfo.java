package com.dono.sorm.bean;

/**
 * 封装表中一个字段的信息
 * @author Administrator
 *
 */
public class ColumnInfo {
	/**
	 * 字段名称
	 */
	private String name;
	
	/**
	 * 字段的数据类型
	 */
	private String datatype;
	
	/**
	 * 字段的键类型（0：普通键 1：主键 2：外键）
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

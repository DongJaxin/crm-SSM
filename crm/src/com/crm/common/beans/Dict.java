package com.crm.common.beans;

public class Dict {
	private Integer dict_id;
	private String dict_type_code;
	private String dict_type_name;
	private String dict_item_name;
	private String dict_item_code;
	private String dict_sort;
	private String dict_enable;
	private String dict_memo;
	public Integer getDict_id() {
		return dict_id;
	}
	public void setDict_id(Integer dict_id) {
		this.dict_id = dict_id;
	}
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	public String getDict_type_name() {
		return dict_type_name;
	}
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	public String getDict_item_name() {
		return dict_item_name;
	}
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	public String getDict_item_code() {
		return dict_item_code;
	}
	public void setDict_item_code(String dict_item_code) {
		this.dict_item_code = dict_item_code;
	}
	public String getDict_sort() {
		return dict_sort;
	}
	public void setDict_sort(String dict_sort) {
		this.dict_sort = dict_sort;
	}
	public String getDict_enable() {
		return dict_enable;
	}
	public void setDict_enable(String dict_enable) {
		this.dict_enable = dict_enable;
	}
	public String getDict_memo() {
		return dict_memo;
	}
	public void setDict_memo(String dict_memo) {
		this.dict_memo = dict_memo;
	}
	@Override
	public String toString() {
		return "Dict [dict_id=" + dict_id + ", dict_type_code=" + dict_type_code + ", dict_type_name=" + dict_type_name
				+ ", dict_item_name=" + dict_item_name + ", dict_item_code=" + dict_item_code + ", dict_sort="
				+ dict_sort + ", dict_enable=" + dict_enable + ", dict_memo=" + dict_memo + "]";
	}
	
	
	
}

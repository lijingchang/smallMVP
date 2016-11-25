package com.example.model;

public interface IModel {
	void additem(String arg1);
	void additem(String arg1,int pos);
	int getcount();
	String getindexof(int pos);
	void clear();
	int showpos(String arg1);
	String showall();
}

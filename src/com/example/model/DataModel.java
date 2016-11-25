package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class DataModel implements IModel{

	private List<String> cmdlist=new ArrayList<String>();
	
	
	 @Override
	public void additem(String arg1){
		cmdlist.add(arg1);
	}
	 
	 @Override
	public void additem(String arg1,int pos){
		cmdlist.add(pos, arg1);
	}
	
	 @Override
	public int getcount(){
		return cmdlist.size();
	}
	 
	 @Override
	public String getindexof(int pos){
		return cmdlist.get(pos);
	}
	 
	 @Override
		public String showall(){
			return cmdlist.toString();
		}
	
	 @Override
	public void clear(){
		cmdlist.clear();
	}
	 
	 @Override
		public int showpos(String arg1){
		  int i=cmdlist.indexOf(arg1);
		  return i;
		}
	
}

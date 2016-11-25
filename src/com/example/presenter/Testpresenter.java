package com.example.presenter;

import com.example.model.DataModel;
import com.example.model.IModel;
import com.example.test.IView;

public class Testpresenter implements Ipresenter{
	
	private IView viewcontrol;
	private IModel model;
	public Testpresenter(IView view){
		this.viewcontrol=view;
		this.model=new DataModel();
	}
	
	@Override
	public void add(String arg0){
		model.additem(arg0);
	}
	
	@Override
	public void showpos(String arg0){
		viewcontrol.settext(""+model.showpos(arg0));
	}
	
	@Override
	public void showall(){
		viewcontrol.settext(""+model.showall());
	}
	
}

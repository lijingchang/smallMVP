package com.example.test;

import com.example.presenter.Ipresenter;
import com.example.presenter.Testpresenter;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements IView {

	private EditText shelltext;
	private TextView backon;
	private Ipresenter presenter;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		presenter=new Testpresenter(this);
		
		shelltext=(EditText)findViewById(R.id.cmd);
		backon=(TextView)findViewById(R.id.backon);
		Button exec=(Button)findViewById(R.id.doshell);
		Button showpos=(Button)findViewById(R.id.showpos);
		Button showall=(Button)findViewById(R.id.showall);
		exec.setOnClickListener(myhandler);
		showpos.setOnClickListener(myhandler);
		showall.setOnClickListener(myhandler);
		
		backon.setMovementMethod(ScrollingMovementMethod.getInstance());
	}
	
	
	View.OnClickListener myhandler = new View.OnClickListener() {
	    public void onClick(View v) {
	    	switch(v.getId()) {
	        case R.id.doshell:
	        	presenter.add(shelltext.getText().toString());
	          break;
	        case R.id.showpos:
	        	presenter.showpos(shelltext.getText().toString());
	        	break;
	        case R.id.showall:
	        	presenter.showall();
	        	break;
	          default: break;
	      }
	    }
	  };
	
	@Override
	public void settext(String arg1){
		backon.append(arg1+'\n');
	}
	
	@Override
	public void setEdittext(String arg1){
		shelltext.setText(arg1);
	}
	
	
}

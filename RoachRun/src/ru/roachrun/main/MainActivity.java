package ru.roachrun.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;





public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}




	public void  MyClick (View v)
	
	{
		
	
	switch 	(v.getId())
	{
	case R.id.btnMapStart: 
					{
				   Intent intent = new Intent (this, MapActivity.class);
		           startActivity(intent);		           
		           break; 
		           
	                }
		
	}
	
	
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
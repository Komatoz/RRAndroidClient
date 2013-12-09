package ru.roachrun.main;

import ru.yandex.yandexmapkit.MapView;
import android.app.Activity;
import android.os.Bundle;








public class MapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	
	
	

		
		setTitle("Run!");

		setContentView(R.layout.roachmap);

	        final MapView mapView = (MapView) findViewById(R.id.mainmap);
	        mapView.showBuiltInScreenButtons(true);

	
		
		
		
	}



}

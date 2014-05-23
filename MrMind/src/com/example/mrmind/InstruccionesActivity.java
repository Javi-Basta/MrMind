package com.example.mrmind;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.RelativeLayout;

public class InstruccionesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_instrucciones);
		RelativeLayout relativelayout01 = (RelativeLayout) findViewById(R.id.botonEnviar);
		relativelayout01.setBackgroundColor(Color.CYAN);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.instrucciones, menu);
		return true;
	}

}

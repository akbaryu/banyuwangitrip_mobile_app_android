package com.yudha.banyuwangitrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends Activity {

	  private final int SPLASH_DISPLAY_LENGHT = 3000;
	  
	  @Override
	  protected void onCreate(Bundle incicle){
		  super.onCreate(incicle);
		  setContentView(R.layout.splash);
		  new Handler().postDelayed(new Runnable(){
			  @Override
			  public void run() {
				  Intent mainIntent = null;
				  mainIntent = new Intent(MainActivity.this, homeActivity.class);
				  
				  MainActivity.this.startActivity(mainIntent);
				  MainActivity.this.finish();
			  }
		  },SPLASH_DISPLAY_LENGHT);
	  }
	}
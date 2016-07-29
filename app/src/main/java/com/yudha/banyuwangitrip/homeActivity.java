package com.yudha.banyuwangitrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class
		homeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button btnabout =(Button)findViewById(R.id.btn_about);
        btnabout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),aboutActivity.class);
				startActivity(intent);
			}
		});
        Button btnberita =(Button)findViewById(R.id.btn_berita);
        btnberita.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),berita.class);
				startActivity(intent);
			}
		});
        	
        Button btnwisata =(Button)findViewById(R.id.btn_wisata);
        btnwisata.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),wisata.class);
				startActivity(intent);
			}
		});
        Button btnhotel =(Button)findViewById(R.id.btn_hotel);
        btnhotel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),hotel.class);
				startActivity(intent);
			}
		});
        Button btnbelanja =(Button)findViewById(R.id.btn_belanja);
        btnbelanja.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),belanja.class);
				startActivity(intent);
			}
		});
        
	        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}

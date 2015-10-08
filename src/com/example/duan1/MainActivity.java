package com.example.duan1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btn_themthuoc,btn_timkiem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_themthuoc = (Button) findViewById(R.id.btn_themthuoc);
		btn_timkiem = (Button) findViewById(R.id.btn_timkiem);
		btn_themthuoc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ThemThuoc.class);
				startActivity(intent);
			}
		});
		btn_timkiem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,TimKiem.class);
				startActivity(intent);
			}
		});
	}
}

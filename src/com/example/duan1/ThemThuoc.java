package com.example.duan1;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ThemThuoc extends Activity {
	Button them,huy;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_them_thuoc);
		them = (Button) findViewById(R.id.btn_addthuoc);
		huy = (Button) findViewById(R.id.btn_huythem1);
		them.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(ThemThuoc.this, "thêm thành công", Toast.LENGTH_SHORT).show();
			}
		});
		huy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
}

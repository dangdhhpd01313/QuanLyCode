package com.example.duan1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DangNhap extends Activity {
	EditText txt_user,txt_pass;
	Button btn_dangnhap,btn_dangki;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dang_nhap);
		txt_pass = (EditText) findViewById(R.id.txt_pass);
		txt_user = (EditText) findViewById(R.id.txt_user);
		btn_dangki = (Button) findViewById(R.id.btn_dangki);
		btn_dangnhap = (Button) findViewById(R.id.btn_dangnhap);
		btn_dangki.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(DangNhap.this,DangKy.class);
				startActivity(intent);
			}
		});
		btn_dangnhap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(DangNhap.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}
}

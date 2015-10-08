package com.example.duan1;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class TimKiem extends Activity {
	private ListView lv1;
	EditText inputSearch;
	ArrayList<HashMap<String, String>> productList;
	String[] item = {"Fentanyl ", "Halothan", "Allopurinol ", "Colchicin", "Hydroxocobalamin",
            "Natri calci edetat", "Carbamazepin",
            "Metrifonat", "Amoxicilin", "Cloxacilin", "Cloramphenicol"};
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tim_kiem);
		inputSearch = (EditText) findViewById(R.id.inputSearch);
		lv1 = (ListView) findViewById(R.id.listview);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(TimKiem.this, R.layout.list_item,R.id.product_name, item);
		lv1.setAdapter(adapter);
		
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TimKiem.this,ThongTinThuoc.class);
				startActivity(intent);
			}
			
		});
		lv1.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		inputSearch.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				adapter.getFilter().filter(s);
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}

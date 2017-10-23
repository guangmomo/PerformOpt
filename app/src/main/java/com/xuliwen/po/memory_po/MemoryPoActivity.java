package com.xuliwen.po.memory_po;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xuliwen.po.R;

public class MemoryPoActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_memory_po);
	}

	public void toMemoryLeakActivity1(View view) {
		startActivity(new Intent(this, MemoryLeakActivity1.class));
	}

	public void toMemoryLeakActivity2(View view) {
		startActivity(new Intent(this, MemoryLeakActivity2.class));
	}
}

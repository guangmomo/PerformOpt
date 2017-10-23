package com.xuliwen.po.memory_po;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuliwen.po.R;

public class MemoryLeakActivity1 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_memory_leak1);
		memoryLeak();
	}
	
	private void memoryLeak(){
		MemoryPoSingleInstance.getMemoryPoSingleInstance(this);
	}
}

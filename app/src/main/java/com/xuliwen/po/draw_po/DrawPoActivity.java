package com.xuliwen.po.draw_po;

import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Trace;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.xuliwen.po.R;


public class DrawPoActivity extends AppCompatActivity {

	private boolean mIsHasInflate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draw_po);
	}

	public void traceView(View view) {
		Debug.startMethodTracing("toStandardActivity");
		fun1();
		fun2();
		fun3();
		fun4();
		fun5();
		Debug.stopMethodTracing();
	}


	@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
	public void sysTrace(View view) {
		Trace.beginSection("sysTraceTest");
		sleep();
		Trace.endSection();
	}

	public void viewStub(View view) {
		if (!mIsHasInflate) {
			mIsHasInflate = true;
			findViewById(R.id.draw_po_viewStub).setVisibility(View.VISIBLE);
			TextView errorTextView1 = (TextView) findViewById(R.id.error_layout_textView1);
			errorTextView1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(DrawPoActivity.this, "errorTextView1", Toast.LENGTH_SHORT).show();
				}
			});
		}
	}
	
	public void goneCustomViewTest(View view){
		findViewById(R.id.draw_po_commonCustomView).setVisibility(View.VISIBLE);
	}


	public void goneLayoutTest(View view){
		findViewById(R.id.gone_layout_linearLayout).setVisibility(View.VISIBLE);
	}
	
	private void fun1() {
		for (int y = 0; y < 100; ) {
			y++;
		}
		fun2();
	}

	private void fun2() {
		for (int y = 0; y < 1000; ) {
			y++;
		}
	}

	private void fun3() {
		for (int y = 0; y < 10000; ) {
			y++;
		}
		fun4();
	}

	private void fun4() {
		for (int y = 0; y < 20000; ) {
			y++;
		}
	}

	private void fun5() {
		for (int y = 0; y < 30000; ) {
			y++;
		}
		fun4();
	}


	private void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

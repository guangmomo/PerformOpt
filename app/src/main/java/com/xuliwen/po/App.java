package com.xuliwen.po;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by xuliwen on 2017/10/17.
 */

public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		if (LeakCanary.isInAnalyzerProcess(this)) {
			// This process is dedicated to LeakCanary for heap analysis.
			// You should not init your app in this process.
			return;
		}
		LeakCanary.install(this);
		// Normal app init code...
	}
}

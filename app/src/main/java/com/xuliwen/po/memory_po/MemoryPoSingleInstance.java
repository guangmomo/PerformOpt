package com.xuliwen.po.memory_po;

import android.content.Context;

/**
 * Created by xuliwen on 2017/10/17.
 */

public final class MemoryPoSingleInstance {
	private static  MemoryPoSingleInstance sMemoryPoSingleInstance = new MemoryPoSingleInstance();

	private static Context sContext;
	
	public static MemoryPoSingleInstance getMemoryPoSingleInstance(Context context) {
		sContext = context;
		return sMemoryPoSingleInstance;
	}
}

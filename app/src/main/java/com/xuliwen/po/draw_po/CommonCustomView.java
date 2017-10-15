package com.xuliwen.po.draw_po;


import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.xuliwen.po.utils.L;

/**
 * Created by xuliwen on 2017/10/9.
 */

public class CommonCustomView extends View {
	public CommonCustomView(Context context) {
		super(context);
	}

	public CommonCustomView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public CommonCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		L.l("TestCustomView: onMeasure");
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
		L.l("TestCustomView: onLayout");
		super.onLayout(changed, left, top, right, bottom);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		L.l("TestCustomView: onDraw");
		super.onDraw(canvas);
	}
}

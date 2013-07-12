package com.htyuan.jnitest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
		setTitle(stringFromJNI());
	}

	public native String  stringFromJNI();
	public native String  unimplementedStringFromJNI();
	static {
        System.loadLibrary("hello-jni");
    }
}

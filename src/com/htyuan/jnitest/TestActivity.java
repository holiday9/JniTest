package com.htyuan.jnitest;

import android.app.Activity;
import android.os.Bundle;

import com.htyuan.types.Param;
import com.htyuan.types.Result;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
		setTitle(bussearcher_stattext("11"));
	}

	public native String  stringFromJNI();
	public native String  unimplementedStringFromJNI();
	public native String bussearcher_stattext(String station);
	static {
		System.loadLibrary("bus-base");
        System.loadLibrary("aaa");
    }
	
}

package com.htyuan.jnitest;

public class NAdd {
	static {
		System.loadLibrary("libtest");
	}

	public native int add(int first, int second);
	public native int subtraction(int first, int second);
}

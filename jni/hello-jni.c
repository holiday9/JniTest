/*
 * =====================================================================================
 *
 *       Filename:  hello-jni.c
 *
 *    Description:  jni test code
 *
 *        Version:  1.0
 *        Created:  2013年07月12日 17时44分44秒
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  htyuan (htyuan), htyuan80@gmail.com
 *        Company:  aibang
 *
 * =====================================================================================
 */

#include<string.h>
#include<jni.h>

jstring Java_com_htyuan_jnitest_TestActivity_stringFromJNI
  (JNIEnv * env, jobject thiz) {
	return (*env)->NewStringUTF(env, "Hello from JNI"); 
}

/*
 * Class:     com_htyuan_jnitest_TestActivity
 * Method:    unimplementedStringFromJNI
	 * Signature: ()Ljava/lang/String;
	 */
jstring Java_com_htyuan_jnitest_TestActivity_unimplementedStringFromJNI
	  (JNIEnv * env, jobject thiz) {
	return (*env)->NewStringUTF(env, "unimplemented string from jni"); 
}





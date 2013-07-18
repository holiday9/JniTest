LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := busbase-prebuilt
LOCAL_SRC_FILES := libbus-base.so
include $(PREBUILT_SHARED_LIBRARY)


include $(CLEAR_VARS)
LOCAL_MODULE := aaa
LOCAL_SRC_FILES := hello-jni.c
LOCAL_SHARED_LIBRARIES := busbase-prebuilt
include $(BUILD_SHARED_LIBRARY)

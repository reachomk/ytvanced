package com.google.mediapipe.framework;

import android.content.Context;

public final class AndroidAssetUtil {
    private AndroidAssetUtil() {
    }

    public static native boolean nativeInitializeAssetManager(Context context, String str);
}

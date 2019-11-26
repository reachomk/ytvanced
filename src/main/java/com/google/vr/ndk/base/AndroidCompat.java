package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;
import defpackage.baew;

public final class AndroidCompat {
    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return baew.a(activity, z);
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        if (baew.a() && ((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            Window window = activity.getWindow();
            if (window == null) {
                Log.e(baew.a, "Activity does not have a window");
            } else {
                window.setSustainedPerformanceMode(z);
            }
        }
    }

    private AndroidCompat() {
    }
}

package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import defpackage.baff;

public class DaydreamUtilsWrapper {
    public boolean isDaydreamActivity(Activity activity) {
        return isDaydreamComponent(activity);
    }

    public boolean isDaydreamComponent(Context context) {
        return getComponentDaydreamCompatibility(context).supportsDaydream();
    }

    public boolean isDaydreamRequiredComponent(Context context) {
        return getComponentDaydreamCompatibility(context).requiresDaydream();
    }

    public DaydreamCompatibility getComponentDaydreamCompatibility(Context context) {
        ComponentName b = baff.b(context);
        if (b != null) {
            return DaydreamUtils.getComponentDaydreamCompatibility(context, b);
        }
        return new DaydreamCompatibility();
    }

    public boolean isDaydreamPhone(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }
}

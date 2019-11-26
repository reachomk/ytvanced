package com.google.vr.ndk.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import java.util.List;

public class DaydreamUtils {
    public static boolean sDaydreamPhoneOverrideForTesting;

    public static boolean isDaydreamPhone(Context context) {
        if (sDaydreamPhoneOverrideForTesting) {
            return true;
        }
        return VERSION.SDK_INT >= 24 ? context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") : false;
    }

    public static boolean isDaydreamViewer(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return (cardboardDevice$DeviceParams == null || cardboardDevice$DeviceParams.daydreamInternal == null) ? false : true;
    }

    public static DaydreamCompatibility getComponentDaydreamCompatibility(Context context, ComponentName componentName) {
        return getComponentDaydreamCompatibility(context.getPackageManager(), componentName);
    }

    public static String getDeviceParamsDisplayedName(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams != null) {
            return getDeviceParamsDisplayedName(cardboardDevice$DeviceParams.getVendor(), cardboardDevice$DeviceParams.getModel());
        }
        Log.e("DaydreamUtils", "Null params in getDeviceParamsDisplayedName");
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    public static java.lang.String getDeviceParamsDisplayedName(java.lang.String r2, java.lang.String r3) {
        /*
        if (r2 != 0) goto L_0x0003;
    L_0x0002:
        goto L_0x0047;
    L_0x0003:
        if (r3 == 0) goto L_0x0047;
    L_0x0005:
        r0 = "Google, Inc.";
        r0 = r2.equals(r0);
        if (r0 != 0) goto L_0x0017;
    L_0x000d:
        r0 = "Google";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0017;
    L_0x0016:
        return r3;
    L_0x0017:
        r2 = r3.hashCode();
        r0 = -2120800987; // 0xffffffff81972525 float:-5.552194E-38 double:NaN;
        r1 = 1;
        if (r2 == r0) goto L_0x0031;
    L_0x0021:
        r0 = 1761541558; // 0x68fefdb6 float:9.63329E24 double:8.703171675E-315;
        if (r2 == r0) goto L_0x0027;
    L_0x0026:
        goto L_0x003b;
    L_0x0027:
        r2 = "Cardboard";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003b;
    L_0x002f:
        r2 = 0;
        goto L_0x003c;
    L_0x0031:
        r2 = "Cardboard v1";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003b;
    L_0x0039:
        r2 = 1;
        goto L_0x003c;
    L_0x003b:
        r2 = -1;
    L_0x003c:
        if (r2 == 0) goto L_0x0044;
    L_0x003e:
        if (r2 == r1) goto L_0x0041;
    L_0x0040:
        return r3;
    L_0x0041:
        r2 = "Google Cardboard";
        return r2;
    L_0x0044:
        r2 = "Google Cardboard (I/O 2015)";
        return r2;
    L_0x0047:
        r2 = "DaydreamUtils";
        r0 = "Null vendor/model in getDeviceParamsDisplayedName";
        android.util.Log.e(r2, r0);
        if (r3 != 0) goto L_0x0053;
    L_0x0050:
        r2 = "";
        return r2;
    L_0x0053:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.DaydreamUtils.getDeviceParamsDisplayedName(java.lang.String, java.lang.String):java.lang.String");
    }

    static DaydreamCompatibility getComponentDaydreamCompatibility(PackageManager packageManager, ComponentName componentName) {
        int checkHeadsetCompatibility = checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM");
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.CARDBOARD")) {
            checkHeadsetCompatibility |= 2;
        }
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL")) {
            checkHeadsetCompatibility |= 4;
        }
        return new DaydreamCompatibility(checkHeadsetCompatibility);
    }

    private static boolean checkHeadsetCompatibility(PackageManager packageManager, ComponentName componentName, String str) {
        Intent intent = new Intent();
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(str);
        return canResolveIntent(packageManager, componentName, intent);
    }

    private static boolean canResolveIntent(PackageManager packageManager, ComponentName componentName, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.equals(componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import defpackage.aocf;
import defpackage.aocg;
import defpackage.baez;
import defpackage.bafa;
import defpackage.bafh;
import defpackage.bahi;
import defpackage.bahk;

public class VrParamsProviderJni {
    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        bahi a = bahk.a(context);
        CardboardDevice$DeviceParams a2 = a.a();
        a.e();
        return a2 != null ? aocf.toByteArray(a2) : null;
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        return SdkConfigurationReader.getParams(context).toByteArray();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams;
        bahi a = bahk.a(context);
        if (bArr != null) {
            try {
                cardboardDevice$DeviceParams = (CardboardDevice$DeviceParams) aocf.mergeFrom(new CardboardDevice$DeviceParams(), bArr);
            } catch (aocg e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                stringBuilder.append("Error parsing protocol buffer: ");
                stringBuilder.append(valueOf);
                Log.w("VrParamsProviderJni", stringBuilder.toString());
                a.e();
                return false;
            } catch (Throwable th) {
                a.e();
            }
        } else {
            cardboardDevice$DeviceParams = null;
        }
        boolean a2 = a.a(cardboardDevice$DeviceParams);
        a.e();
        return a2;
    }

    private static void readDisplayParams(Context context, long j) {
        int i = 0;
        if (context != null) {
            bahi a = bahk.a(context);
            Display$DisplayParams c = a.c();
            a.e();
            Display a2 = bafh.a(context);
            bafa bafa = new bafa();
            DisplayMetrics a3 = bafh.a(a2, c);
            float a4 = bafh.a(c);
            baez a5 = bafa.a(a2);
            if (a5 != null) {
                int a6;
                if (context.getResources().getConfiguration().orientation == 1) {
                    a6 = a5.a();
                    i = a5.b();
                } else {
                    a6 = a5.c();
                    i = a5.d();
                }
                i += a6;
            }
            a(j, a3, a4, i);
            return;
        }
        Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
        a(j, Resources.getSystem().getDisplayMetrics(), bafh.a(null), 0);
    }

    private static byte[] readUserPrefs(Context context) {
        bahi a = bahk.a(context);
        Preferences$UserPrefs d = a.d();
        a.e();
        return d != null ? d.toByteArray() : null;
    }

    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }
}

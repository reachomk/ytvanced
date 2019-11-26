package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

/* renamed from: xva */
public final class xva {
    public static ComponentName a(Context context, Intent intent) {
        if (VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            return context.startService(intent);
        }
        return context.startForegroundService(intent);
    }
}

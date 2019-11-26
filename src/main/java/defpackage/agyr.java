package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: agyr */
public final class agyr {
    public final WakeLock a;

    public agyr(Context context) {
        this.a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, getClass().getName());
    }
}

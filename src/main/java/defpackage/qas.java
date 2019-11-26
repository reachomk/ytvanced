package defpackage;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: qas */
public final class qas {
    public static String a(WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf(((long) System.identityHashCode(wakeLock)) | (((long) Process.myPid()) << 32)));
        Object obj = null;
        if (TextUtils.isEmpty(null)) {
            obj = "";
        }
        str = String.valueOf(obj);
        return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }
}

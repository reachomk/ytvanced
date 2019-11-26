package defpackage;

import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Callable;

@qlp
/* renamed from: qmi */
public final class qmi {
    public static Object a(Context context, Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            context = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return context;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

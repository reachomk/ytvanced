package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: ozj */
final class ozj implements oye {
    ozj() {
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        return SystemClock.uptimeMillis();
    }

    public final oyn a(Looper looper, Callback callback) {
        return new ozm(new Handler(looper, callback));
    }
}

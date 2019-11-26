package defpackage;

import android.util.Log;

/* renamed from: bxy */
final class bxy implements bxw {
    bxy() {
    }

    public final void a(Throwable th) {
        String str = "GlideExecutor";
        if (Log.isLoggable(str, 6)) {
            Log.e(str, "Request threw uncaught throwable", th);
        }
    }
}

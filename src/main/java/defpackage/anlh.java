package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: anlh */
final class anlh implements Executor {
    private static final Handler a = new Handler(Looper.getMainLooper());

    private anlh() {
    }

    public final void execute(Runnable runnable) {
        a.post(runnable);
    }

    /* synthetic */ anlh(byte b) {
    }
}

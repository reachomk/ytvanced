package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: chq */
final class chq implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    chq() {
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}

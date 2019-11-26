package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* renamed from: bafs */
public final class bafs implements bafr {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public bafs(long j, long j2) {
        this.a = new bafv(j);
        this.b = j2;
    }

    public final void a() {
        this.c.post(this.a);
    }

    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    public final void c() {
        this.c.removeCallbacks(this.a);
    }
}

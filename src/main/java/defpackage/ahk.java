package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahk */
final class ahk implements aho {
    public final ahm a = new ahm();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final /* synthetic */ aho c;
    private final Executor d = AsyncTask.THREAD_POOL_EXECUTOR;
    private final Runnable e = new ahn(this);

    ahk(aho aho) {
        this.c = aho;
    }

    public final void a(int i) {
        b(ahp.a(1, i, null));
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        b(ahp.a(2, i, i2, i3, i4, i5, null));
    }

    public final void a(int i, int i2) {
        a(ahp.a(3, i, i2));
    }

    public final void a(aht aht) {
        a(ahp.a(4, 0, (Object) aht));
    }

    private final void a(ahp ahp) {
        this.a.b(ahp);
        a();
    }

    private final void b(ahp ahp) {
        this.a.a(ahp);
        a();
    }

    private final void a() {
        if (this.b.compareAndSet(false, true)) {
            this.d.execute(this.e);
        }
    }
}

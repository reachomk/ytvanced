package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: puv */
public final class puv extends pxh {
    public final zl b = new zl();
    public pty c;

    public puv(puf puf) {
        super(puf);
        this.a.a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    public final void b() {
        super.b();
        g();
    }

    public final void c() {
        g();
    }

    public final void d() {
        super.d();
        pty pty = this.c;
        synchronized (pty.f) {
            if (pty.k == this) {
                pty.k = null;
                pty.l.clear();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(psa psa, int i) {
        this.c.b(psa, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        this.c.b();
    }

    private final void g() {
        if (!this.b.isEmpty()) {
            this.c.a(this);
        }
    }
}

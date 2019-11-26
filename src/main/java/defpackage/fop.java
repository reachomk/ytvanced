package defpackage;

import android.os.Handler;

/* renamed from: fop */
public final class fop implements foj {
    public Runnable a;
    private final Handler b;
    private final Runnable c = new foo(this);

    public fop(Handler handler) {
        this.b = (Handler) amqw.a((Object) handler);
    }

    public final synchronized void a(Runnable runnable) {
        amqw.a((Object) runnable);
        this.b.removeCallbacks(this.c);
        this.a = runnable;
        this.b.postDelayed(this.c, 1000);
    }

    public final synchronized void a() {
        this.b.removeCallbacks(this.c);
        this.c.run();
    }

    public final synchronized void b() {
        this.b.removeCallbacks(this.c);
        this.a = null;
    }
}

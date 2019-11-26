package defpackage;

import android.os.Looper;

/* renamed from: wzd */
public final class wzd {
    public volatile boolean a;
    public boolean b;
    private final wzc c = ((wzc) amqw.a(new wzf(Looper.myQueue())));
    private boolean d;

    public wzd() {
        xak.a();
    }

    public final void a() {
        xak.a();
        if (this.a) {
            if (!this.b) {
                this.b = true;
                this.d = this.c.a();
            }
            if (this.d) {
                this.c.b();
            }
        }
    }
}

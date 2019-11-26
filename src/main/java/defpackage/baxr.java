package defpackage;

import java.io.InputStream;

/* renamed from: baxr */
final class baxr implements bbhp {
    private final Runnable a;
    private boolean b = false;
    private final /* synthetic */ baxj c;

    public final InputStream a() {
        if (!this.b) {
            this.a.run();
            this.b = true;
        }
        return (InputStream) this.c.c.poll();
    }

    /* synthetic */ baxr(baxj baxj, Runnable runnable) {
        this.c = baxj;
        this.a = runnable;
    }
}

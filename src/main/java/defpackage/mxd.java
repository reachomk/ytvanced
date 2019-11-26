package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mxd */
public final class mxd extends mzc implements msm {
    public final msj a;
    private final Handler b;
    private final Runnable c;
    private final Runnable d;
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();

    public mxd(msj msj, Handler handler) {
        this.a = (msj) amqw.a((Object) msj, (Object) "target cannot be null");
        this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        this.c = new mxc(msj);
        this.d = new mxi(msj);
        msj.a((msm) this);
    }

    public final void a(int i, int i2) {
        this.e.set(i);
        this.f.set(i2);
    }

    public final int a() {
        return this.e.get();
    }

    public final int b() {
        return this.f.get();
    }

    public final void c() {
        Handler handler = this.b;
        msj msj = this.a;
        msj.getClass();
        handler.post(new mxf(msj));
    }

    public final void b(int i, int i2) {
        this.b.post(new mxe(this, i, i2));
    }

    public final void a(int i) {
        this.b.post(new mxh(this, i));
    }

    public final void b(int i) {
        this.b.post(new mxg(this, i));
    }

    public final void a(boolean z) {
        this.b.post(new mxj(this));
    }

    public final void c(int i) {
        this.b.postDelayed(this.c, (long) i);
    }

    public final void d() {
        this.b.post(this.d);
    }
}

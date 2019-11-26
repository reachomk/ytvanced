package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xas */
public abstract class xas implements xat, xav {
    public final amuw a;
    public volatile boolean b;
    private final Executor c;
    private final xau d;
    private volatile boolean e;

    public xas(Executor executor, amuw amuw, xau xau) {
        this.c = (Executor) amqw.a((Object) executor);
        this.a = (amuw) amqw.a((Object) amuw);
        this.d = xau;
        amxo amxo = (amxo) amuw.iterator();
        while (amxo.hasNext()) {
            ((xaq) amxo.next()).a = this;
        }
    }

    public void a() {
        throw null;
    }

    public abstract Runnable d();

    public final void b() {
        c();
    }

    public final void c() {
        amxo amxo = (amxo) this.a.iterator();
        while (amxo.hasNext()) {
            if (!((xaq) amxo.next()).a()) {
                return;
            }
        }
        if (!this.b && !this.e) {
            this.e = true;
            this.c.execute(d());
            xau xau = this.d;
            if (xau != null) {
                xau.a(this);
            }
        }
    }
}

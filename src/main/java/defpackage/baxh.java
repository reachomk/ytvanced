package defpackage;

/* renamed from: baxh */
public abstract class baxh implements baxu, bbel {
    public bazz s;
    public final Object t = new Object();
    public final bbht u;
    public int v;
    public boolean w;
    public boolean x;

    protected baxh(int i, bbho bbho, bbht bbht) {
        amqw.a((Object) bbho, (Object) "statsTraceCtx");
        this.u = (bbht) amqw.a((Object) bbht, (Object) "transportTracer");
        this.s = new bbem(this, baso.a, i, bbho, bbht);
    }

    public abstract bbhq a();

    public final void a(bbhp bbhp) {
        a().a(bbhp);
    }

    public final void b() {
        Object obj;
        synchronized (this.t) {
            synchronized (this.t) {
                obj = null;
                if (this.w && this.v < 32768) {
                    if (!this.x) {
                        obj = 1;
                    }
                }
            }
        }
        if (obj != null) {
            a().a();
        }
    }
}

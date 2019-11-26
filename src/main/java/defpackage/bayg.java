package defpackage;

/* renamed from: bayg */
final class bayg extends bbbu {
    private final bazv a;
    private final /* synthetic */ bayd b;

    bayg(bayd bayd, bazv bazv, String str) {
        this.b = bayd;
        this.a = (bazv) amqw.a((Object) bazv, (Object) "delegate");
        amqw.a((Object) str, (Object) "authority");
    }

    /* Access modifiers changed, original: protected|final */
    public final bazv a() {
        return this.a;
    }

    public final bazo a(bauw bauw, baum baum, barv barv) {
        bazo bbbq;
        baru baru = barv.e;
        if (baru == null) {
            return this.a.a(bauw, baum, barv);
        }
        bbeu bbeu = new bbeu();
        bayf bayf = new bayf();
        try {
            amql.a(barv.c, this.b.a);
            baru.a();
        } catch (Throwable th) {
            bavx b = bavx.f.a("Credentials should use fail() instead of throwing exceptions").b(th);
            boolean z = true;
            amqw.a(b.a() ^ 1, (Object) "Cannot fail with OK status");
            amqw.b(bbeu.c ^ 1, (Object) "apply() or fail() already called");
            bbbq = new bbbq(b);
            amqw.b(bbeu.c ^ 1, (Object) "already finalized");
            bbeu.c = true;
            synchronized (bbeu.a) {
                if (bbeu.b == null) {
                    bbeu.b = bbbq;
                } else {
                    if (bbeu.d == null) {
                        z = false;
                    }
                    amqw.b(z, (Object) "delayedStream is null");
                    bbeu.d.a(bbbq);
                }
            }
        }
        synchronized (bbeu.a) {
            bbbq = bbeu.b;
            if (bbbq == null) {
                bbeu.d = new bbah();
                bbbq = bbeu.d;
                bbeu.b = bbbq;
            }
        }
        return bbbq;
    }
}

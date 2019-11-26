package defpackage;

/* renamed from: wdl */
final class wdl implements wfh, wfi {
    private final akvy a;
    private final wdj b;
    private final wkt c;
    private final String d;
    private final /* synthetic */ wda e;

    wdl(wda wda, akvy akvy, wdj wdj, wkt wkt, String str) {
        this.e = wda;
        this.a = akvy;
        this.b = (wdj) amqw.a((Object) wdj);
        this.c = (wkt) amqw.a((Object) wkt);
        this.d = (String) amqw.a((Object) str);
    }

    public final String a() {
        return this.d;
    }

    public final void a(akbo akbo) {
        this.c.d();
        this.e.e.a(akbo.b, wda.a(this.a));
        akbn akbn = akbo.a;
        if (akbn != null) {
            ajsn ajsn = akbn.a;
            if (ajsn != null) {
                this.b.b.c(ajsn);
            }
        }
    }

    public final void a(bqn bqn) {
        c(bqn);
    }

    public final void a(akbm akbm) {
        this.c.d();
        this.e.e.a(akbm.c, wda.a(this.a));
        akbl akbl = akbm.a;
        if (akbl != null) {
            ajsn ajsn = akbl.a;
            if (ajsn == null) {
                return;
            }
            wdj wdj;
            if (akbm.b) {
                wdj = this.b;
                wdj.b.a(ajsn, wdj.c);
                return;
            }
            wdj = this.b;
            wdj.b.b(wdj.c, ajsn);
        }
    }

    public final void b(bqn bqn) {
        c(bqn);
    }

    private final void c(bqn bqn) {
        wda wda = this.e;
        wkt wkt = this.c;
        wda.a(wkt, bqn, this.b, this.a, null, this.d, wkt.n);
    }
}

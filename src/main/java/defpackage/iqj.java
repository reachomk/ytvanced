package defpackage;

/* renamed from: iqj */
final class iqj extends afsx {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ String f;
    private final /* synthetic */ iqe g;

    iqj(iqe iqe, boolean z, String str) {
        this.g = iqe;
        this.a = z;
        this.f = str;
    }

    public final void a(bqn bqn) {
        iqe iqe = this.g;
        iqe.v = null;
        xst b = iqe.g.b(bqn);
        this.g.o.a(b.a, true);
        if (!this.a) {
            this.g.i();
        }
        gyi.a(this.g.p, b.b);
        this.g.l.b("sr_e", atyw.LATENCY_ACTION_SEARCH_UI, "");
    }
}

package defpackage;

/* renamed from: ahud */
final /* synthetic */ class ahud implements ahts {
    private final ahtv a;

    public ahud(ahtv ahtv) {
        this.a = ahtv;
    }

    public final void a(long j) {
        ahtv ahtv = this.a;
        ahtv.a.post(new ahtz(ahtv, j));
        ahtv.h();
    }
}

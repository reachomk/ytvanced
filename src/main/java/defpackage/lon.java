package defpackage;

/* renamed from: lon */
final /* synthetic */ class lon implements loj {
    private final lla a;
    private final lpm b;
    private final lla c;

    lon(lla lla, lpm lpm, lla lla2) {
        this.a = lla;
        this.b = lpm;
        this.c = lla2;
    }

    public final void a() {
        lla lla = this.a;
        lpm lpm = this.b;
        lla lla2 = this.c;
        lla.b(lpm);
        lla2.b(lpm);
    }
}

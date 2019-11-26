package defpackage;

/* renamed from: jgr */
final class jgr implements exv {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ jgp b;

    jgr(jgp jgp, boolean z) {
        this.b = jgp;
        this.a = z;
    }

    public final void a() {
        jgp jgp = this.b;
        jgp.b.addCaptioningChangeListener(jgp.c);
        if (!this.a) {
            this.b.a();
        }
    }

    public final void b() {
        jgp jgp = this.b;
        jgp.b.removeCaptioningChangeListener(jgp.c);
    }
}

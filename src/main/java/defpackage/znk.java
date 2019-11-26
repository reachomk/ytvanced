package defpackage;

/* renamed from: znk */
final /* synthetic */ class znk implements zmo {
    private final znf a;
    private final zmp b;

    znk(znf znf, zmp zmp) {
        this.a = znf;
        this.b = zmp;
    }

    public final void a() {
        znf znf = this.a;
        zmp zmp = this.b;
        synchronized (znf.a) {
            znf.a.remove(zmp);
        }
    }
}

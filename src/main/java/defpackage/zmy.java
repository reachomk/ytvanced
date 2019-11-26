package defpackage;

/* renamed from: zmy */
final /* synthetic */ class zmy implements zmo {
    private final zmt a;
    private final zmp b;

    zmy(zmt zmt, zmp zmp) {
        this.a = zmt;
        this.b = zmp;
    }

    public final void a() {
        zmt zmt = this.a;
        zmp zmp = this.b;
        synchronized (zmt.f) {
            zmt.f.remove(zmp);
        }
    }
}

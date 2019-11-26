package defpackage;

/* renamed from: zna */
final /* synthetic */ class zna implements zmo {
    private final zmt a;
    private final zms b;

    zna(zmt zmt, zms zms) {
        this.a = zmt;
        this.b = zms;
    }

    public final void a() {
        zmt zmt = this.a;
        zms zms = this.b;
        synchronized (zmt.d) {
            zmt.d.remove(zms);
        }
    }
}

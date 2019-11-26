package defpackage;

/* renamed from: zmz */
final /* synthetic */ class zmz implements zmo {
    private final zmt a;
    private final zml b;

    zmz(zmt zmt, zml zml) {
        this.a = zmt;
        this.b = zml;
    }

    public final void a() {
        zmt zmt = this.a;
        zml zml = this.b;
        synchronized (zmt.e) {
            zmt.e.remove(zml);
        }
    }
}

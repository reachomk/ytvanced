package defpackage;

/* renamed from: zmx */
final /* synthetic */ class zmx implements zmo {
    private final zmt a;
    private final zmr b;

    zmx(zmt zmt, zmr zmr) {
        this.a = zmt;
        this.b = zmr;
    }

    public final void a() {
        zmt zmt = this.a;
        zmr zmr = this.b;
        synchronized (zmt.g) {
            zmt.g.remove(zmr);
        }
    }
}

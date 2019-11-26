package defpackage;

/* renamed from: vil */
final /* synthetic */ class vil implements Runnable {
    private final vii a;
    private final vir b;
    private final vik c;
    private final vio d;
    private final vis e;
    private final boolean f;

    vil(vii vii, vir vir, vik vik, vio vio, vis vis, boolean z) {
        this.a = vii;
        this.b = vir;
        this.c = vik;
        this.d = vio;
        this.e = vis;
        this.f = z;
    }

    public final void run() {
        vii vii = this.a;
        vir vir = this.b;
        vik vik = this.c;
        vio vio = this.d;
        vis vis = this.e;
        try {
            vii.a((vio) vir.get(((Integer) vir.a.get()).intValue()), vik, vio, vis, this.f);
        } catch (Exception unused) {
            vis.a(null);
        }
    }
}

package defpackage;

/* renamed from: vjg */
final class vjg implements vrh {
    private final /* synthetic */ String a;
    private final /* synthetic */ vsm b;
    private final /* synthetic */ vso c;
    private final /* synthetic */ viz d;

    vjg(viz viz, String str, vsm vsm, vso vso) {
        this.d = viz;
        this.a = str;
        this.b = vsm;
        this.c = vso;
    }

    public final void a(int i, int i2) {
        ((vgz) this.d.h.get()).b(this.a, this.b, this.c, vra.USER_SKIPPED, i, i2);
    }

    public final void a() {
        ((vgz) this.d.h.get()).b(this.a, this.b, this.c, vra.USER_MUTED, -1, -1);
    }
}

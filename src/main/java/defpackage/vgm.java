package defpackage;

@Deprecated
/* renamed from: vgm */
public final class vgm implements vrh {
    private final String a;
    private final vsm b;
    private final vso c;
    private final /* synthetic */ vge d;

    public vgm(vge vge, String str, vsm vsm, vso vso) {
        this.d = vge;
        this.a = str;
        this.b = vsm;
        this.c = vso;
    }

    public final void a(int i, int i2) {
        ((vjr) this.d.a.get()).a(this.a, this.b, this.c, vra.USER_SKIPPED, i, i2);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.d.m.a);
    }

    public final void a() {
        ((vjr) this.d.a.get()).a(this.a, this.b, this.c, vra.USER_MUTED, -1, -1);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.d.m.a);
    }
}

package defpackage;

/* renamed from: vgo */
public final class vgo implements ajpb {
    private final String a;
    private final vsm b;
    private final vso c;
    private final /* synthetic */ vge d;

    public vgo(vge vge, String str, vsm vsm, vso vso) {
        this.d = vge;
        this.a = str;
        this.b = vsm;
        this.c = vso;
    }

    public final void a() {
        ((vjr) this.d.a.get()).a(this.a, this.b, this.c, vra.VIDEO_ENDED, -1, -1);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.d.m.a);
    }

    public final void b() {
        ((vjr) this.d.a.get()).a(this.a, this.b, this.c, vra.VIDEO_ERROR, -1, -1);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.d.m.a);
    }
}

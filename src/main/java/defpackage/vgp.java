package defpackage;

/* renamed from: vgp */
public final class vgp implements vdp {
    private final String a;
    private final vsm b;
    private final vso c;
    private final /* synthetic */ vge d;

    public vgp(vge vge, String str, vsm vsm, vso vso) {
        this.d = vge;
        this.a = str;
        this.b = vsm;
        this.c = vso;
    }

    public final void a(vra vra) {
        vgd vgd = this.d.m;
        if (vgd == null) {
            afpc.a(2, afpf.ad, "Had null ContentVideoState when trying to complete nonVideoAd");
            return;
        }
        vgd.a(null);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.c, vra, -1, -1);
        ((vjr) this.d.a.get()).a(this.a, this.b, this.d.m.a);
    }

    public final vso a() {
        return this.c;
    }
}

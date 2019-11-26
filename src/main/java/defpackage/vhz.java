package defpackage;

/* renamed from: vhz */
final /* synthetic */ class vhz implements vij {
    private final vhu a;
    private final vso b;

    vhz(vhu vhu, vso vso) {
        this.a = vhu;
        this.b = vso;
    }

    public final void a(boolean z) {
        vhu vhu = this.a;
        vso vso = this.b;
        if (z) {
            vhu.a.a(vhu.f, vhu.g, vhu.h, vso);
            vsl vsl = (vsl) vso;
            vhu.i.a(vsl.i(), vsl.j, new vig(vhu, vsl));
            return;
        }
        vhu.f();
    }
}

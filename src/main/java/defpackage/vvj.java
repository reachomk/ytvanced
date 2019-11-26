package defpackage;

/* renamed from: vvj */
final /* synthetic */ class vvj implements bcvk {
    private final vvh a;

    vvj(vvh vvh) {
        this.a = vvh;
    }

    public final void a(Object obj) {
        vvh vvh = this.a;
        ahkn ahkn = (ahkn) obj;
        if (vvh.h) {
            vvh.f = ahkn.a == airi.INTERSTITIAL_PLAYING;
            if (!ahkn.a.a()) {
                vvh.l();
            }
        }
    }
}

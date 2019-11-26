package defpackage;

/* renamed from: adsr */
final /* synthetic */ class adsr implements bcvk {
    private final adss a;

    adsr(adss adss) {
        this.a = adss;
    }

    public final void a(Object obj) {
        adss adss = this.a;
        ahkn ahkn = (ahkn) obj;
        if (!adss.a.h) {
            if (ahkn.a.a(airi.VIDEO_PLAYING) && adss.a.d.a() == 1) {
                adss.a.d();
            }
        }
    }
}

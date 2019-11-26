package defpackage;

/* renamed from: amhh */
final /* synthetic */ class amhh implements bbnw {
    private final amhf a;
    private final ajzr b;

    amhh(amhf amhf, ajzr ajzr) {
        this.a = amhf;
        this.b = ajzr;
    }

    public final void accept(Object obj) {
        amhf amhf = this.a;
        ajzr ajzr = this.b;
        amdz amdz = (amdz) obj;
        amdz.e(ajzr.a);
        for (aqrc aqrc : ajzr.b.a.b) {
            if ((aqrc.a & 1) != 0) {
                ayhc ayhc = aqrc.b;
                if (ayhc == null) {
                    ayhc = ayhc.e;
                }
                amdz.d(ayhc.c);
                ayhc = aqrc.b;
                if (ayhc == null) {
                    ayhc = ayhc.e;
                }
                amdz.h(amjq.a((long) ayhc.b, amhf.a));
                return;
            }
        }
    }
}

package defpackage;

/* renamed from: ahvy */
final /* synthetic */ class ahvy implements bcvk {
    private final ahvz a;

    ahvy(ahvz ahvz) {
        this.a = ahvz;
    }

    public final void a(Object obj) {
        ahwc ahwc;
        ahvz ahvz = this.a;
        ahkf ahkf = (ahkf) obj;
        aafv aafv = ahkf.c;
        awfu awfu = null;
        if (aafv != null) {
            akcb akcb = aafv.a;
            if (akcb != null) {
                ajxr ajxr = akcb.e;
                if (ajxr != null) {
                    ajxs ajxs = ajxr.b;
                    if (ajxs != null) {
                        awfi awfi = ajxs.b;
                        if (!(awfi == null || (awfi.a & 1) == 0)) {
                            awfu = awfi.b;
                            if (awfu == null) {
                                awfu = awfu.e;
                            }
                        }
                    }
                }
            }
        }
        if (ahkf.e == 2) {
            ahwc = ahvz.b;
            if (ahwc != null) {
                ahpa ahpa = ahwc.j;
                if (ahpa != null) {
                    ahph ahph = ahpa.k;
                    if (ahph != null) {
                        ahph.removeAllViews();
                    }
                }
            }
        }
        if (awfu != null) {
            int min = Math.min(4, awfu.b.size());
            ahvz.c = new awfw[min];
            System.arraycopy(awfu.b.toArray(new awfw[0]), 0, ahvz.c, 0, min);
            ahwc = ahvz.b;
            if (ahwc != null) {
                ahwc.a(ahvz.c);
            }
            ahvz.a.a(awfu.d.d());
        }
    }
}

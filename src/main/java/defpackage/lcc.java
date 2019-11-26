package defpackage;

/* renamed from: lcc */
final /* synthetic */ class lcc implements bcvk {
    private final lcd a;

    lcc(lcd lcd) {
        this.a = lcd;
    }

    public final void a(Object obj) {
        lcd lcd = this.a;
        aafv aafv = ((ahkf) obj).c;
        apji apji = null;
        if (aafv != null) {
            akcb akcb = aafv.a;
            if (akcb != null) {
                ajxr ajxr = akcb.e;
                if (ajxr != null) {
                    ajxs ajxs = ajxr.b;
                    if (!(ajxs == null || ajxs.n == null)) {
                        apji = (apji) ajzv.a(aafv.j.n, apji.class);
                    }
                }
            }
        }
        if (apji != null) {
            anyd anyd = apji.a;
            if (!anyd.isEmpty()) {
                awzv awzv = ((apjj) anyd.get(0)).b;
                if (awzv == null) {
                    awzv = awzv.d;
                }
                lcd.a = awzv;
                lcd.d();
            }
        }
    }
}

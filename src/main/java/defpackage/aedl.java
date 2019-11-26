package defpackage;

/* renamed from: aedl */
public final class aedl extends wxo {
    public zyw a;
    public aedf b;

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        apxn a = this.a.a();
        aoth a2 = aekx.a(a);
        if (a2 != null && a2.f) {
            aedf aedf = this.b;
            aosn aosn = null;
            if (a != null) {
                aosl aosl = a.d;
                if (aosl == null) {
                    aosl = aosl.f;
                }
                if ((aosl.a & 2) != 0) {
                    aosl = a.d;
                    if (aosl == null) {
                        aosl = aosl.f;
                    }
                    if ((aosl.a & 2) != 0) {
                        aosl aosl2 = a.d;
                        if (aosl2 == null) {
                            aosl2 = aosl.f;
                        }
                        aosn = aosl2.c;
                        if (aosn == null) {
                            aosn = aosn.c;
                        }
                    }
                }
            }
            boolean z = true;
            if (!(aosn == null || (aosn.a & 1) == 0)) {
                avjo avjo = aosn.b;
                if (avjo == null) {
                    avjo = avjo.d;
                }
                if (!avjo.c) {
                    z = false;
                }
            }
            aedf.a(z);
        }
    }
}

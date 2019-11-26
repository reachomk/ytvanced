package defpackage;

/* renamed from: amig */
final class amig extends alyx {
    private final /* synthetic */ ayuq a;

    amig(ayuq ayuq) {
        this.a = ayuq;
    }

    public final void a(amdz amdz) {
        int a = amem.a(((amea) amdz.instance).H);
        if (a == 0 || a == 1) {
            a = ayus.a(this.a.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 1) {
                amdz.b(3);
            } else if (a == 2) {
                amdz.b(4);
            } else if (a == 3) {
                amdz.b(5);
            } else if (a == 4) {
                amdz.b(6);
            }
        }
    }
}

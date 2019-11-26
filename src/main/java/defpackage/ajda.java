package defpackage;

/* renamed from: ajda */
final class ajda implements Runnable {
    private final /* synthetic */ ajcx a;

    public final void run() {
        ajcx ajcx = this.a;
        xak.b();
        aaye a = ajcx.a.a();
        a.j = ajcx.b;
        a.b = ajcx.d.b;
        a.a(ajcx.e);
        a.c(ajcx.f);
        a.c = ajcx.h;
        try {
            atce a2 = ajcx.a.a(a);
            ajcx.h++;
            if ((a2.a & 2) != 0) {
                atdv atdv = a2.c;
                if (atdv == null) {
                    atdv = atdv.o;
                }
                if (aiqr.a(atdv)) {
                    ajcx.c();
                    return;
                }
                int a3 = awah.a(atdv.b);
                if (a3 != 0 && a3 == 2) {
                    ajcx.a(null, 7);
                    return;
                } else {
                    ajcx.a(new ahjc(9, true, atdv.c));
                    return;
                }
            }
            ajcx.a(null, 7);
        } catch (aanq e) {
            ajcx.a(e, 8);
        }
    }

    /* synthetic */ ajda(ajcx ajcx) {
        this.a = ajcx;
    }
}

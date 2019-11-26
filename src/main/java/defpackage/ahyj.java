package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ahyj */
final class ahyj implements ajpc {
    private final /* synthetic */ ahkn a;
    private final /* synthetic */ ahyk b;

    ahyj(ahyk ahyk, ahkn ahkn) {
        this.b = ahyk;
        this.a = ahkn;
    }

    public final void a() {
    }

    public final int b() {
        return 0;
    }

    public final void a(ajpa ajpa) {
        this.b.a.execute(new ahym(this, this.a, ajpa));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(ahkn ahkn, ajpa ajpa) {
        ahkn ahkn2 = ahkn;
        ahyk ahyk = this.b;
        ajqi g = ahkn2.d.g();
        aakj aakj = ahkn2.b;
        String str = ahkn2.e;
        if (!aipo.i(ahyk.b)) {
            g.a(aakj, str);
        }
        attz[] attzArr = aakj.a.A;
        long toMillis = TimeUnit.SECONDS.toMillis((long) aakj.h());
        long j = aakj.c.e;
        Object obj = null;
        Object obj2 = null;
        for (attz attz : attzArr) {
            if (attz.c.size() != 0) {
                if (obj == null && ahyk.a(attz)) {
                    g.a(0, 0, ahyk.a(g, attz, j));
                    obj = 1;
                } else if (toMillis > 0 && obj2 == null && (attz.a & 1) != 0) {
                    atub atub = attz.b;
                    if (atub == null) {
                        atub = atub.c;
                    }
                    int a = attv.a(atub.b);
                    if (a != 0 && a == 3) {
                        g.a(toMillis, toMillis, ahyk.a(g, attz, j));
                        obj2 = 1;
                    }
                }
            }
        }
        ajpa.a();
    }
}

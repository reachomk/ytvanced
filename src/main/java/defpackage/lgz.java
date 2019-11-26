package defpackage;

import java.util.Collection;

/* renamed from: lgz */
final /* synthetic */ class lgz implements xtr {
    private final lgw a;
    private final int b;

    lgz(lgw lgw, int i) {
        this.a = lgw;
        this.b = i;
    }

    public final void a(xtu xtu, int i) {
        lgw lgw = this.a;
        int i2 = this.b;
        Collection d = xtu.d();
        int size = d.size();
        int c = xtu.c();
        int i3 = c - 1;
        if (c != 0) {
            if (i3 == 0) {
                c = d.size();
                for (size = 0; size < c; size++) {
                    enm enm = (enm) lgw.a(i2, i + size);
                    enm enm2 = (enm) d.get(size);
                    if (!enj.a(enm, enm2.d())) {
                        break;
                    }
                    ((enk) enm).a(enm2.d());
                }
            } else if (i3 == 1) {
                lgw.a(i2, i, size);
                lgw.a(i2, i, d);
                return;
            } else if (i3 == 2) {
                lgw.a(i2, i, d);
                return;
            } else if (i3 == 3) {
                lgw.a(i2, i, size);
                return;
            }
            return;
        }
        throw null;
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: vhw */
final /* synthetic */ class vhw implements vij {
    private final vhu a;
    private final int b;
    private final anjv c;
    private final boolean d;
    private final boolean e;

    vhw(vhu vhu, int i, anjv anjv, boolean z, boolean z2) {
        this.a = vhu;
        this.b = i;
        this.c = anjv;
        this.d = z;
        this.e = z2;
    }

    public final void a(boolean z) {
        vhu vhu = this.a;
        int i = this.b;
        anjv anjv = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        if (z) {
            long j;
            if (i > 0) {
                vhu.a.a(vhu.f, vhu.g, vhu.h);
            } else {
                vhu.a.b(vhu.f, vhu.g, vhu.h);
            }
            anjv.a(new vid(vhu, z2, anjv), vhu.e);
            aopb a;
            if (z3) {
                a = wcf.a(vhu.c);
                if (a == null) {
                    j = 0;
                } else {
                    j = (long) a.j;
                }
                if (j == 0) {
                    j = 1500;
                }
            } else {
                a = wcf.a(vhu.c);
                j = a != null ? (long) a.i : 0;
                if (j == 0) {
                    j = 5000;
                }
            }
            anjf.a(anjv, j, TimeUnit.MILLISECONDS, vhu.d);
            return;
        }
        vhu.f();
    }
}

package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nzi */
final class nzi implements Runnable {
    public final oad a;
    public final int b;
    public final int c;
    public final boolean d;
    private final CopyOnWriteArrayList e;
    private final ous f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public nzi(oad oad, oad oad2, CopyOnWriteArrayList copyOnWriteArrayList, ous ous, boolean z, int i, int i2, boolean z2, boolean z3) {
        this.a = oad;
        this.e = new CopyOnWriteArrayList(copyOnWriteArrayList);
        this.f = ous;
        this.g = z;
        this.b = i;
        this.c = i2;
        this.h = z2;
        this.d = z3;
        z = false;
        this.i = oad2.f != oad.f;
        boolean z4 = (oad2.a == oad.a && oad2.b == oad.b) ? false : true;
        this.j = z4;
        this.k = oad2.g != oad.g;
        if (oad2.i != oad.i) {
            z = true;
        }
        this.l = z;
    }

    public final void run() {
        if (this.j || this.c == 0) {
            nyz.a(this.e, new nzh(this));
        }
        if (this.g) {
            nyz.a(this.e, new nzk(this));
        }
        if (this.l) {
            this.f.a(this.a.i.d);
            nyz.a(this.e, new nzj(this));
        }
        if (this.k) {
            nyz.a(this.e, new nzm(this));
        }
        if (this.i) {
            nyz.a(this.e, new nzl(this));
        }
        if (this.h) {
            nyz.a(this.e, nzo.a);
        }
    }
}

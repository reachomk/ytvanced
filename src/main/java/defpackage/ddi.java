package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ddi */
public final class ddi {
    public int a;
    public boolean b;
    public List c;
    public final ddh d = new ddh(this);
    private int e;
    private int f;
    private int g;
    private int h;
    private final czo i;

    ddi(int i, int i2, czo czo) {
        this.a = i;
        this.e = i2;
        this.f = czo.f();
        this.g = czo.g();
        this.h = czo.h();
        this.i = czo;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        int d = this.i.d();
        int i_ = this.i.i_();
        int f = this.i.f();
        int g = this.i.g();
        int h = this.i.h();
        if (d >= 0 && i_ >= 0 && (d != this.a || i_ != this.e || f != this.f || g != this.g || h != this.h || i == 1)) {
            this.a = d;
            this.e = i_;
            this.f = f;
            this.g = g;
            this.h = h;
            this.b = false;
            List list = this.c;
            if (!(list == null || list.isEmpty())) {
                int size = this.c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ddf) this.c.get(i2)).a(d, i_, f, g, i);
                }
            }
        }
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (!(this.b || z)) {
            z2 = false;
        }
        this.b = z2;
    }

    /* JADX WARNING: Missing block: B:9:0x0019, code skipped:
            return true;
     */
    public final boolean a(int r4, int r5) {
        /*
        r3 = this;
        r0 = r3.a();
        r1 = 1;
        if (r0 != 0) goto L_0x0019;
    L_0x0007:
        r0 = -1;
        if (r5 == r0) goto L_0x0019;
    L_0x000a:
        r2 = r3.a;
        r2 = r2 + r5;
        r2 = r2 + r0;
        r5 = r3.e;
        r5 = java.lang.Math.max(r2, r5);
        if (r4 > r5) goto L_0x0017;
    L_0x0016:
        return r1;
    L_0x0017:
        r4 = 0;
        return r4;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.a(int, int):boolean");
    }

    /* Access modifiers changed, original: final */
    public final boolean b(int i, int i2) {
        if (a()) {
            return true;
        }
        int i3 = i;
        while (i3 < i + i2) {
            if (this.a <= i3 && i3 <= this.e) {
                return true;
            }
            i3++;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(int i) {
        if (a() || i <= this.e) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a < 0 || this.e < 0 || this.b;
    }

    public final void a(ddf ddf) {
        if (ddf != null) {
            if (this.c == null) {
                this.c = new ArrayList(2);
            }
            this.c.add(ddf);
        }
    }
}

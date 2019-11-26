package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fmb */
final class fmb extends apc {
    public final List a = new ArrayList();
    public fmd b;
    public int c;
    public int d;
    private final apa e;
    private final fmc f;
    private final boolean g;

    fmb(apa apa, fmc fmc) {
        this.e = (apa) amqw.a((Object) apa);
        this.f = (fmc) amqw.a((Object) fmc);
        this.g = apa.b;
        apa.a((apc) this);
        b();
    }

    public final void a() {
        i();
    }

    public final void a(int i, int i2) {
        f(i, i2);
    }

    public final void a(int i, int i2, Object obj) {
        f(i, i2);
    }

    public final void b(int i, int i2) {
        int a = a(i);
        Object obj;
        if (a < this.a.size()) {
            e(a, i2);
            obj = 1;
        } else {
            obj = null;
        }
        if (a(a, i, (i2 + i) - 1) || obj != null) {
            fmd fmd = this.b;
            if (fmd != null) {
                fmd.a();
            }
        }
    }

    public final void c(int i, int i2) {
        int a = a(i);
        while (a < this.a.size()) {
            int i3 = ((fme) this.a.get(a)).b;
            if (i3 < i || i3 >= i + i2) {
                break;
            }
            b(a);
        }
        if (a < this.a.size()) {
            e(a, -i2);
            fmd fmd = this.b;
            if (fmd != null) {
                fmd.a();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.c = -1;
        this.d = -1;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        int i = this.c;
        if (i == -1) {
            return e();
        }
        i++;
        if (i < this.a.size()) {
            return ((fme) this.a.get(i)).b;
        }
        return -1;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        int i = this.c;
        if (i == -1) {
            return !this.a.isEmpty() ? ((fme) this.a.get(0)).a : 0;
        } else {
            i++;
            if (i < this.a.size()) {
                return ((fme) this.a.get(i)).a;
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        return !this.a.isEmpty() ? ((fme) this.a.get(0)).b : -1;
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        int i = this.c;
        return i != -1 ? ((fme) this.a.get(i)).a : 0;
    }

    /* Access modifiers changed, original: final */
    public final long g() {
        int i = this.c;
        return i != -1 ? ((fme) this.a.get(i)).c : Long.MAX_VALUE;
    }

    /* Access modifiers changed, original: final */
    public final boolean h() {
        return this.a.isEmpty() ^ 1;
    }

    public final int a(int i) {
        i = Collections.binarySearch(this.a, new fme(0, i, Long.MAX_VALUE));
        return i < 0 ? -(i + 1) : i;
    }

    public final void i() {
        this.a.clear();
        for (int i = 0; i < this.e.a(); i++) {
            int a = this.f.a(i);
            if (!fma.a(a)) {
                this.a.add(new fme(a, i, c(i)));
            }
        }
        fmd fmd = this.b;
        if (fmd != null) {
            fmd.a();
        }
    }

    private final void e(int i, int i2) {
        while (i < this.a.size()) {
            fme fme = (fme) this.a.get(i);
            fme.b += i2;
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A:{SYNTHETIC, EDGE_INSN: B:35:0x0083->B:26:0x0083 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Missing block: B:29:0x008d, code skipped:
            if (a(r0, r6, r1 - 1) != false) goto L_0x0092;
     */
    private final void f(int r6, int r7) {
        /*
        r5 = this;
        r7 = r7 + r6;
        r7 = r7 + -1;
        r0 = r5.a(r7);
        r1 = r5.a;
        r1 = r1.size();
        r2 = 1;
        if (r0 == r1) goto L_0x0012;
    L_0x0010:
        r7 = 0;
        goto L_0x002f;
    L_0x0012:
        r1 = r5.a;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0028;
    L_0x001a:
        r1 = r5.a;
        r3 = r0 + -1;
        r1 = r1.get(r3);
        r1 = (defpackage.fme) r1;
        r1 = r1.b;
        r1 = r1 + r2;
        goto L_0x0029;
    L_0x0028:
        r1 = r6;
    L_0x0029:
        r7 = r5.a(r0, r1, r7);
        r0 = r0 + -1;
    L_0x002f:
        if (r0 < 0) goto L_0x0090;
    L_0x0031:
        r1 = r5.a;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x0090;
    L_0x0039:
        r1 = r5.a;
        r1 = r1.get(r0);
        r1 = (defpackage.fme) r1;
    L_0x0041:
        r3 = r1.b;
        if (r3 < r6) goto L_0x0083;
    L_0x0045:
        r4 = r5.f;
        r3 = r4.a(r3);
        r4 = defpackage.fma.a(r3);
        if (r4 == 0) goto L_0x0056;
    L_0x0051:
        r5.b(r0);
    L_0x0054:
        r7 = 1;
        goto L_0x005d;
    L_0x0056:
        r4 = r1.a;
        if (r3 == r4) goto L_0x005d;
    L_0x005a:
        r1.a = r3;
        goto L_0x0054;
    L_0x005d:
        if (r0 == 0) goto L_0x0083;
    L_0x005f:
        r3 = r0 + -1;
        r4 = r5.a;
        r4 = r4.get(r3);
        r4 = (defpackage.fme) r4;
        r4 = r4.b;
        r4 = r4 + r2;
        r1 = r1.b;
        r1 = r1 + -1;
        r0 = r5.a(r0, r4, r1);
        if (r0 != 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0078;
    L_0x0077:
        r7 = 1;
    L_0x0078:
        r0 = r5.a;
        r0 = r0.get(r3);
        r1 = r0;
        r1 = (defpackage.fme) r1;
        r0 = r3;
        goto L_0x0041;
    L_0x0083:
        r1 = r1.b;
        if (r6 >= r1) goto L_0x0090;
    L_0x0087:
        r1 = r1 + -1;
        r6 = r5.a(r0, r6, r1);
        if (r6 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0092;
    L_0x0090:
        if (r7 == 0) goto L_0x0099;
    L_0x0092:
        r6 = r5.b;
        if (r6 == 0) goto L_0x0099;
    L_0x0096:
        r6.a();
    L_0x0099:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmb.f(int, int):void");
    }

    private final void b(int i) {
        this.a.remove(i);
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z = false;
        while (i3 >= i2) {
            int a = this.f.a(i3);
            if (!fma.a(a)) {
                this.a.add(i, new fme(a, i3, c(i3)));
                z = true;
            }
            i3--;
        }
        return z;
    }

    private final long c(int i) {
        if (this.g) {
            return this.e.b(i);
        }
        return this.f.b(i);
    }
}

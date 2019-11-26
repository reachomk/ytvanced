package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: hzd */
public final class hzd extends aimh implements ahli, ahlj, OnLayoutChangeListener, eib {
    private final fos a;
    private final zzl b;
    private final zyw c;
    private final ahlm d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public hzd(fos fos, zzl zzl, ails ails, zyw zyw, ahlm ahlm) {
        super(ails);
        this.a = fos;
        this.b = zzl;
        this.c = zyw;
        this.d = (ahlm) amqw.a((Object) ahlm);
    }

    public final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            c();
        }
    }

    public final void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            c();
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i8 -= i6;
        i3 -= i;
        i4 -= i2;
        if (i7 - i5 != i3 || i8 != i4) {
            boolean z = false;
            if (!(this.f == (i4 > i3) && this.g == this.a.isInMultiWindowMode())) {
                boolean d = d();
                if (i4 > i3) {
                    z = true;
                }
                this.f = z;
                this.g = this.a.isInMultiWindowMode();
                if (d != d()) {
                    c();
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return !d() && super.a();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:14:0x0026, code skipped:
            if (r0.bc != false) goto L_0x002b;
     */
    public final int a(defpackage.airi r2) {
        /*
        r1 = this;
        r0 = defpackage.airi.ENDED;
        if (r2 != r0) goto L_0x002b;
    L_0x0004:
        r0 = r1.e;
        if (r0 != 0) goto L_0x002b;
    L_0x0008:
        r0 = r1.d;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0015;
    L_0x0011:
        r0 = r1.h;
        if (r0 == 0) goto L_0x0029;
    L_0x0015:
        r0 = r1.c;
        r0 = r0.a();
        if (r0 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0029;
    L_0x001e:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0024;
    L_0x0022:
        r0 = defpackage.aulu.bw;
    L_0x0024:
        r0 = r0.bc;
        if (r0 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002b;
    L_0x0029:
        r2 = 2;
        return r2;
    L_0x002b:
        if (r2 == 0) goto L_0x0037;
    L_0x002d:
        r0 = defpackage.airi.READY;
        r2 = r2.a(r0);
        if (r2 == 0) goto L_0x0037;
    L_0x0035:
        r2 = 1;
        return r2;
    L_0x0037:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzd.a(airi):int");
    }

    /* JADX WARNING: Missing block: B:6:0x0012, code skipped:
            if (r0.Y != false) goto L_0x0019;
     */
    private final boolean d() {
        /*
        r2 = this;
        r0 = r2.c;
        r0 = r0.a();
        r1 = 1;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0015;
    L_0x000a:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.aulu.bw;
    L_0x0010:
        r0 = r0.Y;
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0019;
    L_0x0015:
        r0 = r2.e;
        if (r0 != 0) goto L_0x0036;
    L_0x0019:
        r0 = r2.g;
        if (r0 != 0) goto L_0x0021;
    L_0x001d:
        r0 = r2.f;
        if (r0 == 0) goto L_0x0034;
    L_0x0021:
        r0 = r2.b;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = r0.e;
        if (r0 != 0) goto L_0x002f;
    L_0x002d:
        r0 = defpackage.aume.af;
    L_0x002f:
        r0 = r0.H;
        if (r0 == 0) goto L_0x0034;
    L_0x0033:
        return r1;
    L_0x0034:
        r0 = 0;
        return r0;
    L_0x0036:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzd.d():boolean");
    }

    public final void a(eja eja) {
        b();
    }
}

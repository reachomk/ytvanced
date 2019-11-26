package defpackage;

import android.text.TextUtils;

/* renamed from: lvk */
public final class lvk extends ekk implements xcp {
    private final xci a;
    private final bcaa b;
    private final bcaa c;
    private final zzl d;
    private final bcaa e;

    public lvk(elm elm, xci xci, bcaa bcaa, bcaa bcaa2, zzl zzl, bcaa bcaa3) {
        super(elm);
        this.a = xci;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = zzl;
        this.e = bcaa3;
    }

    public final void A_() {
        this.a.a((Object) this);
    }

    public final void ar_() {
        this.a.b(this);
    }

    private final boolean c() {
        eja c = ((lum) this.c.get()).c();
        if (c == null || !c.d()) {
            return false;
        }
        String c2 = c.c();
        if (!(c2 == null || TextUtils.equals("", c2))) {
            if (!TextUtils.equals("PPSV", c.c())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Missing block: B:14:0x0037, code skipped:
            if (r3.k != false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:16:0x003e, code skipped:
            if (r4.d() != false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:17:0x0040, code skipped:
            ((defpackage.lci) r2.e.get()).g();
     */
    public final java.lang.Class[] a(java.lang.Class r3, java.lang.Object r4, int r5) {
        /*
        r2 = this;
        r3 = -1;
        r0 = 1;
        r1 = 0;
        if (r5 == r3) goto L_0x008b;
    L_0x0005:
        if (r5 == 0) goto L_0x0078;
    L_0x0007:
        if (r5 != r0) goto L_0x005f;
    L_0x0009:
        r4 = (defpackage.agll) r4;
        r3 = r4.a;
        r4 = r2.c;
        r4 = r4.get();
        r4 = (defpackage.lum) r4;
        r4 = r4.c();
        if (r4 == 0) goto L_0x004c;
    L_0x001b:
        r5 = r4.b();
        r3 = android.text.TextUtils.equals(r5, r3);
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x004c;
    L_0x0026:
        r3 = r2.d;
        r3 = r3.b();
        if (r3 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x003a;
    L_0x002f:
        r3 = r3.h;
        if (r3 != 0) goto L_0x0035;
    L_0x0033:
        r3 = defpackage.avoa.w;
    L_0x0035:
        r3 = r3.k;
        if (r3 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0040;
    L_0x003a:
        r3 = r4.d();
        if (r3 == 0) goto L_0x004c;
    L_0x0040:
        r3 = r2.e;
        r3 = r3.get();
        r3 = (defpackage.lci) r3;
        r3.g();
        goto L_0x0097;
    L_0x004c:
        r3 = r2.c();
        if (r3 != 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0097;
    L_0x0053:
        r3 = r2.b;
        r3 = r3.get();
        r3 = (defpackage.aizy) r3;
        r3.e();
        return r1;
    L_0x005f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r0 = 32;
        r4.<init>(r0);
        r0 = "unsupported op code: ";
        r4.append(r0);
        r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4);
        throw r3;
    L_0x0078:
        r3 = r2.c();
        if (r3 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0097;
    L_0x007f:
        r3 = r2.b;
        r3 = r3.get();
        r3 = (defpackage.aizy) r3;
        r3.e();
        return r1;
    L_0x008b:
        r3 = 2;
        r1 = new java.lang.Class[r3];
        r3 = 0;
        r4 = defpackage.aglk.class;
        r1[r3] = r4;
        r3 = defpackage.agll.class;
        r1[r0] = r3;
    L_0x0097:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvk.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}

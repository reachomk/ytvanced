package defpackage;

/* renamed from: hyi */
public final class hyi extends hyd implements ejc {
    private final eif b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;

    public hyi(eif eif) {
        this.b = (eif) amqw.a((Object) eif);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.a(this);
        e();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b.b(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        e();
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        this.e = true;
        this.c = z;
        this.d = z2;
        e();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.e = false;
        e();
    }

    /* JADX WARNING: Missing block: B:14:0x0027, code skipped:
            if (r0 != null) goto L_0x002b;
     */
    private final void e() {
        /*
        r4 = this;
        r0 = r4.e;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0006:
        r0 = r4.b;
        r0 = r0.c();
        r0 = r0.a();
        if (r0 == 0) goto L_0x0019;
    L_0x0012:
        r3 = r4.c;
        if (r3 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r3 = 1;
        goto L_0x001a;
    L_0x0019:
        r3 = 0;
    L_0x001a:
        if (r0 != 0) goto L_0x0023;
    L_0x001c:
        r0 = r4.d;
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0023;
    L_0x0021:
        r0 = 1;
        goto L_0x0024;
    L_0x0023:
        r0 = 0;
    L_0x0024:
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x002b;
    L_0x0027:
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002b;
    L_0x002a:
        r1 = 0;
    L_0x002b:
        r4.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyi.e():void");
    }

    public static ajxs a(aafv aafv) {
        if (aafv != null) {
            akcb akcb = aafv.a;
            if (akcb != null) {
                ajxr ajxr = akcb.e;
                if (ajxr != null) {
                    return ajxr.b;
                }
            }
        }
        return null;
    }
}

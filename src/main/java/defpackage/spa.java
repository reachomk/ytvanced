package defpackage;

/* renamed from: spa */
final class spa extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public bapa b;
    @cue(a = 13)
    public sxd c;
    @cue(a = 13)
    public syl d;
    @cue(a = 14)
    private spc e = new spc();

    public spa() {
        super("ExpandableTextComponentFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri.a = Boolean.valueOf(false);
        this.e.a = (Boolean) cri.a;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016c  */
    public final defpackage.cma a(defpackage.cmg r23, int r24, int r25) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r0.b;
        r4 = r0.a;
        r5 = r0.d;
        r6 = r0.c;
        r7 = r0.e;
        r7 = r7.a;
        r8 = defpackage.spy.a(r23);
        r8.a(r4);
        r8.a(r5);
        r8.a(r6);
        r9 = defpackage.spe.a(r3, r7);
        r8.a(r9);
        r8 = r8.c();
        r8 = (defpackage.spy) r8;
        r9 = defpackage.cls.a(r23);
        r9.a(r8);
        r10 = r7.booleanValue();
        r11 = 0;
        if (r10 == 0) goto L_0x0054;
    L_0x003a:
        r10 = new baoh;
        r10.<init>();
        r12 = 16;
        r12 = r3.a(r12);
        if (r12 == 0) goto L_0x006e;
    L_0x0047:
        r11 = r3.a;
        r12 = r12 + r11;
        r11 = r3.b(r12);
        r12 = r3.b;
        r10.a(r11, r12);
        goto L_0x006f;
    L_0x0054:
        r10 = new baoh;
        r10.<init>();
        r12 = 14;
        r12 = r3.a(r12);
        if (r12 == 0) goto L_0x006e;
    L_0x0061:
        r11 = r3.a;
        r12 = r12 + r11;
        r11 = r3.b(r12);
        r12 = r3.b;
        r10.a(r11, r12);
        goto L_0x006f;
    L_0x006e:
        r10 = r11;
    L_0x006f:
        r11 = 22;
        r11 = r3.a(r11);
        r12 = 0;
        if (r11 == 0) goto L_0x0082;
    L_0x0078:
        r13 = r3.b;
        r14 = r3.a;
        r11 = r11 + r14;
        r11 = r13.getInt(r11);
        goto L_0x0083;
    L_0x0082:
        r11 = 0;
    L_0x0083:
        r13 = 2;
        r14 = 1;
        if (r11 == r13) goto L_0x009a;
    L_0x0087:
        r13 = 3;
        if (r11 == r13) goto L_0x0092;
    L_0x008a:
        if (r10 == 0) goto L_0x008e;
    L_0x008c:
        r11 = 1;
        goto L_0x008f;
    L_0x008e:
        r11 = 0;
    L_0x008f:
        r13 = r11;
        r11 = 1;
        goto L_0x00ab;
    L_0x0092:
        if (r10 == 0) goto L_0x0096;
    L_0x0094:
        r11 = 1;
        goto L_0x0097;
    L_0x0096:
        r11 = 0;
    L_0x0097:
        r13 = r11;
        r11 = 0;
        goto L_0x00ab;
    L_0x009a:
        r11 = r7.booleanValue();
        r11 = r11 ^ r14;
        r13 = r7.booleanValue();
        if (r13 != 0) goto L_0x00aa;
    L_0x00a5:
        if (r10 != 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00aa;
    L_0x00a8:
        r13 = 1;
        goto L_0x00ab;
    L_0x00aa:
        r13 = 0;
    L_0x00ab:
        r7 = r7.booleanValue();
        if (r7 != 0) goto L_0x00f8;
    L_0x00b1:
        if (r13 == 0) goto L_0x00f8;
    L_0x00b3:
        r7 = defpackage.spy.a(r23);
        r7.a(r4);
        r7.a(r5);
        r7.a(r6);
        r14 = java.lang.Boolean.valueOf(r14);
        r14 = defpackage.spe.a(r3, r14);
        r7.a(r14);
        r7 = r7.c();
        r7 = (defpackage.spy) r7;
        r14 = new crd;
        r14.<init>();
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12);
        r7.a(r1, r2, r15, r14);
        r7 = new crd;
        r7.<init>();
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12);
        r8.a(r1, r2, r15, r7);
        r2 = r14.a;
        r8 = r7.a;
        if (r2 != r8) goto L_0x00f8;
    L_0x00ef:
        r2 = r14.b;
        r7 = r7.b;
        if (r2 == r7) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00f8;
    L_0x00f6:
        r11 = 0;
        r13 = 0;
    L_0x00f8:
        if (r13 == 0) goto L_0x016a;
    L_0x00fa:
        r2 = new anqy;
        r2.<init>(r12);
        r7 = r10.a();
        r15 = r2.a(r7);
        r16 = r10.b();
        r17 = r10.c();
        r18 = r10.d();
        r19 = defpackage.spe.a(r2, r10);
        r20 = defpackage.spe.b(r2, r10);
        r21 = r10.g();
        r14 = r2;
        r15 = defpackage.baoh.a(r14, r15, r16, r17, r18, r19, r20, r21);
        r16 = 0;
        r18 = 0;
        r19 = 0;
        r7 = defpackage.bapq.a(r14, r15, r16, r18, r19);
        r2.c(r7);
        r2 = r2.c();
        r2 = defpackage.bapq.a(r2);
        r7 = defpackage.spy.a(r23);
        r7.a(r4);
        r7.a(r5);
        r7.a(r6);
        r7.a(r2);
        r2 = 18;
        r2 = r3.a(r2);
        if (r2 == 0) goto L_0x0167;
    L_0x0151:
        r4 = r3.b;
        r3 = r3.a;
        r2 = r2 + r3;
        r2 = r4.get(r2);
        if (r2 != 0) goto L_0x015d;
    L_0x015c:
        goto L_0x0167;
    L_0x015d:
        if (r11 == 0) goto L_0x0167;
    L_0x015f:
        r2 = defpackage.spa.a(r23);
        r7.a(r2);
        r11 = 0;
    L_0x0167:
        r9.a(r7);
    L_0x016a:
        if (r11 == 0) goto L_0x0173;
    L_0x016c:
        r1 = defpackage.spa.a(r23);
        r9.a(r1);
    L_0x0173:
        r1 = r9.c();
        r1 = (defpackage.cls) r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spa.a(cmg, int, int):cma");
    }

    private static coj a(cmg cmg) {
        return cmm.a(cmg, 2076732558, new Object[]{cmg});
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 2076732558) {
            return null;
        } else {
            cmg cmg = (cmg) coj.c[0];
            if (cmg.h != null) {
                cmg.b(new spb(), "ExpandableTextComponentFlat.updateExpand");
            }
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        ((spc) crh2).a = ((spc) crh).a;
    }

    public final /* synthetic */ cma g() {
        spa spa = (spa) super.g();
        spa.e = new spc();
        return spa;
    }
}

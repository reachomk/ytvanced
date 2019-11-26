package defpackage;

/* renamed from: agtv */
public final class agtv implements xcp {
    private final zyw a;
    private final zzl b;
    private final bcaa c;
    private final bcaa d;
    private String e;
    private String f;
    private boolean g;

    public agtv(zyw zyw, zzl zzl, bcaa bcaa, bcaa bcaa2) {
        this.a = zyw;
        this.b = zzl;
        this.c = bcaa;
        this.d = bcaa2;
    }

    private final synchronized void a(ahkn ahkn) {
        String str = ahkn.e;
        aakj aakj = ahkn.b;
        if (!(str == null || aakj == null || str.equals(this.e))) {
            this.e = str;
            this.f = aakj.b();
            this.g = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARNING: Missing block: B:71:0x0147, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:73:0x0149, code skipped:
            return;
     */
    private final synchronized void a(defpackage.aetv r18) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r18;
        monitor-enter(r17);
        r2 = r1.b;	 Catch:{ all -> 0x014a }
        r2 = r2.b();	 Catch:{ all -> 0x014a }
        r2 = r2.h;	 Catch:{ all -> 0x014a }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        r2 = defpackage.avoa.w;	 Catch:{ all -> 0x014a }
    L_0x0011:
        r2 = r2.g;	 Catch:{ all -> 0x014a }
        if (r2 != 0) goto L_0x0017;
    L_0x0015:
        goto L_0x0148;
    L_0x0017:
        r2 = r1.e;	 Catch:{ all -> 0x014a }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x014a }
        if (r2 != 0) goto L_0x0148;
    L_0x001f:
        r2 = r1.f;	 Catch:{ all -> 0x014a }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x014a }
        if (r2 != 0) goto L_0x0148;
    L_0x0027:
        r2 = r1.g;	 Catch:{ all -> 0x014a }
        if (r2 != 0) goto L_0x0148;
    L_0x002b:
        r2 = r1.c;	 Catch:{ all -> 0x014a }
        r2 = r2.get();	 Catch:{ all -> 0x014a }
        r2 = (defpackage.agwc) r2;	 Catch:{ all -> 0x014a }
        r2 = r2.e();	 Catch:{ all -> 0x014a }
        if (r2 == 0) goto L_0x0148;
    L_0x0039:
        r2 = r1.c;	 Catch:{ all -> 0x014a }
        r2 = r2.get();	 Catch:{ all -> 0x014a }
        r2 = (defpackage.agwc) r2;	 Catch:{ all -> 0x014a }
        r2 = r2.b();	 Catch:{ all -> 0x014a }
        r3 = r2.k();	 Catch:{ all -> 0x014a }
        r4 = r1.f;	 Catch:{ all -> 0x014a }
        r3 = r3.a(r4);	 Catch:{ all -> 0x014a }
        if (r3 == 0) goto L_0x0146;
    L_0x0051:
        r4 = r3.u();	 Catch:{ all -> 0x014a }
        r5 = defpackage.agqs.PLAYABLE;	 Catch:{ all -> 0x014a }
        if (r4 == r5) goto L_0x0061;
    L_0x0059:
        r4 = r3.u();	 Catch:{ all -> 0x014a }
        r5 = defpackage.agqs.OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE;	 Catch:{ all -> 0x014a }
        if (r4 != r5) goto L_0x0146;
    L_0x0061:
        r4 = r2.p();	 Catch:{ all -> 0x014a }
        r5 = r1.f;	 Catch:{ all -> 0x014a }
        r6 = 0;
        r4 = r4.a(r5, r6);	 Catch:{ all -> 0x014a }
        if (r4 == 0) goto L_0x0144;
    L_0x006e:
        r5 = r0.c;	 Catch:{ all -> 0x014a }
        r0 = r0.b;	 Catch:{ all -> 0x014a }
        r6 = r17.a();	 Catch:{ all -> 0x014a }
        if (r6 == 0) goto L_0x0081;
    L_0x0078:
        r2 = r4.c();	 Catch:{ all -> 0x014a }
        r6 = r4.b();	 Catch:{ all -> 0x014a }
        goto L_0x00a2;
    L_0x0081:
        r6 = r2.j();	 Catch:{ all -> 0x014a }
        r6 = r6.a();	 Catch:{ all -> 0x014a }
        r7 = r1.b;	 Catch:{ all -> 0x014a }
        r6 = r4.b(r6, r7);	 Catch:{ all -> 0x014a }
        r2 = r2.j();	 Catch:{ all -> 0x014a }
        r2 = r2.a();	 Catch:{ all -> 0x014a }
        r7 = r1.b;	 Catch:{ all -> 0x014a }
        r2 = r4.a(r2, r7);	 Catch:{ all -> 0x014a }
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x00a2:
        if (r5 == 0) goto L_0x00b0;
    L_0x00a4:
        if (r2 == 0) goto L_0x00b0;
    L_0x00a6:
        r5 = r5.b();	 Catch:{ all -> 0x014a }
        r7 = r2.b();	 Catch:{ all -> 0x014a }
        if (r5 == r7) goto L_0x00c0;
    L_0x00b0:
        if (r0 == 0) goto L_0x0146;
    L_0x00b2:
        if (r6 == 0) goto L_0x0146;
    L_0x00b4:
        r0 = r0.b();	 Catch:{ all -> 0x014a }
        r5 = r6.b();	 Catch:{ all -> 0x014a }
        if (r0 == r5) goto L_0x00c0;
    L_0x00be:
        goto L_0x0146;
    L_0x00c0:
        r0 = defpackage.azfa.h;	 Catch:{ all -> 0x014a }
        r0 = r0.createBuilder();	 Catch:{ all -> 0x014a }
        r0 = (defpackage.azfd) r0;	 Catch:{ all -> 0x014a }
        r5 = r3.c;	 Catch:{ all -> 0x014a }
        r7 = r3.d;	 Catch:{ all -> 0x014a }
        r8 = -1;
        if (r5 == r8) goto L_0x00d6;
    L_0x00cf:
        if (r5 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00d6;
    L_0x00d2:
        r0.a(r5);	 Catch:{ all -> 0x014a }
        goto L_0x00e9;
    L_0x00d6:
        if (r7 != 0) goto L_0x00e2;
    L_0x00d8:
        r5 = defpackage.zzp.b;	 Catch:{ all -> 0x014a }
        r5 = defpackage.anvu.a(r5);	 Catch:{ all -> 0x014a }
        r0.a(r5);	 Catch:{ all -> 0x014a }
        goto L_0x00e9;
    L_0x00e2:
        r5 = defpackage.anvu.a(r7);	 Catch:{ all -> 0x014a }
        r0.a(r5);	 Catch:{ all -> 0x014a }
    L_0x00e9:
        r5 = r17.a();	 Catch:{ all -> 0x014a }
        r7 = 1;
        r8 = 0;
        if (r5 != 0) goto L_0x00f3;
    L_0x00f1:
        r15 = 0;
        goto L_0x0112;
    L_0x00f3:
        r5 = r4.b;	 Catch:{ all -> 0x014a }
        if (r5 != 0) goto L_0x00fe;
    L_0x00f7:
        r4 = r4.a;	 Catch:{ all -> 0x014a }
        r4 = r4.u();	 Catch:{ all -> 0x014a }
        goto L_0x0110;
    L_0x00fe:
        r5 = r5.u();	 Catch:{ all -> 0x014a }
        if (r5 != 0) goto L_0x0106;
    L_0x0104:
        r4 = 0;
        goto L_0x0110;
    L_0x0106:
        r4 = r4.a;	 Catch:{ all -> 0x014a }
        r4 = r4.u();	 Catch:{ all -> 0x014a }
        if (r4 != 0) goto L_0x010f;
    L_0x010e:
        goto L_0x0104;
    L_0x010f:
        r4 = 1;
    L_0x0110:
        r4 = r4 ^ r7;
        r15 = r4;
    L_0x0112:
        r4 = r1.d;	 Catch:{ all -> 0x014a }
        r4 = r4.get();	 Catch:{ all -> 0x014a }
        r9 = r4;
        r9 = (defpackage.agps) r9;	 Catch:{ all -> 0x014a }
        r10 = r1.e;	 Catch:{ all -> 0x014a }
        r3 = r3.m;	 Catch:{ all -> 0x014a }
        r11 = r3.a();	 Catch:{ all -> 0x014a }
        r0 = r0.build();	 Catch:{ all -> 0x014a }
        r0 = (defpackage.anxl) r0;	 Catch:{ all -> 0x014a }
        r12 = r0;
        r12 = (defpackage.azfa) r12;	 Catch:{ all -> 0x014a }
        if (r2 == 0) goto L_0x0134;
    L_0x012e:
        r0 = r2.b();	 Catch:{ all -> 0x014a }
        r13 = r0;
        goto L_0x0135;
    L_0x0134:
        r13 = 0;
    L_0x0135:
        if (r6 == 0) goto L_0x013d;
    L_0x0137:
        r8 = r6.b();	 Catch:{ all -> 0x014a }
        r14 = r8;
        goto L_0x013e;
    L_0x013d:
        r14 = 0;
    L_0x013e:
        r9.a(r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x014a }
        r1.g = r7;	 Catch:{ all -> 0x014a }
        goto L_0x0146;
    L_0x0144:
        monitor-exit(r17);
        return;
    L_0x0146:
        monitor-exit(r17);
        return;
    L_0x0148:
        monitor-exit(r17);
        return;
    L_0x014a:
        r0 = move-exception;
        monitor-exit(r17);
        goto L_0x014e;
    L_0x014d:
        throw r0;
    L_0x014e:
        goto L_0x014d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtv.a(aetv):void");
    }

    private final boolean a() {
        return ahda.b(this.a);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class, ahkn.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

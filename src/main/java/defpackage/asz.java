package defpackage;

/* renamed from: asz */
final class asz implements Runnable {
    private final /* synthetic */ ata a;

    asz(ata ata) {
        this.a = ata;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    public final void run() {
        /*
        r15 = this;
        r0 = r15.a;
        r1 = r0.b;
        if (r1 != 0) goto L_0x0008;
    L_0x0006:
        goto L_0x0125;
    L_0x0008:
        r1 = java.lang.System.currentTimeMillis();
        r3 = r0.y;
        r5 = -9223372036854775808;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0017;
    L_0x0014:
        r3 = r1 - r3;
        goto L_0x0019;
    L_0x0017:
        r3 = 0;
    L_0x0019:
        r7 = r0.p;
        r7 = r7.n;
        r8 = r0.x;
        if (r8 != 0) goto L_0x0028;
    L_0x0021:
        r8 = new android.graphics.Rect;
        r8.<init>();
        r0.x = r8;
    L_0x0028:
        r8 = r0.b;
        r8 = r8.a;
        r9 = r0.x;
        r7.b(r8, r9);
        r8 = r7.k();
        r9 = 0;
        r10 = 0;
        if (r8 == 0) goto L_0x007a;
    L_0x0039:
        r8 = r0.i;
        r11 = r0.g;
        r8 = r8 + r11;
        r8 = (int) r8;
        r11 = r0.x;
        r11 = r11.left;
        r11 = r8 - r11;
        r12 = r0.p;
        r12 = r12.getPaddingLeft();
        r11 = r11 - r12;
        r12 = r0.g;
        r13 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));
        if (r13 < 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0056;
    L_0x0053:
        if (r11 >= 0) goto L_0x0056;
    L_0x0055:
        goto L_0x007b;
    L_0x0056:
        r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x007a;
    L_0x005a:
        r11 = r0.b;
        r11 = r11.a;
        r11 = r11.getWidth();
        r8 = r8 + r11;
        r11 = r0.x;
        r11 = r11.right;
        r8 = r8 + r11;
        r11 = r0.p;
        r11 = r11.getWidth();
        r12 = r0.p;
        r12 = r12.getPaddingRight();
        r11 = r11 - r12;
        r8 = r8 - r11;
        if (r8 <= 0) goto L_0x007a;
    L_0x0078:
        r11 = r8;
        goto L_0x007b;
    L_0x007a:
        r11 = 0;
    L_0x007b:
        r7 = r7.l();
        if (r7 == 0) goto L_0x00c3;
    L_0x0081:
        r7 = r0.j;
        r8 = r0.h;
        r7 = r7 + r8;
        r7 = (int) r7;
        r8 = r0.x;
        r8 = r8.top;
        r8 = r7 - r8;
        r12 = r0.p;
        r12 = r12.getPaddingTop();
        r8 = r8 - r12;
        r12 = r0.h;
        r13 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));
        if (r13 < 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009f;
    L_0x009b:
        if (r8 >= 0) goto L_0x009f;
    L_0x009d:
        r13 = r8;
        goto L_0x00c4;
    L_0x009f:
        r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x00c3;
    L_0x00a3:
        r8 = r0.b;
        r8 = r8.a;
        r8 = r8.getHeight();
        r7 = r7 + r8;
        r8 = r0.x;
        r8 = r8.bottom;
        r7 = r7 + r8;
        r8 = r0.p;
        r8 = r8.getHeight();
        r9 = r0.p;
        r9 = r9.getPaddingBottom();
        r8 = r8 - r9;
        r7 = r7 - r8;
        if (r7 <= 0) goto L_0x00c3;
    L_0x00c1:
        r13 = r7;
        goto L_0x00c4;
    L_0x00c3:
        r13 = 0;
    L_0x00c4:
        if (r11 == 0) goto L_0x00dd;
    L_0x00c6:
        r7 = r0.l;
        r8 = r0.p;
        r9 = r0.b;
        r9 = r9.a;
        r9 = r9.getWidth();
        r10 = r0.p;
        r10.getWidth();
        r10 = r11;
        r11 = r3;
        r11 = r7.a(r8, r9, r10, r11);
    L_0x00dd:
        r14 = r11;
        if (r13 == 0) goto L_0x00f7;
    L_0x00e0:
        r7 = r0.l;
        r8 = r0.p;
        r9 = r0.b;
        r9 = r9.a;
        r9 = r9.getHeight();
        r10 = r0.p;
        r10.getHeight();
        r10 = r13;
        r11 = r3;
        r13 = r7.a(r8, r9, r10, r11);
    L_0x00f7:
        if (r14 == 0) goto L_0x00fa;
    L_0x00f9:
        goto L_0x00ff;
    L_0x00fa:
        if (r13 != 0) goto L_0x00ff;
    L_0x00fc:
        r0.y = r5;
        return;
    L_0x00ff:
        r3 = r0.y;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x0107;
    L_0x0105:
        r0.y = r1;
    L_0x0107:
        r0 = r0.p;
        r0.scrollBy(r14, r13);
        r0 = r15.a;
        r1 = r0.b;
        if (r1 == 0) goto L_0x0115;
    L_0x0112:
        r0.a(r1);
    L_0x0115:
        r0 = r15.a;
        r1 = r0.p;
        r0 = r0.q;
        r1.removeCallbacks(r0);
        r0 = r15.a;
        r0 = r0.p;
        defpackage.abe.a(r0, r15);
    L_0x0125:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asz.run():void");
    }
}

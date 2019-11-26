package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cvx */
public final class cvx {
    public final List a = new ArrayList();
    public cwh b;
    public cwa c;
    public int d;

    private cvx() {
    }

    public final cvy a(int i) {
        return (cvy) this.a.get(i);
    }

    public final int a() {
        return this.a.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Missing block: B:16:0x002e, code skipped:
            r8 = 0;
     */
    /* JADX WARNING: Missing block: B:17:0x002f, code skipped:
            r9 = 0;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            r10 = 0;
     */
    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            r11 = 0;
     */
    /* JADX WARNING: Missing block: B:20:0x0032, code skipped:
            r12 = 0;
     */
    /* JADX WARNING: Missing block: B:21:0x0033, code skipped:
            r13 = 0;
     */
    /* JADX WARNING: Missing block: B:29:0x0060, code skipped:
            r14.c = r1.a(new defpackage.cwa(r6, r7, r8, r9, r10, r11, r12, r13));
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return;
     */
    public final void a(defpackage.cvy r15) {
        /*
        r14 = this;
        r0 = r14.a;
        r0.add(r15);
        r0 = r15.a;
        r1 = -3;
        r2 = -1;
        r3 = 1;
        r4 = 0;
        if (r0 == r1) goto L_0x001d;
    L_0x000d:
        if (r0 == r2) goto L_0x001a;
    L_0x000f:
        if (r0 == r3) goto L_0x0018;
    L_0x0011:
        r1 = 3;
        if (r0 == r1) goto L_0x0016;
    L_0x0014:
        r6 = 0;
        goto L_0x0021;
    L_0x0016:
        r6 = -1;
        goto L_0x0021;
    L_0x0018:
        r6 = 1;
        goto L_0x0021;
    L_0x001a:
        r2 = r15.d;
        goto L_0x0020;
    L_0x001d:
        r1 = r15.d;
        r2 = -r1;
    L_0x0020:
        r6 = r2;
    L_0x0021:
        r1 = r14.d;
        r1 = r1 + r6;
        r14.d = r1;
        r1 = r14.c;
        if (r1 == 0) goto L_0x006c;
    L_0x002a:
        switch(r0) {
            case -3: goto L_0x0059;
            case -2: goto L_0x0050;
            case -1: goto L_0x004b;
            case 0: goto L_0x0041;
            case 1: goto L_0x003f;
            case 2: goto L_0x0039;
            case 3: goto L_0x0035;
            default: goto L_0x002d;
        };
    L_0x002d:
        r7 = 0;
    L_0x002e:
        r8 = 0;
    L_0x002f:
        r9 = 0;
    L_0x0030:
        r10 = 0;
    L_0x0031:
        r11 = 0;
    L_0x0032:
        r12 = 0;
    L_0x0033:
        r13 = 0;
        goto L_0x0060;
    L_0x0035:
        r7 = 0;
        r8 = 0;
        r9 = 1;
        goto L_0x0030;
    L_0x0039:
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 1;
        goto L_0x0032;
    L_0x003f:
        r7 = 1;
        goto L_0x002e;
    L_0x0041:
        r15 = r15.d;
        r13 = r15;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        goto L_0x0060;
    L_0x004b:
        r15 = r15.d;
        r8 = r15;
        r7 = 0;
        goto L_0x002f;
    L_0x0050:
        r15 = r15.d;
        r12 = r15;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        goto L_0x0033;
    L_0x0059:
        r15 = r15.d;
        r10 = r15;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        goto L_0x0031;
    L_0x0060:
        r15 = new cwa;
        r5 = r15;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13);
        r15 = r1.a(r15);
        r14.c = r15;
    L_0x006c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvx.a(cvy):void");
    }

    public static cvx a(cwh cwh) {
        return cvx.a(0, cwh);
    }

    static cvx a(int i, cwh cwh) {
        cvx cvx = new cvx();
        cvx.d = i;
        cvx.b = cwh;
        cvx.c = null;
        return cvx;
    }

    static cvx a(cvx cvx, cvx cvx2) {
        cwa cwa = null;
        cvx a = cvx.a(null);
        int i = 0;
        int i2 = cvx != null ? cvx.d : 0;
        if (cvx2 != null) {
            i = cvx2.d;
        }
        List list = a.a;
        cwa cwa2 = cvx != null ? cvx.c : null;
        if (cvx2 != null) {
            cwa = cvx2.c;
        }
        if (cvx != null) {
            for (cvy a2 : cvx.a) {
                list.add(cvy.a(a2));
            }
        }
        if (cvx2 != null) {
            for (cvy a3 : cvx2.a) {
                list.add(cvy.a(a3, i2));
            }
        }
        a.d = i2 + i;
        if (cwa2 == null) {
            cwa2 = cwa;
        } else if (cwa != null) {
            cwa2 = cwa2.a(cwa);
        }
        a.c = cwa2;
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        for (cvy cvy : this.a) {
            cvy.e = null;
            cvy.f = null;
            cvy.g = null;
            cvy.h = null;
        }
        this.a.clear();
        this.c = null;
        this.d = 0;
    }
}

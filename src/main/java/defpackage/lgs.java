package defpackage;

import android.text.TextUtils;

/* renamed from: lgs */
public final class lgs {
    public final enl a;

    public lgs(enl enl) {
        this.a = enl;
    }

    public static boolean a(aiqq aiqq, aikc aikc) {
        enm enm = (enm) aikb.a(aikc);
        if (enm != null) {
            String c = enm.e().c();
            if (!TextUtils.isEmpty(c) && TextUtils.equals(c, aiqq.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A:{RETURN} */
    public final defpackage.lgv a(defpackage.aizn r5, defpackage.aozk r6, defpackage.aikc r7) {
        /*
        r4 = this;
        r0 = 0;
        if (r6 != 0) goto L_0x0005;
    L_0x0003:
        goto L_0x0072;
    L_0x0005:
        r1 = r6.a;
        r2 = 114177671; // 0x6ce3687 float:7.756871E-35 double:5.6411265E-316;
        if (r1 != r2) goto L_0x0072;
    L_0x000c:
        r6 = r6.b;
        r6 = (defpackage.aozq) r6;
        r1 = r6.c;
        r2 = 0;
        if (r1 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0039;
    L_0x0016:
        if (r7 != 0) goto L_0x001a;
    L_0x0018:
        r1 = r0;
        goto L_0x0036;
    L_0x001a:
        r1 = r7.e();
        r1 = r1 + -1;
        r3 = r7.a(r2);
        r3 = defpackage.xty.a(r1, r2, r3);
        if (r3 == 0) goto L_0x0018;
    L_0x002a:
        r3 = defpackage.aizn.PREVIOUS;
        r1 = r7.a(r2, r1);
        r1 = (defpackage.enm) r1;
        r1 = defpackage.lgs.a(r3, r1);
    L_0x0036:
        if (r1 == 0) goto L_0x0039;
    L_0x0038:
        return r1;
    L_0x0039:
        r1 = r6.d;
        if (r1 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0061;
    L_0x003e:
        if (r7 == 0) goto L_0x005d;
    L_0x0040:
        r1 = r7.e();
        r1 = r1 + 1;
        r3 = r7.a(r2);
        r3 = defpackage.xty.a(r1, r2, r3);
        if (r3 == 0) goto L_0x005d;
    L_0x0050:
        r3 = defpackage.aizn.NEXT;
        r7 = r7.a(r2, r1);
        r7 = (defpackage.enm) r7;
        r7 = defpackage.lgs.a(r3, r7);
        goto L_0x005e;
    L_0x005d:
        r7 = r0;
    L_0x005e:
        if (r7 == 0) goto L_0x0061;
    L_0x0060:
        return r7;
    L_0x0061:
        r7 = r6.a;
        r7 = r7 & 1;
        if (r7 == 0) goto L_0x0072;
    L_0x0067:
        r6 = r6.b;
        if (r6 != 0) goto L_0x006d;
    L_0x006b:
        r6 = defpackage.apxu.d;
    L_0x006d:
        r5 = r4.a(r5, r6);
        return r5;
    L_0x0072:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgs.a(aizn, aozk, aikc):lgv");
    }

    public final lgv a(aizn aizn, apxu apxu) {
        return new lgv(aizn, this.a.a(apxu), 1);
    }

    public static lgv a(aizn aizn, enm enm) {
        return new lgv(aizn, enm, 2);
    }

    public static lgv b(aizn aizn, enm enm) {
        return new lgv(aizn, enm, 0);
    }
}

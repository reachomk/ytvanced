package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: yoc */
final class yoc {
    private static final long a = TimeUnit.MINUTES.toMicros(30);
    private static final long b = TimeUnit.DAYS.toMicros(1);
    private static final long c = TimeUnit.DAYS.toMicros(1);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    public static defpackage.ytv a(defpackage.yki r3, int r4, java.util.List r5, long r6) {
        /*
        r0 = r3 instanceof defpackage.ylf;
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        r3 = defpackage.ytv.SINGLE;
        return r3;
    L_0x0007:
        r3 = (defpackage.ylf) r3;
        r0 = 0;
        if (r4 == 0) goto L_0x001b;
    L_0x000c:
        r1 = r4 + -1;
        r1 = r5.get(r1);
        r1 = (defpackage.yki) r1;
        r2 = r1 instanceof defpackage.ylf;
        if (r2 == 0) goto L_0x001b;
    L_0x0018:
        r1 = (defpackage.ylf) r1;
        goto L_0x001c;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        r2 = r5.size();
        r2 = r2 + -1;
        if (r4 == r2) goto L_0x0033;
    L_0x0024:
        r4 = r4 + 1;
        r4 = r5.get(r4);
        r4 = (defpackage.yki) r4;
        r5 = r4 instanceof defpackage.ylf;
        if (r5 == 0) goto L_0x0033;
    L_0x0030:
        r0 = r4;
        r0 = (defpackage.ylf) r0;
    L_0x0033:
        r4 = defpackage.yoc.b(r3, r1, r6);
        r5 = defpackage.yoc.a(r3, r1, r6);
        r3 = defpackage.yoc.a(r3, r0, r6);
        if (r5 == 0) goto L_0x0047;
    L_0x0041:
        if (r3 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0047;
    L_0x0044:
        r3 = defpackage.ytv.BETWEEN;
        return r3;
    L_0x0047:
        if (r5 == 0) goto L_0x004c;
    L_0x0049:
        r3 = defpackage.ytv.LAST;
        return r3;
    L_0x004c:
        if (r3 == 0) goto L_0x0056;
    L_0x004e:
        if (r4 == 0) goto L_0x0053;
    L_0x0050:
        r3 = defpackage.ytv.FIRST;
        return r3;
    L_0x0053:
        r3 = defpackage.ytv.FIRST_WITH_TIMESTAMP;
        return r3;
    L_0x0056:
        if (r4 == 0) goto L_0x005b;
    L_0x0058:
        r3 = defpackage.ytv.SINGLE;
        return r3;
    L_0x005b:
        r3 = defpackage.ytv.SINGLE_WITH_TIMESTAMP;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoc.a(yki, int, java.util.List, long):ytv");
    }

    private static boolean a(ylf ylf, ylf ylf2, long j) {
        if (ylf2 != null && TextUtils.equals(ylf.getAuthorKey(), ylf2.getAuthorKey()) && yoc.b(ylf, ylf2, j)) {
            return true;
        }
        return false;
    }

    private static boolean b(ylf ylf, ylf ylf2, long j) {
        if (ylf2 != null) {
            if (j - ylf.g() < c) {
                j = a;
            } else {
                j = b;
            }
            if (Math.abs(ylf.g() - ylf2.g()) <= j) {
                return true;
            }
        }
        return false;
    }
}

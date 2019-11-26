package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: kpi */
public final class kpi {
    private static final ueq a = ueq.b();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    public static defpackage.kpl a(java.lang.String r6, defpackage.aywl r7) {
        /*
        r0 = r6.isEmpty();
        r1 = 2;
        r2 = 0;
        if (r0 != 0) goto L_0x0083;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r3 = r7.e;
        r3 = r3.size();
        if (r0 >= r3) goto L_0x007e;
    L_0x0011:
        r3 = r7.e;
        r3 = r3.get(r0);
        r3 = (defpackage.aywr) r3;
        r4 = r3.b;
        r5 = 1;
        if (r4 != r5) goto L_0x0027;
    L_0x001e:
        r4 = r3.c;
        r4 = (defpackage.aywp) r4;
        r4 = defpackage.kpi.a(r6, r4);
        goto L_0x0059;
    L_0x0027:
        if (r4 != r1) goto L_0x007b;
    L_0x0029:
        r4 = r3.c;
        r4 = (defpackage.aywn) r4;
        r4 = r4.b;
        r4 = defpackage.aywh.a(r4);
        if (r4 == 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0037;
    L_0x0036:
        r4 = 1;
    L_0x0037:
        r4 = r4 + -1;
        if (r4 == r5) goto L_0x004f;
    L_0x003b:
        if (r4 == r1) goto L_0x003e;
    L_0x003d:
        goto L_0x005c;
    L_0x003e:
        r4 = a;	 Catch:{ uer -> 0x004d }
        r4 = r4.a(r6, r2);	 Catch:{ uer -> 0x004d }
        r5 = a;	 Catch:{ uer -> 0x004d }
        r4 = r5.b(r4);	 Catch:{ uer -> 0x004d }
        if (r4 != 0) goto L_0x007b;
    L_0x004c:
        goto L_0x005c;
        goto L_0x005c;
    L_0x004f:
        r4 = android.util.Patterns.EMAIL_ADDRESS;
        r4 = r4.matcher(r6);
        r4 = r4.matches();
    L_0x0059:
        if (r4 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x007b;
    L_0x005c:
        r6 = r3.a;
        r6 = r6 & 4;
        if (r6 == 0) goto L_0x0069;
    L_0x0062:
        r6 = r3.d;
        if (r6 != 0) goto L_0x006a;
    L_0x0066:
        r6 = defpackage.arml.f;
        goto L_0x006a;
    L_0x0069:
        r6 = r2;
    L_0x006a:
        r7 = r3.a;
        r7 = r7 & 8;
        if (r7 == 0) goto L_0x0076;
    L_0x0070:
        r2 = r3.e;
        if (r2 != 0) goto L_0x0076;
    L_0x0074:
        r2 = defpackage.apxu.d;
    L_0x0076:
        r6 = defpackage.kpl.a(r6, r2);
        return r6;
    L_0x007b:
        r0 = r0 + 1;
        goto L_0x0009;
    L_0x007e:
        r6 = defpackage.kpl.d();
        return r6;
    L_0x0083:
        r6 = r7.b;
        if (r6 != 0) goto L_0x00a5;
    L_0x0087:
        r6 = r7.a;
        r6 = r6 & r1;
        if (r6 == 0) goto L_0x0093;
    L_0x008c:
        r6 = r7.c;
        if (r6 != 0) goto L_0x0094;
    L_0x0090:
        r6 = defpackage.arml.f;
        goto L_0x0094;
    L_0x0093:
        r6 = r2;
    L_0x0094:
        r0 = r7.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00a0;
    L_0x009a:
        r2 = r7.d;
        if (r2 != 0) goto L_0x00a0;
    L_0x009e:
        r2 = defpackage.apxu.d;
    L_0x00a0:
        r6 = defpackage.kpl.a(r6, r2);
        goto L_0x00a9;
    L_0x00a5:
        r6 = defpackage.kpl.d();
    L_0x00a9:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpi.a(java.lang.String, aywl):kpl");
    }

    private static boolean a(String str, aywp aywp) {
        int size = aywp.b.size();
        int a = aywj.a(aywp.c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                if (Pattern.compile((String) aywp.b.get(i2)).matcher(str).find()) {
                    i++;
                    if (a == 2 || a == 3) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (PatternSyntaxException unused) {
            }
        }
        if ((a != 2 || i <= 0) && !(a == 3 && i == 0)) {
            if (a != 4) {
                z = false;
            } else if (i < size) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}

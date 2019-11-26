package defpackage;

import java.util.Set;

/* renamed from: pev */
public final class pev {
    public final pgd a;
    public volatile Boolean b;
    private String c;
    private Set d;

    protected pev(pgd pgd) {
        pzr.a((Object) pgd);
        this.a = pgd;
    }

    public static boolean a() {
        return ((Boolean) pel.a.a).booleanValue();
    }

    public static long b() {
        return ((Long) pel.d.a).longValue();
    }

    public static long c() {
        return ((Long) pel.e.a).longValue();
    }

    public static int d() {
        return ((Integer) pel.g.a).intValue();
    }

    public static int e() {
        return ((Integer) pel.h.a).intValue();
    }

    public static String f() {
        return (String) pel.j.a;
    }

    public static String g() {
        return (String) pel.i.a;
    }

    public static String h() {
        return (String) pel.k.a;
    }

    /* JADX WARNING: Missing block: B:5:0x0013, code skipped:
            if (r1.equals(r0) != false) goto L_0x0038;
     */
    public final java.util.Set i() {
        /*
        r6 = this;
        r0 = defpackage.pel.s;
        r0 = r0.a;
        r0 = (java.lang.String) r0;
        r1 = r6.d;
        if (r1 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0015;
    L_0x000b:
        r1 = r6.c;
        if (r1 == 0) goto L_0x0015;
    L_0x000f:
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0038;
    L_0x0015:
        r1 = ",";
        r1 = android.text.TextUtils.split(r0, r1);
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = r1.length;
        r4 = 0;
    L_0x0022:
        if (r4 >= r3) goto L_0x0034;
    L_0x0024:
        r5 = r1[r4];
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0031 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NumberFormatException -> 0x0031 }
        r2.add(r5);	 Catch:{ NumberFormatException -> 0x0031 }
    L_0x0031:
        r4 = r4 + 1;
        goto L_0x0022;
    L_0x0034:
        r6.c = r0;
        r6.d = r2;
    L_0x0038:
        r0 = r6.d;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pev.i():java.util.Set");
    }
}

package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: oxw */
final class oxw extends oxf {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static File a(File file, int i, long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append(i);
        String str = ".";
        stringBuilder.append(str);
        stringBuilder.append(j);
        stringBuilder.append(str);
        stringBuilder.append(j2);
        stringBuilder.append(".v3.exo");
        return new File(file, stringBuilder.toString());
    }

    public static oxw a(String str, long j) {
        return new oxw(str, j, -1, -9223372036854775807L, null);
    }

    /* JADX WARNING: Missing block: B:6:0x002d, code skipped:
            if (r1 != null) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:11:0x0064, code skipped:
            if (r16.renameTo(r1) == false) goto L_0x0066;
     */
    public static defpackage.oxw a(java.io.File r16, long r17, long r19, defpackage.oxj r21) {
        /*
        r0 = r21;
        r1 = r16.getName();
        r2 = ".v3.exo";
        r2 = r1.endsWith(r2);
        r3 = 3;
        r4 = 2;
        r5 = 1;
        r6 = 0;
        if (r2 == 0) goto L_0x0015;
    L_0x0012:
        r15 = r16;
        goto L_0x006f;
    L_0x0015:
        r1 = r16.getName();
        r2 = h;
        r2 = r2.matcher(r1);
        r7 = r2.matches();
        if (r7 == 0) goto L_0x0030;
    L_0x0025:
        r1 = r2.group(r5);
        r1 = defpackage.ozp.i(r1);
        if (r1 == 0) goto L_0x0066;
    L_0x002f:
        goto L_0x0040;
    L_0x0030:
        r2 = g;
        r2 = r2.matcher(r1);
        r1 = r2.matches();
        if (r1 == 0) goto L_0x0066;
    L_0x003c:
        r1 = r2.group(r5);
    L_0x0040:
        r7 = r16.getParentFile();
        r1 = r0.a(r1);
        r8 = r1.a;
        r1 = r2.group(r4);
        r9 = java.lang.Long.parseLong(r1);
        r1 = r2.group(r3);
        r11 = java.lang.Long.parseLong(r1);
        r1 = defpackage.oxw.a(r7, r8, r9, r11);
        r2 = r16;
        r2 = r2.renameTo(r1);
        if (r2 != 0) goto L_0x0067;
    L_0x0066:
        r1 = r6;
    L_0x0067:
        if (r1 == 0) goto L_0x00b9;
    L_0x0069:
        r2 = r1.getName();
        r15 = r1;
        r1 = r2;
    L_0x006f:
        r2 = i;
        r1 = r2.matcher(r1);
        r2 = r1.matches();
        if (r2 == 0) goto L_0x00b9;
    L_0x007b:
        r2 = r1.group(r5);
        r2 = java.lang.Integer.parseInt(r2);
        r0 = r0.b;
        r0 = r0.get(r2);
        r8 = r0;
        r8 = (java.lang.String) r8;
        if (r8 == 0) goto L_0x00b9;
    L_0x008e:
        r9 = -1;
        r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1));
        if (r0 != 0) goto L_0x009a;
    L_0x0094:
        r9 = r15.length();
        r11 = r9;
        goto L_0x009c;
    L_0x009a:
        r11 = r17;
    L_0x009c:
        r9 = 0;
        r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r0 == 0) goto L_0x00b9;
    L_0x00a2:
        r0 = r1.group(r4);
        r9 = java.lang.Long.parseLong(r0);
        r0 = r1.group(r3);
        r13 = java.lang.Long.parseLong(r0);
        r0 = new oxw;
        r7 = r0;
        r7.<init>(r8, r9, r11, r13, r15);
        return r0;
    L_0x00b9:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxw.a(java.io.File, long, long, oxj):oxw");
    }

    public oxw(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }
}

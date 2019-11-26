package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: amjq */
public final class amjq {
    public static boolean a(amec amec) {
        int a = amee.a(amec.b);
        if (a == 0 || a != 2) {
            int a2 = amee.a(amec.b);
            if (a2 == 0 || a2 != 4) {
                return false;
            }
        }
        return true;
    }

    public static amec a() {
        ameb ameb = (ameb) amec.g.createBuilder();
        ameb.b(2);
        ameb.b(System.currentTimeMillis());
        return (amec) ((anxl) ameb.build());
    }

    public static amec a(long j, xsc xsc) {
        long a = xsc.a();
        ameb ameb = (ameb) amec.g.createBuilder();
        ameb.a(j + a);
        ameb.b(a);
        return (amec) ((anxl) ameb.build());
    }

    public static File a(amea amea) {
        if ((amea.b & 64) != 0) {
            File file = new File(amea.P);
            if (file.exists() || file.mkdir()) {
                return file;
            }
            throw new IOException("Could not create working directory.");
        }
        throw new IOException("Missing working directory in upload job proto.");
    }

    public static long b(amea amea) {
        amec amec = amea.K;
        if (amec == null) {
            amec = amec.g;
        }
        long j = amec.f;
        if (j == 0) {
            amec = amea.J;
            if (amec == null) {
                amec = amec.g;
            }
            j = amec.f;
        }
        if (j != 0) {
            return j;
        }
        amec amec2 = amea.I;
        if (amec2 == null) {
            amec2 = amec.g;
        }
        return amec2.f;
    }

    public static boolean a(amec amec, int i) {
        int a = amee.a(amec.b);
        if (a != 0 && a == 4) {
            int a2 = ayuc.a(amec.c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == i) {
                return true;
            }
        }
        return false;
    }

    public static amec a(int i) {
        ameb ameb = (ameb) amec.g.createBuilder();
        ameb.b(4);
        ameb.c(i);
        ameb.b(System.currentTimeMillis());
        return (amec) ((anxl) ameb.build());
    }

    public static amec a(int i, amec amec, List list, alys alys) {
        ameb ameb = (ameb) amec.g.createBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = (amec.a & 1) != 0 ? amec.d : 0;
        if (i2 < list.size()) {
            ameb.b(3);
            ameb.a(((Long) list.get(i2)).longValue() + currentTimeMillis);
            ameb.a(i2 + 1);
        } else {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Retry count exceeded. Reason[");
            stringBuilder.append(i - 1);
            stringBuilder.append("]");
            alys.a(stringBuilder.toString(), new Exception());
            ameb.b(4);
        }
        ameb.c(i);
        ameb.b(currentTimeMillis);
        return (amec) ((anxl) ameb.build());
    }

    /* JADX WARNING: Missing block: B:11:0x0021, code skipped:
            if (r0 == 22) goto L_0x0024;
     */
    /* JADX WARNING: Missing block: B:23:0x0042, code skipped:
            if (r0 == 22) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:35:0x0062, code skipped:
            if (r0 == 22) goto L_0x0066;
     */
    public static int c(defpackage.amea r3) {
        /*
        r0 = r3.I;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r0 = defpackage.amec.g;
    L_0x0006:
        r0 = r0.b;
        r0 = defpackage.amee.a(r0);
        r1 = 22;
        r2 = 4;
        if (r0 == 0) goto L_0x0024;
    L_0x0011:
        if (r0 != r2) goto L_0x0024;
    L_0x0013:
        r0 = r3.I;
        if (r0 != 0) goto L_0x0019;
    L_0x0017:
        r0 = defpackage.amec.g;
    L_0x0019:
        r0 = r0.c;
        r0 = defpackage.ayuc.a(r0);
        if (r0 == 0) goto L_0x0065;
    L_0x0021:
        if (r0 == r1) goto L_0x0024;
    L_0x0023:
        goto L_0x0065;
    L_0x0024:
        r0 = r3.J;
        if (r0 != 0) goto L_0x002a;
    L_0x0028:
        r0 = defpackage.amec.g;
    L_0x002a:
        r0 = r0.b;
        r0 = defpackage.amee.a(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0032:
        if (r0 != r2) goto L_0x0044;
    L_0x0034:
        r0 = r3.J;
        if (r0 != 0) goto L_0x003a;
    L_0x0038:
        r0 = defpackage.amec.g;
    L_0x003a:
        r0 = r0.c;
        r0 = defpackage.ayuc.a(r0);
        if (r0 == 0) goto L_0x0065;
    L_0x0042:
        if (r0 != r1) goto L_0x0065;
    L_0x0044:
        r0 = r3.K;
        if (r0 != 0) goto L_0x004a;
    L_0x0048:
        r0 = defpackage.amec.g;
    L_0x004a:
        r0 = r0.b;
        r0 = defpackage.amee.a(r0);
        if (r0 == 0) goto L_0x0066;
    L_0x0052:
        if (r0 != r2) goto L_0x0066;
    L_0x0054:
        r0 = r3.K;
        if (r0 != 0) goto L_0x005a;
    L_0x0058:
        r0 = defpackage.amec.g;
    L_0x005a:
        r0 = r0.c;
        r0 = defpackage.ayuc.a(r0);
        if (r0 == 0) goto L_0x0065;
    L_0x0062:
        if (r0 != r1) goto L_0x0065;
    L_0x0064:
        goto L_0x0066;
    L_0x0065:
        return r2;
    L_0x0066:
        r3 = r3.K;
        if (r3 != 0) goto L_0x006c;
    L_0x006a:
        r3 = defpackage.amec.g;
    L_0x006c:
        r3 = r3.b;
        r3 = defpackage.amee.a(r3);
        if (r3 == 0) goto L_0x0079;
    L_0x0074:
        r0 = 2;
        if (r3 == r0) goto L_0x0078;
    L_0x0077:
        goto L_0x0079;
    L_0x0078:
        return r0;
    L_0x0079:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amjq.c(amea):int");
    }
}

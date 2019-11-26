package defpackage;

import java.io.File;

/* renamed from: amfu */
public final class amfu extends amgh {
    private static final amul a = amul.a(Long.valueOf(1000), Long.valueOf(5000), Long.valueOf(30000), Long.valueOf(60000), Long.valueOf(300000));
    private final alys c;

    public amfu(alys alys, ambw ambw) {
        super(32, ambw);
        this.c = alys;
    }

    public final String a() {
        return "CacheCleanupTask";
    }

    public final amcj b() {
        return null;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        return true;
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.Q;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amft.a;
    }

    /* Access modifiers changed, original: final */
    public final anjv a(String str, amea amea) {
        return a(amea, true);
    }

    public final anjv a(String str, alyz alyz) {
        try {
            amea a = alyz.a(str);
            if (a == null) {
                return anjf.a(new amgl());
            }
            return a(a, false);
        } catch (alzc e) {
            return anjf.a(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        if (!(th instanceof SecurityException)) {
            return super.a(th, amea, z);
        }
        alys alys = this.c;
        String concat = "CacheCleanupTask".concat(" Deletion Failed");
        int a = amek.a(amea.h);
        if (a == 0) {
            a = 1;
        }
        alys.a(concat, th, a);
        return a(amjq.a(7), z);
    }

    private final anjv a(amea amea, boolean z) {
        int i = 0;
        if ((amea.b & 64) != 0) {
            File file = new File(amea.P);
            if (file.exists() && file.isDirectory()) {
                int i2;
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    i2 = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        if (!file2.delete()) {
                            String.valueOf(file2).length();
                            i2 = 1;
                        }
                        i++;
                    }
                } else {
                    String.valueOf(file).length();
                    i2 = 1;
                }
                i = i2 == 0 ? file.delete() ^ 1 : i2;
            }
        }
        if (amea.B.size() != 0) {
            for (String file3 : amea.B) {
                File file4 = new File(file3);
                if (file4.exists() && !file4.delete()) {
                    String.valueOf(file4).length();
                    i = 1;
                }
            }
        }
        if (i == 0) {
            return anjf.a(a(amjq.a(), z));
        }
        amec amec = amea.Q;
        if (amec == null) {
            amec = amec.g;
        }
        return anjf.a(a(amjq.a(7, amec, a, this.c), z));
    }
}

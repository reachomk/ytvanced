package defpackage;

import java.io.File;

/* renamed from: oxf */
public class oxf implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public oxf(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    public final boolean a() {
        return this.c == -1;
    }

    public final boolean b() {
        return this.d ^ 1;
    }

    /* renamed from: a */
    public final int compareTo(oxf oxf) {
        if (!this.a.equals(oxf.a)) {
            return this.a.compareTo(oxf.a);
        }
        int i;
        long j = this.b - oxf.b;
        if (j == 0) {
            i = 0;
        } else if (j < 0) {
            return -1;
        } else {
            i = 1;
        }
        return i;
    }
}

package defpackage;

import java.util.TreeSet;

/* renamed from: oxk */
final class oxk {
    public final int a;
    public final String b;
    public final TreeSet c;
    public oxp d;
    public boolean e;

    public oxk(int i, String str) {
        this(i, str, oxp.a);
    }

    public oxk(int i, String str, oxp oxp) {
        this.a = i;
        this.b = str;
        this.d = oxp;
        this.c = new TreeSet();
    }

    public final oxw a(long j) {
        oxw oxw = new oxw(this.b, j, -1, -9223372036854775807L, null);
        oxw = (oxw) this.c.floor(oxw);
        if (oxw != null && oxw.b + oxw.c > j) {
            return oxw;
        }
        oxw a;
        oxw = (oxw) this.c.ceiling(oxw);
        if (oxw == null) {
            a = oxw.a(this.b, j);
        } else {
            a = new oxw(this.b, j, oxw.b - j, -9223372036854775807L, null);
        }
        return a;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oxk oxk = (oxk) obj;
            return this.a == oxk.a && this.b.equals(oxk.b) && this.c.equals(oxk.c) && this.d.equals(oxk.d);
        }
    }
}

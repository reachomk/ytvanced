package defpackage;

import java.util.TreeSet;

/* renamed from: nxl */
final class nxl {
    public final int a;
    public final String b;
    public final TreeSet c;
    public oxp d;
    public boolean e;

    public nxl(int i, String str) {
        this(i, str, oxp.a);
    }

    public nxl(int i, String str, oxp oxp) {
        this.a = i;
        this.b = str;
        this.d = oxp;
        this.c = new TreeSet();
    }

    public final nxr a(long j) {
        nxr nxr = new nxr(this.b, j, -1, -9223372036854775807L, null);
        nxr = (nxr) this.c.floor(nxr);
        if (nxr != null && nxr.b + nxr.c > j) {
            return nxr;
        }
        nxr a;
        nxr = (nxr) this.c.ceiling(nxr);
        if (nxr == null) {
            a = nxr.a(this.b, j);
        } else {
            a = new nxr(this.b, j, nxr.b - j, -9223372036854775807L, null);
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
            nxl nxl = (nxl) obj;
            return this.a == nxl.a && this.b.equals(nxl.b) && this.c.equals(nxl.c) && this.d.equals(nxl.d);
        }
    }
}

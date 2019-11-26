package defpackage;

import android.net.Uri;

/* renamed from: npj */
public final class npj {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public npj(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.c = str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(nxg.a(str, this.c));
    }

    public final String b(String str) {
        return nxg.a(str, this.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            npj npj = (npj) obj;
            return this.a == npj.a && this.b == npj.b && this.c.equals(npj.c);
        }
    }
}

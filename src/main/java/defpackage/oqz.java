package defpackage;

import android.net.Uri;

/* renamed from: oqz */
public final class oqz {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public oqz(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.c = str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(ozq.a(str, this.c));
    }

    private final String b(String str) {
        return ozq.a(str, this.c);
    }

    public final oqz a(oqz oqz, String str) {
        String b = b(str);
        if (oqz != null && b.equals(oqz.b(str))) {
            long j;
            long j2 = this.b;
            long j3 = -1;
            if (j2 != -1) {
                j = this.a;
                if (j + j2 == oqz.a) {
                    long j4 = oqz.b;
                    if (j4 != -1) {
                        j3 = j2 + j4;
                    }
                    return new oqz(b, j, j3);
                }
            }
            j = oqz.b;
            if (j != -1) {
                long j5 = oqz.a;
                if (j5 + j == this.a) {
                    if (j2 != -1) {
                        j3 = j + j2;
                    }
                    return new oqz(b, j5, j3);
                }
            }
        }
        return null;
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
            oqz oqz = (oqz) obj;
            return this.a == oqz.a && this.b == oqz.b && this.c.equals(oqz.c);
        }
    }

    public final String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 81);
        stringBuilder.append("RangedUri(referenceUri=");
        stringBuilder.append(str);
        stringBuilder.append(", start=");
        stringBuilder.append(j);
        stringBuilder.append(", length=");
        stringBuilder.append(j2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

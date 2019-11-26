package defpackage;

import android.text.TextUtils;

/* renamed from: ajqj */
public final class ajqj {
    public final long a;
    public final long b;
    public final boolean c;
    public final ajnd d;

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        boolean z = this.c;
        StringBuilder stringBuilder = new StringBuilder(103);
        stringBuilder.append("(startPos: ");
        stringBuilder.append(j);
        stringBuilder.append(", transitionNextPosMillis: ");
        stringBuilder.append(j2);
        stringBuilder.append(", transitionAtEnd: ");
        stringBuilder.append(z);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    ajqj(ajnd ajnd, long j, long j2, boolean z) {
        this.d = ajnd;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((((((int) (j >> 32)) + 527) * 31) + ((int) j)) * 31) + this.d.l().hashCode()) * 31) + (!this.c ? 1237 : 1231);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ajqj.class) {
            ajqj ajqj = (ajqj) obj;
            if (this.b == ajqj.b && TextUtils.equals(this.d.l(), ajqj.d.l())) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        return this.d.l();
    }

    public final aakj b() {
        return this.d.m();
    }
}

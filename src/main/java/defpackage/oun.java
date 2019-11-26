package defpackage;

import java.util.Arrays;

/* renamed from: oun */
public final class oun {
    public final int a;
    private final oum[] b;
    private int c;

    public oun(oum... oumArr) {
        this.b = oumArr;
        this.a = oumArr.length;
    }

    public final oum a(int i) {
        return this.b[i];
    }

    public final oum[] a() {
        return (oum[]) this.b.clone();
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.b) + 527;
        this.c = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((oun) obj).b);
    }
}

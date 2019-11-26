package defpackage;

import java.util.Arrays;

/* renamed from: aiqy */
public final class aiqy {
    public final int a;

    public aiqy(int i) {
        this.a = i;
    }

    public static aiqy a() {
        return new aiqy();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aiqy) && this.a == ((aiqy) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public aiqy() {
        this.a = airb.a(1);
    }

    public aiqy(int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= airb.a(iArr[i2]);
        }
        this.a = i;
    }

    public final boolean b() {
        return (this.a & airb.a(2)) != 0;
    }
}

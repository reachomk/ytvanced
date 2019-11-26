package defpackage;

import java.util.Arrays;

/* renamed from: abij */
public final class abij {
    public final boolean a;
    public final boolean b;

    public abij(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abij) {
            abij abij = (abij) obj;
            if (this.a == abij.a && this.b == abij.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}

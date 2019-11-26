package defpackage;

import java.util.Arrays;

/* renamed from: uyw */
public final class uyw {
    public final uyz a;
    public final boolean b;
    public final apxu c;

    public uyw(uyz uyz, boolean z) {
        this(uyz, z, null);
    }

    public uyw(uyz uyz, boolean z, apxu apxu) {
        this.a = uyz;
        this.b = z;
        this.c = apxu;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uyw) {
            uyw uyw = (uyw) obj;
            if (this.b == uyw.b && this.a == uyw.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }
}

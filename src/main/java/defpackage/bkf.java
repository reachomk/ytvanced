package defpackage;

import java.util.Arrays;

/* renamed from: bkf */
public final class bkf {
    public final Object a;
    public final Throwable b;

    public bkf(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public bkf(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bkf) {
            bkf bkf = (bkf) obj;
            Object obj2 = this.a;
            if (obj2 != null && obj2.equals(bkf.a)) {
                return true;
            }
            Throwable th = this.b;
            if (!(th == null || bkf.b == null)) {
                return th.toString().equals(this.b.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

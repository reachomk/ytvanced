package defpackage;

import android.text.TextUtils;

/* renamed from: otz */
final class otz {
    public final int a;
    public final int b;
    public final String c;

    public otz(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            otz otz = (otz) obj;
            return this.a == otz.a && this.b == otz.b && TextUtils.equals(this.c, otz.c);
        }
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }
}

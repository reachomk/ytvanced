package defpackage;

import android.text.TextUtils;

/* renamed from: ola */
final class ola {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ola(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 1237;
        int hashCode = ((((str != null ? str.hashCode() : 0) + 31) * 31) + (!this.b ? 1237 : 1231)) * 31;
        if (this.c) {
            i = 1231;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == ola.class) {
            ola ola = (ola) obj;
            return TextUtils.equals(this.a, ola.a) && this.b == ola.b && this.c == ola.c;
        }
    }
}

package defpackage;

import android.text.TextUtils;

/* renamed from: nmn */
final class nmn {
    public final String a;
    public final boolean b;

    public nmn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + 31) * 31) + (!this.b ? 1237 : 1231);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == nmn.class) {
            nmn nmn = (nmn) obj;
            return TextUtils.equals(this.a, nmn.a) && this.b == nmn.b;
        }
    }
}

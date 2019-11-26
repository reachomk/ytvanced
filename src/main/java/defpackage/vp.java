package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: vp */
class vp implements vn {
    private final String a;
    private final int b;
    private final int c;

    vp(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vp) {
            vp vpVar = (vp) obj;
            return (this.b == -1 || vpVar.b == -1) ? TextUtils.equals(this.a, vpVar.a) && this.c == vpVar.c : TextUtils.equals(this.a, vpVar.a) && this.b == vpVar.b && this.c == vpVar.c;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}

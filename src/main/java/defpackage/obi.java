package defpackage;

import android.media.AudioAttributes;

/* renamed from: obi */
public final class obi {
    public static final obi a = new obh().a();
    public final int b;
    public final int c = 0;
    public final int d;
    public AudioAttributes e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            obi obi = (obi) obj;
            return this.b == obi.b && this.d == obi.d;
        }
    }

    public final int hashCode() {
        return ((this.b + 527) * 961) + this.d;
    }

    /* synthetic */ obi(int i, int i2) {
        this.b = i;
        this.d = i2;
    }
}

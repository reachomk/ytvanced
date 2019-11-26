package defpackage;

import android.graphics.Bitmap.Config;

/* renamed from: bwu */
final class bwu implements bwp {
    public int a;
    public Config b;
    private final bwt c;

    public bwu(bwt bwt) {
        this.c = bwt;
    }

    public final void a() {
        this.c.a(this);
    }

    public final String toString() {
        return bws.a(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bwu) {
            bwu bwu = (bwu) obj;
            if (this.a == bwu.a && chv.a(this.b, bwu.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }
}

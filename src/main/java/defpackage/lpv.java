package defpackage;

import android.graphics.Rect;

/* renamed from: lpv */
public final class lpv implements lps {
    private static final Rect b = new Rect();
    public lps a;
    private final lli c;
    private final lpu d;

    public lpv(lli lli, lpu lpu) {
        this.c = lli;
        this.d = lpu;
    }

    public final Rect c() {
        lps lps = this.a;
        return lps == null ? b : lps.c();
    }

    public final float d() {
        lps lps = this.a;
        return lps != null ? lps.d() : 0.0f;
    }

    public final boolean e() {
        boolean z = true;
        if (!this.d.a()) {
            lps lps = this.a;
            if (lps != null) {
                z = lps.e();
            } else if (!(this.c.aF_() || this.c.b())) {
                return false;
            }
        }
        return z;
    }
}

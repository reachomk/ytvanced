package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: agf */
final class agf extends ago {
    public zr a;
    public aaf b;

    agf(agf agf, agd agd, Resources resources) {
        super(agf, agd, resources);
        if (agf != null) {
            this.a = agf.a;
            this.b = agf.b;
            return;
        }
        this.a = new zr();
        this.b = new aaf();
    }

    public static long a(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = (zr) this.a.clone();
        this.b = (aaf) this.b.clone();
    }

    /* Access modifiers changed, original: final */
    public final int a(int i, int i2, Drawable drawable, boolean z) {
        int a = super.a(drawable);
        long a2 = agf.a(i, i2);
        long j = !z ? 0 : 8589934592L;
        long j2 = (long) a;
        this.a.c(a2, Long.valueOf(j2 | j));
        if (z) {
            this.a.c(agf.a(i2, i), Long.valueOf((4294967296L | j2) | j));
        }
        return a;
    }

    /* Access modifiers changed, original: final */
    public final int a(int[] iArr) {
        int b = super.b(iArr);
        return b < 0 ? super.b(StateSet.WILD_CARD) : b;
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        return i >= 0 ? ((Integer) this.b.a(i, Integer.valueOf(0))).intValue() : 0;
    }

    public final Drawable newDrawable() {
        return new agd(this, null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new agd(this, resources);
    }
}

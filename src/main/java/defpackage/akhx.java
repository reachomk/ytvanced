package defpackage;

import android.support.rastermill.FrameSequenceDrawable;

/* renamed from: akhx */
public final class akhx {
    public final afnw a;
    public final sxd b;
    public final azsr c;
    public final azsr d;
    public FrameSequenceDrawable e;
    public final swf f;
    public final bbma g;
    private final bdhi h;

    public akhx(afnw afnw, sxd sxd, azsr azsr, azsr azsr2, swf swf, bbma bbma, bdhi bdhi) {
        this.a = afnw;
        this.b = sxd;
        this.c = azsr;
        this.d = azsr2;
        this.f = swf;
        this.g = bbma;
        this.h = bdhi;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akhx)) {
            return false;
        }
        return this.h.equals(((akhx) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}

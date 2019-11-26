package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: svz */
final class svz extends cgo {
    private final crd d;
    private final bdhi e;
    private final sxh f;
    private final bdhi g;
    private final bdhi h;

    public final void b(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.a((ImageView) this.c);
        }
        bdhi bdhi = this.g;
        if (bdhi != null) {
            ((ImageView) this.c).setScaleType(swa.a(bdhi.b));
            drawable = svz.a(drawable, this.g);
        }
        super.b(drawable);
    }

    public final void c(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.d((ImageView) this.c);
        }
        bdhi bdhi = this.h;
        if (bdhi != null) {
            ((ImageView) this.c).setScaleType(swa.a(bdhi.b));
            drawable = svz.a(drawable, this.h);
        }
        super.c(drawable);
    }

    public final void a(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.b((ImageView) this.c);
        }
        bdhi bdhi = this.g;
        if (bdhi != null) {
            ((ImageView) this.c).setScaleType(swa.a(bdhi.b));
            drawable = svz.a(drawable, this.g);
        }
        super.a(drawable);
    }

    public final void a(cgr cgr) {
        crd crd = this.d;
        cgr.a(crd.a, crd.b);
    }

    private static Drawable a(Drawable drawable, bdhi bdhi) {
        if (drawable != null) {
            bdhk[] bdhkArr = bdhi.a;
            if (bdhkArr.length != 0) {
                int i = 0;
                if (bdhkArr[0].d() && bdhi.a[0].c().b != 0) {
                    drawable = st.d(drawable).mutate();
                    if (bdhi.a[0].d()) {
                        i = bdhi.a[0].c().b;
                    }
                    st.a(drawable, i);
                }
            }
        }
        return drawable;
    }

    /* synthetic */ svz(crd crd, ImageView imageView, bdhi bdhi, sxh sxh, bdhi bdhi2, bdhi bdhi3) {
        super(imageView);
        this.d = crd;
        this.e = bdhi;
        this.f = sxh;
        this.g = bdhi2;
        this.h = bdhi3;
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: svy */
final class svy extends cgo {
    private final crd d;
    private final bapb e;
    private final sxh f;
    private final bapb g;
    private final bapb h;

    public final void b(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.a((ImageView) this.c);
        }
        bapb bapb = this.g;
        if (bapb != null) {
            ((ImageView) this.c).setScaleType(svv.a(bapb.b()));
            drawable = svy.a(drawable, this.g);
        }
        super.b(drawable);
    }

    public final void c(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.d((ImageView) this.c);
        }
        bapb bapb = this.h;
        if (bapb != null) {
            ((ImageView) this.c).setScaleType(svv.a(bapb.b()));
            drawable = svy.a(drawable, this.h);
        }
        super.c(drawable);
    }

    public final void a(Drawable drawable) {
        sxh sxh = this.f;
        if (sxh != null) {
            sxh.b((ImageView) this.c);
        }
        bapb bapb = this.g;
        if (bapb != null) {
            ((ImageView) this.c).setScaleType(svv.a(bapb.b()));
            drawable = svy.a(drawable, this.g);
        }
        super.a(drawable);
    }

    public final void a(cgr cgr) {
        crd crd = this.d;
        cgr.a(crd.a, crd.b);
    }

    private static Drawable a(Drawable drawable, bapb bapb) {
        if (!(drawable == null || bapb.a() == 0)) {
            int i = 0;
            if (!(bapb.g(0).b() == null || bapb.g(0).b().a() == 0)) {
                drawable = st.d(drawable).mutate();
                if (bapb.g(0).b() != null) {
                    i = (int) bapb.g(0).b().a();
                }
                st.a(drawable, i);
            }
        }
        return drawable;
    }

    /* synthetic */ svy(crd crd, ImageView imageView, bapb bapb, sxh sxh, bapb bapb2, bapb bapb3) {
        super(imageView);
        this.d = crd;
        this.e = bapb;
        this.f = sxh;
        this.g = bapb2;
        this.h = bapb3;
    }
}

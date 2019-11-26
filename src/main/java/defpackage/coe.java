package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: coe */
public final class coe extends cma {
    private final cvu a;
    private int b;
    private int c;

    public coe(cvu cvu) {
        super("DrawableComponent");
        this.a = cvu;
    }

    public final int A() {
        return 2;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean t() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        this.b = cmn.a();
        this.c = cmn.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new cpw();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        cpw cpw = (cpw) obj;
        Context context = cmg.b;
        Drawable drawable = (Drawable) cvu.a(this.a);
        Drawable drawable2 = cpw.a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                cpw.a(false, false);
                cpw.a.setCallback(null);
            }
            cpw.a = drawable;
            if (cpw.a != null) {
                cpw.a(cpw.isVisible(), false);
                cpw.a.setCallback(cpw);
            }
            cpw.b = null;
            cpw.c = cpw.a instanceof InsetDrawable;
            cpw.invalidateSelf();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg, Object obj) {
        ((cpw) obj).a(this.b, this.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        cpw cpw = (cpw) obj;
        if (cpw.a != null) {
            cpw.a(false, false);
            cpw.a.setCallback(null);
        }
        cpw.a = null;
        cpw.b = null;
        cpw.c = false;
        cpw.e = 0;
        cpw.d = 0;
        Context context = cmg.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        return cvu.a(((coe) cma).a, ((coe) cma2).a);
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        return this.a.equals(((coe) cma).a);
    }
}
